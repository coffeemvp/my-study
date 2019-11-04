package com.coffee.classloader;

/**
 * @author zhang.hp
 * @date 2019/11/4.
 */
public class ClassLoadTest {
    public static void main(String[] args) {
        new Thread(new MsgHandle()).start();
    }

    static class MsgHandle implements Runnable {
        @Override
        public void run() {
            while (true) {
                BaseManager manager = ManagerFactory.getManager(ManagerFactory.MY_MANAGER);
                manager.logic();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
