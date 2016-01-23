package cc.net.udpkeyin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udprece2 {

	public static void main(String[] args) throws IOException {
		System.out.println("udp接受端 run");
		DatagramSocket ds =new DatagramSocket(10003);//监听10002端口
		while(true){
			byte [] buf =new byte[1024];
			DatagramPacket dp =new DatagramPacket(buf,buf.length);//、从这改offset不能，会出错？？为啥
			ds.receive(dp);
			String ip =dp.getAddress().getHostAddress();//或者改成String ip = dp.getAddress().getHostAddress();这个输出192.168.1.101  前者输出/192.168.1.101
			int port = dp.getPort();
			String text =new String(dp.getData(),0,dp.getLength());//修改这个offset可以改变接受数据的起始位置
			System.out.println(ip+":"+port+':'+text);
		}
		//ds.close();
		// TODO Auto-generated method stub

	}

}
