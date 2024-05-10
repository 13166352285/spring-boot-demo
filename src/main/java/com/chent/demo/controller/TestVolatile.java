package com.chent.demo.controller;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author chentian
 * @Date 2024/5/6
 */
public class TestVolatile {
    private static volatile boolean  stop = false;

    public static void main(String[] args) {
        // Thread-A
        new Thread("Thread A") {
            @Override
            public void run() {
                while (!stop) {
                }
                System.out.println(Thread.currentThread() + "stopped");
            }
        }.start();
        // Thread-main
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread() + "after 1 seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;

    }
}
