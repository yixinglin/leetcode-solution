// https://blog.csdn.net/qq_35854212/article/details/105790986
// https://juejin.cn/post/6844904033690320909
// 要求线程a执行完才开始线程b, 线程b执行完才开始线程c

package org.example.multithreading;


public class PrintInOrder  {

    public static class PrintThread extends Thread {
        String id;
        public PrintThread(String id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(this.id);
        }
    }


    public static void main(String[] args) {
        PrintThread t1 =  new PrintThread("A");
        PrintThread t2 =  new PrintThread("B");
        PrintThread t3 =  new PrintThread("C");
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
