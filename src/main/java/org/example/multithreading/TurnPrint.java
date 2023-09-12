package org.example.multithreading;
// https://www.jianshu.com/p/e4ab42807314

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;

public class TurnPrint {

    public static class PrintThread extends Thread {
        int id;
        public PrintThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                Thread next = threadMap.get(this.id);
                try {
                    if (id == 0) {
                        System.out.println(String.format("%d: %d", id, i));
                        Thread.sleep(100);
                        LockSupport.unpark(next);
                        LockSupport.park();
                    } else {
                        LockSupport.park();
                        System.out.println(String.format("%d: %d", id, i));
                        LockSupport.unpark(next);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static Map<Integer, Thread> threadMap;

    public static void main(String[] args) {
        Thread t1 = new PrintThread( 0);
        Thread t2 = new PrintThread( 1);
        Thread t3 = new PrintThread(2);

        threadMap = new HashMap() {{
            put(0, t2);
            put(1, t3);
            put(2, t1);
        }};
        t1.start();
        t2.start();
        t3.start();
    }

}
