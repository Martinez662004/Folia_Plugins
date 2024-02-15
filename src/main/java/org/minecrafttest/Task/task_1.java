package org.minecrafttest.Task;

public class task_1 implements Runnable{

    private static final task_1 instance = new task_1();
    @Override
    public void run() {

    }

    public static task_1 getInstance() {
        return instance;
    }
}
