package Java核心语法.CollectionClassLearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class CollectionClassLearn {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("11");
        arrayList.add("12");
        System.out.println(arrayList);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(11);
        System.out.println(arrayList2);

        HashSet<Integer> hashset2 = new HashSet<>();
        hashset2.add(11);
        hashset2.add(13);
        System.out.println(hashset2);
    }
}
