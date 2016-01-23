package cc.net.udpkeyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpsend2 {

	public static void main(String[] args) throws IOException {
		System.out.println("udp发送端 run");
		DatagramSocket ds = new DatagramSocket();//发送端端口8888，也就是从8888发出
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line ;
		while ((line = bufr.readLine() )!= null){
			if ("over".equals(line)) {
				break;
			}
		
			byte[] buf=line.getBytes();
			DatagramPacket dp =new DatagramPacket(buf, buf.length, InetAddress.getByName("cc-PC"), 10003);//注意此构造方法第三个参数返回时INetAddress，
			ds.send(dp);                                                                                                                                  //给定主机名的情况下确定主机的ip地址，括号中可以为主机名，
		}
			ds.close();	
		// TODO Auto-generated method stub

	}

}
