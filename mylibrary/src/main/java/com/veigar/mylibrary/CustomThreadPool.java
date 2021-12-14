package com.veigar.mylibrary;

import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class CustomThreadPool {
    /**
     * 最小线程数，也叫核心线程数
     */
    private volatile int miniSize;

    /**
     * 最大线程数
     */
    private volatile int maxSize;

    /**
     * 线程需要被回收的时间
     */
    private long keepAliveTime;
    private TimeUnit unit;

    /**
     * 存放线程的阻塞队列
     */
    private BlockingQueue<Runnable> workQueue;

    /**
     * 存放线程池
     */
    private volatile Set<Worker> workers;

    /**
     * 是否关闭线程池标志
     */
    private AtomicBoolean isShutDown = new AtomicBoolean(false);

    /**
     * 提交到线程池中的任务总数
     */
    private AtomicInteger totalTask = new AtomicInteger();

    /**
     * 线程池任务全部执行完毕后的通知组件
     */
    private Object shutDownNotify = new Object();

    private Notify notify;

    public CustomThreadPool(int miniSize, int maxSize, long keepAliveTime,
                            TimeUnit unit, BlockingQueue<Runnable> workQueue, Notify notify){
        this.miniSize = miniSize;
        this.maxSize = maxSize;
        this.keepAliveTime = keepAliveTime;
        this.unit = unit;
        this.workQueue = workQueue;
        this.notify = notify;

        workers = new ConcurrentHashSet<>();
    }
}
