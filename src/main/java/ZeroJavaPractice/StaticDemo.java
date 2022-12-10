package ZeroJavaPractice;

public class StaticDemo {
    static int t = 3;


    public static void say(){
        int a =3, b = 4;
        int c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        // 静态static方法的应用
        say(); // StaticDemo.say();

        // 静态static变量的应用

        System.out.println(StaticDemo.t); // 运行结果为3
        t = 4; // StaticDemo.t = 4;
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.t); // 运行结果为4
    }
}
