package cc.net.udpkeyin;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udprece2 {

	public static void main(String[] args) throws IOException {
		System.out.println("udp���ܶ� run");
		DatagramSocket ds =new DatagramSocket(10003);//����10002�˿�
		while(true){
			byte [] buf =new byte[1024];
			DatagramPacket dp =new DatagramPacket(buf,buf.length);//�������offset���ܣ��������Ϊɶ
			ds.receive(dp);
			String ip =dp.getAddress().getHostAddress();//���߸ĳ�String ip = dp.getAddress().getHostAddress();������192.168.1.101  ǰ�����/192.168.1.101
			int port = dp.getPort();
			String text =new String(dp.getData(),0,dp.getLength());//�޸����offset���Ըı�������ݵ���ʼλ��
			System.out.println(ip+":"+port+':'+text);
		}
		//ds.close();
		// TODO Auto-generated method stub

	}

}
