package cc.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		System.out.println("udp发送端 run");
		DatagramSocket ds = new DatagramSocket(8888);//发送端端口8888，也就是从8888发出
		String text ="hello,udp 来了";
		byte[] buf=text.getBytes();
		DatagramPacket dp =new DatagramPacket(buf, buf.length, InetAddress.getByName("cc-PC"), 10002);//注意此构造方法第三个参数返回时INetAddress，
		ds.send(dp);                                                                                                                                  //给定主机名的情况下确定主机的ip地址，括号中可以为主机名，
		ds.close();																																		//也可以为ip地址的文本形式ds.send(dp);往10002端口发
		
	
				
		
		// TODO Auto-generated method stub

	}

}
