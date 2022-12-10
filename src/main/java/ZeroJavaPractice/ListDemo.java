package ZeroJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        for(String i:list){
            System.out.println(i);

        }
    }
}
