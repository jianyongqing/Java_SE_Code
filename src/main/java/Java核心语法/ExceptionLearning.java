package Java核心语法;

/**
 *  异常处理
 *      原则: 异常处理不应用来控制程序的正常流程, 其主要作用是捕获程序在程序运行时发生的异常并进行相应的处理
 */
public class ExceptionLearning {
    public static void main(String[] args) {
        // 捕获异常
        try{
            int result = 3/0; // 此次会出现Java中内置异常-算术异常(ArithmeticException)
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace(); // 输出异常性质
        }

        // 抛出异常
        try{
            throwsdemo(2,1);
        }catch (ArithmeticException e){ // 处理ArithmeticException异常
            System.out.println("除数不能为0"); // 输出提示信息
        }catch (Exception e){ //处理其他异常
            e.printStackTrace();
            System.out.println("程序发生了其他异常");
        }
    }
    // 如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
    public static int throwsdemo(int x,int y) throws Exception{
        if(y == 1){
            throw new Exception("y除数不能为-1");
        }
        return x/y;
    }

}

// 自定义异常
