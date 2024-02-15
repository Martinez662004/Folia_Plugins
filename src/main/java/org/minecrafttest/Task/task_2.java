package org.minecrafttest.Task;

public class task_2 implements Runnable{

    private static final task_2 instance = new task_2();
    @Override
    public void run() {

    }

    public static task_2 getInstance() {
        return instance;
    }
}
