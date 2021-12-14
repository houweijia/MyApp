package com.veigar.lib;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;


/**
 * @description:
 * @author: houwj
 * @date: 2020/8/11
 */
public class Test2 {
    public static void main(String[] args) {
        int aHundredMillion = 10000000;

//        Map<Integer, Integer> map = new HashMap<>();
//
//        long s1 = System.currentTimeMillis();
//        for (int i = 0; i < aHundredMillion; i++) {
//            map.put(i, i);
//        }
//        long s2 = System.currentTimeMillis();
//
//        //9633 8493 7699 8233 8139
//        System.out.println("未初始化容量，耗时 ： " + (s2 - s1));
//
//
//        Map<Integer, Integer> map1 = new HashMap<>(aHundredMillion / 2);
//
//        long s5 = System.currentTimeMillis();
//        for (int i = 0; i < aHundredMillion; i++) {
//            map1.put(i, i);
//        }
//        long s6 = System.currentTimeMillis();
//        // 7513 8039 7657 8279 8021
//        System.out.println("初始化容量5000000，耗时 ： " + (s6 - s5));

//
//
//        Map<Integer, Integer> map2 = new HashMap<>(aHundredMillion);
//
//        long s3 = System.currentTimeMillis();
//        for (int i = 0; i < aHundredMillion; i++) {
//            map2.put(i, i);
//        }
//        long s4 = System.currentTimeMillis();
//        //9321 8942 8699 9110 9050
//        System.out.println("初始化容量为10000000，耗时 ： " + (s4 - s3));
//       // test();


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2");
            }
        };
        System.out.println("开始");
        final CountDownLatch writtenToDiskLatch = new CountDownLatch(1);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                writtenToDiskLatch.countDown();

            }
        };
        new Thread(runnable1).start();
        try {
            writtenToDiskLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");

        int size = 20;
        int a = size >> 1;
        System.out.println("a==="+a);

        int b = 0;
        int c = 0;
        long time1 = System.currentTimeMillis();

        for (long i = 0 ;i<1000000000;i++){
            b+= 999999999/2;
        }
        System.out.println( System.currentTimeMillis()-time1);

        long time2 = System.currentTimeMillis();

        for (long i = 0 ;i<1000000000;i++){
             c+= 999999999>>1;
        }
        System.out.println( System.currentTimeMillis()-time2);

    }

    private void test(){
        Zi zi = new Zi();
    }


    class Zi extends Fu{

        private void test(){
            System.out.println(this.num);
        }
    }

    class Fu{
        int num = 4;
    }
}
