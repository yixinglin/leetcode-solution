package org.example.multithreading;

import java.util.concurrent.locks.LockSupport;

// https://blog.csdn.net/qq_35854212/article/details/105790986
// 写两个线程，一个线程打印1~ 52，另一个线程打印A~Z，打印顺序是12A34B…5152Z
public class TurnPrint2 {

    public static class Runnable1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(i+1);
                if((i+1) % 2 == 0) { //  2, 5, 8, ...
                    LockSupport.unpark(t2);
                    LockSupport.park();
                }
            }
        }
    }

    public static class Runnable2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 26; i++) {
                LockSupport.park();
                System.out.println((char) ('A' + i));
                LockSupport.unpark(t1);
            }
        }
    }

    public static Thread t1, t2;
    public static void main(String[] args) {
        t1 = new Thread(new Runnable1());
        t2 = new Thread(new Runnable2());
        t1.start();
        t2.start();
    }
}
