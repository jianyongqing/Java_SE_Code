package ZeroJavaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date2 = new Date();// 获取当前时间
        System.out.println("现在时间：" + sdf.format(date2)); // 输出已经格式化的现在时间（24小时制）
    }
}
