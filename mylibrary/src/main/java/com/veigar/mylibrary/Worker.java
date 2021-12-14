package com.veigar.mylibrary;

public final class Worker extends Thread {
    private Runnable task;

    private Thread thread;
    /**
     * true --> 创建新的线程执行
     * false --> 从队列里获取线程执行
     */
    private boolean isNewTask;

    public Worker(Runnable task, boolean isNewTask) {
        this.task = task;
        this.isNewTask = isNewTask;
        thread = this;
    }

    public void startTask(){
        if(thread!=null){
            thread.start();
        }
    }
}
