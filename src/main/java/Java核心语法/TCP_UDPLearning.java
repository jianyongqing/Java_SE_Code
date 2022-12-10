package Java核心语法;

import java.net.InetAddress;


/**
 *  网络通信
 */
public class TCP_UDPLearning {

    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String localname = ip.getHostName();
            String localip = ip.getHostAddress();
            System.out.println(localname);
            System.out.println(localip);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
