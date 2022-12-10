package com.xx.ThreadClassLearn;

public class ThreadClassTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 200;i++){
            System.out.println("是兄弟就来砍我" + i);
        }
    }

    public static void main(String[] args) {
        ThreadClassTest t = new ThreadClassTest();
//        t.run();
        t.start();

        for (int i = 0; i <= 1000;i++){
            System.out.println("我是渣渣辉" + i);
        }
    }
}
