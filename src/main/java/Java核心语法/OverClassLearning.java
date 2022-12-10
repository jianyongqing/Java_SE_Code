package Java核心语法;

/**
 *  泛型的应用
 *
 * @param <T>
 */
public class OverClassLearning<T> {     // 定义泛型类

    private T over; // 定义泛型成员变量

    public T getOver(){
        return over;
    }
    public void setOver(T over){
        this.over = over;
    }

    public static void main(String[] args) {
        OverClassLearning<Boolean> over1 = new OverClassLearning<Boolean>(); // 实例化一个Boolean型的对象

        OverClassLearning<Float> over2 = new OverClassLearning<Float>(); // 实例化一个Float型的对象

        over1.setOver(true);
        over2.setOver(12.3f);

        Boolean b = over1.getOver();
        Float f = over2.getOver();

        System.out.println(b);
        System.out.println(f);
    }
}
