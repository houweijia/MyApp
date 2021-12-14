package com.veigar.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: houwj
 * @date: 2020/8/12
 */
public class JavaClass {
    public static void main(String[] args) {
        UtilsKtKt.foo();
        UtilsKtInner utilsKtInner = new UtilsKtInner();
        utilsKtInner.foo1();
        //Test.INSTANCE.sayMessage();
        //Test.INSTANCE.sayMessage();

        List<String> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        list1.add(1);

        String str = "abcdesda3";
        System.out.println(str.charAt(2));




    }


    public static String in = "in";

    void demo(Source<String> strs){
        //Source<Object> objectSource = strs;
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int i = 0, len = Math.min(strs[0].length(), strs[strs.length - 1].length());
        while (i < len && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) i++;
        return strs[0].substring(0, i);
    }

}
