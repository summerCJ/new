package cc.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		System.out.println("udp���Ͷ� run");
		DatagramSocket ds = new DatagramSocket(8888);//���Ͷ˶˿�8888��Ҳ���Ǵ�8888����
		String text ="hello,udp ����";
		byte[] buf=text.getBytes();
		DatagramPacket dp =new DatagramPacket(buf, buf.length, InetAddress.getByName("cc-PC"), 10002);//ע��˹��췽����������������ʱINetAddress��
		ds.send(dp);                                                                                                                                  //�����������������ȷ��������ip��ַ�������п���Ϊ��������
		ds.close();																																		//Ҳ����Ϊip��ַ���ı���ʽds.send(dp);��10002�˿ڷ�
		
	
				
		
		// TODO Auto-generated method stub

	}

}
