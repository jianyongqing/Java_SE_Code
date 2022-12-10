package Java核心语法.CollectionClassLearn;

import java.util.*;

public class HashMapClassLearn {

    public static void main(String[] args) {

        //创建HashMap, 存储员工姓名、工资
        HashMap<String, Integer> hashMap = new HashMap<>();

        //添加数据
        hashMap.put("LiLei", 2000);
        hashMap.put("Zhang Beijing",300);
        hashMap.put("Peter",666);
        hashMap.put("jjdd",300);

        //System.out.println(hashMap);

        //4)判断
//        //判断是否存在"xiaoming"这个员工, 员工姓名作为map中的键存在, 判断Map中的键是否包含"xiaoming"
//        System.out.println( hashMap.containsKey("Zhang Beijing")); 	//true
//        System.out.println( hashMap.containsKey("bingbing"));	//false
//        //判断是否有员工的工资是6666, 员工工资是作为map中的值存在在, 判断Map中值是否包含6666
//        System.out.println( hashMap.containsValue(666));		//true
//        System.out.println( hashMap.containsValue(100000)); 	//false
//        //查看员工的工资
//        System.out.println( hashMap.get("LiLei"));  	//30000
//        System.out.println( hashMap.get("bingbing"));  	//null
        Set<String> keySet = new HashSet<>();
        if (hashMap.containsValue(300)) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (Objects.equals(entry.getValue(), 300)) {
                    keySet.add(entry.getKey());
                }
                // 我们不能像这样比较，null会引发异常
              /*(if (entry.getValue().equals(value)) {
                  result.add(entry.getKey());
              }*/
            }
        }
        System.out.println(keySet);
    }
}
