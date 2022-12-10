package Java核心语法;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLearning {
    public static void main(String[] args) {
        /**
         *  声明字符串类型变量
         */
        String str = "Hello World!!!";
        String str2 = new String("Hello World!!!");
        System.out.println(str + "\n" + str2);

        /**
         *  连接字符串
         */
        // stringjoin();

        /**
         *  获取字符串信息
         */
        // stringfind();

        /**
         *  字符串操作
         */
        //stringmanipulation();

        /**
         *  正则表达式
         */
        res();

    }

    /**
     *  连接字符串
     */
    public static void stringjoin(){

        // 用一个字符数组a创建String对象
        char a[] = {'a','b','a','n','d','o','n'};
        String s1 = new String(a);
        String s2 = new String(a,2,4);
        System.out.println(s1);
        System.out.println(s2);

        // 连接多个字符串
        String s3, s4;
        s3 = "hello";
        s4 = "world";
        String t = s3 + " " + s4;
        System.out.println(t);

        // 连接其他数据类型
        int booktime = 4;
        float practice = 2.5f;
        System.out.println("我每天花费" + booktime + "小时看书; " + practice + "小时上机练习.");
    }

    /**
     *  获取字符串信息
     */
    public static void stringfind(){
        // 获取字符串长度
        String s = "We are friends";
        System.out.println(s.length());

        // 字符查找

        // indexof(String s) 用于返回参数字符串s在指定字符串中首次出现的索引位置,没有匹配则返回-1
        int size = s.indexOf("a");
        System.out.println(size);

        // lastindexof(String s) 用于返回指定字符串最后一次出现的索引位置 没有匹配则返回-1
        int size2 = s.lastIndexOf("e"); // 空字符在字符串s6中最后一次出现的索引位置
        System.out.println(size2);
    }

    /**
     *  字符串操作
     */
    public static void stringmanipulation(){
        // 获取子字符串
        String str = "Hello World";
        String substr = str.substring(3); // 用于返回从指定的索引位置开始截取直到该字符串结尾的字串
        String substr2 = str.substring(0,3); //用于返回从字符串某一索引位置开始截取至某一索引位置结束的字串
        System.out.println(substr);
        System.out.println(substr2);

        // 去除空格
        String s1 = " Java class ";
        System.out.println("字符串原来的长度: " + s1.length());
        System.out.println("去掉空格后的长度: " + s1.trim().length()); // 将s1去掉前导和尾部的空格后的结果输出

        // 字符串替换
        String s2 = "address";
        String news2 = s2.replace("a", "A");
        System.out.println(news2);

        // 判断字符串的开始和结尾
        String num1 = "22045612";
        String num2 = "21304578";
        boolean b = num1.startsWith("22");
        boolean b2 = num2.endsWith("78");
        System.out.println("字符串 num1 是以'22'开始的吗?" + b);
        System.out.println("字符串 num2 是以'78'结束的吗?" + b2);

        // 判断字符串是否相等
        String peter = "I am a student"; // 创建字符串变量
        String tom = new String("I am a student"); // 创建字符串对象tom
        String jerry = new String("I am a student");
        boolean ovo = (tom == jerry); // 即使两个字符串的内容相同, 两个对象的内存地址也是不同的
        System.out.println(ovo);

        String c1 = new String("abc");
        String c2 = new String("ABC");
        boolean t = c1.equals(c2); // 比较字符串内容是否相等, equals()方法区分大小写.
        System.out.println("abc equals ABC" + t);
        boolean t2 = c1.equalsIgnoreCase(c2); // 比较字符串内容是否相等, equals()方法不区分大小写.
        System.out.println("abc equalsIgnoreCase ABC" + t2);

        // 安装字典顺序比较两个字符串

        // 字母大小写转换
        String d = new String("abc DEF");
        String newd1 = d.toLowerCase(); // 字符串小写转换
        String newd2 = d.toUpperCase(); // 字符串大写转换
        System.out.println(newd1 + "\n" + newd2);

        // 字符串分割 -- 使用split()方法可以使字符串按照指定的分割字符或字符串对内容进行分割, 并将分割后的结果存放在字符串数组中.
        String e = "192.168.0.1";
        // 按照 "." 进行分割, 使用转义字符 "\\."
        String[] firstArray = e.split("\\.");
        System.out.println(Arrays.toString(firstArray)); // 输出数组
        for(int i = 0; i<firstArray.length;i++){
            System.out.println(firstArray[i]); // 遍历输出数组
        }
        String[] secondArray = e.split("\\.",2); // 限制分割两次
        System.out.println(Arrays.toString(secondArray)); // 输出[192, 168.0.1]
    }

    /**
     *  格式化字符串
     */

    /**
     *  使用正则表达式
     */
    public static void res(){
        // 验证匹配-验证Email是否正确
        String str = "service@xsoftlab.net";
        String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}"; //邮箱验证规则
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        boolean rs = matcher.matches();
        System.out.println(rs);
    }

    /**
     *  字符串生成器
     */
}
