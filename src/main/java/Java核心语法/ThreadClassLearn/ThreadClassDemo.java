package Java核心语法.ThreadClassLearn;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

//实现多线程同步下载图片
public class ThreadClassDemo extends Thread{
    private String url;
    private String name;

    public  ThreadClassDemo(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        ThreadClassDemo t = new ThreadClassDemo("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_bt%2F0%2F11975520537%2F641.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652255054&t=9e2d3754338e8fb2d476faf1a010b8bc","B站1.jpg");
        ThreadClassDemo t2= new ThreadClassDemo("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_bt%2F0%2F11975520537%2F641.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652255054&t=9e2d3754338e8fb2d476faf1a010b8bc","B站2.jpg");
        ThreadClassDemo t3 = new ThreadClassDemo("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_bt%2F0%2F11975520537%2F641.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652255054&t=9e2d3754338e8fb2d476faf1a010b8bc","B站3.jpg");

        t.start();
        t2.start();
        t3.start();
    }


}

//下载器
class WebDownloader {
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
