package Java核心语法;

import java.util.Random;

/**
 *  1. 当你需要定义一组常量时，可以使用枚举类型。
 *
 *  2. 尽量不要使用枚举的高级特性，事实上高级特性都可以使用普通类来实现，没有必要引入枚举，增加程序的复杂性!
 */
public class EnumLearning {

    public static void main(String[] args) {
        // 枚举遍历
        for (Week k : Week.values()) {
            System.out.println(k);
        }
        // switch语句中使用枚举
        int a = new Random().nextInt(4); // 生成0，1，2，3的随机数
        switch (Season.values()[a]) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}

/**季节*/
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
/**星期*/
enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}
