package com.lgh.controller;

public class TicketController {
    public static void main(String[] args) {
        //TODO A6 创建5个线程(窗口)卖票
        for (int i = 1; i <=5 ; i++) {
            MyThread myThread = new MyThread();
            myThread.MyThread("窗口"+i);

            //TODO A7 启动线程(窗口)卖票
            myThread.start();
        }
    }
}
