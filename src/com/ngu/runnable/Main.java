package com.ngu.runnable;

import com.ngu.runnable.demo1.MyRunnable;
import com.ngu.runnable.demo1.MyThread;

/**
 * @Author: 李良超
 * @Date: Created in 2019/4/25 22:58
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Runnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        System.out.println("主进程进入终结状态");
    }
}
