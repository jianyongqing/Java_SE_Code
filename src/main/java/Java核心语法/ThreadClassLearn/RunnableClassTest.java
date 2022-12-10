package Java核心语法.ThreadClassLearn;

public class RunnableClassTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 200;i++){
            System.out.println("是兄弟就来砍我" + i);
        }
    }

    public static void main(String[] args) {

        RunnableClassTest t = new RunnableClassTest();

        new Thread(t).start();


        for (int i = 0; i <= 1000;i++){
            System.out.println("我是渣渣辉" + i);
        }
    }

}
