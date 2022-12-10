package Java核心语法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaLearning {
    public static void main(String[] args) {
        //list的遍历
        List<String> books = new ArrayList<String>(3);
        books.add("TEST1");
        books.add("TEST2");
        books.add("TEST3");
        books.forEach(obj -> System.out.println("测试:" + obj));
        //map的遍历
        Map maps = new HashMap();
        maps.put(1, "test1");
        maps.put(2, "test2");
        maps.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

    }

}

