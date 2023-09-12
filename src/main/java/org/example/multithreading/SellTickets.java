package org.example.multithreading;
// https://zhuanlan.zhihu.com/p/252674317
// 实现多个窗口卖票系统
// 火车站要售票，我们模拟火车站的售票过程。假设正值春运时期，西安到兰州的动车票只有 30 张（西安火车站窗口只能卖30张票）。
// 我们采用线程对象来模拟火车站的售票窗口，实现多个窗口同时卖火车票， 采用 Runnable 接口子类来模拟票数。

public class SellTickets {

    public static class TicketWindow implements Runnable {
        static Integer numTickets = 30;
        static Object lock = new Object();
        // static Object lock = new Object();
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e);
                }

                synchronized (lock) {
                    if (numTickets > 0) {
                            numTickets--;
                            System.out.println(String.format("%s: %d", Thread.currentThread().getName(), this.numTickets));
                    } else {
                        System.out.println("No tickets available anymore!!");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketWindow(), "Window 1");
        Thread t2 = new Thread(new TicketWindow(), "Window 2");
        Thread t3 = new Thread(new TicketWindow(), "Window 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
