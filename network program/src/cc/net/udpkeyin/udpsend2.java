package cc.net.udpkeyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpsend2 {

	public static void main(String[] args) throws IOException {
		System.out.println("udp���Ͷ� run");
		DatagramSocket ds = new DatagramSocket();//���Ͷ˶˿�8888��Ҳ���Ǵ�8888����
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line ;
		while ((line = bufr.readLine() )!= null){
			if ("over".equals(line)) {
				break;
			}
		
			byte[] buf=line.getBytes();
			DatagramPacket dp =new DatagramPacket(buf, buf.length, InetAddress.getByName("cc-PC"), 10003);//ע��˹��췽����������������ʱINetAddress��
			ds.send(dp);                                                                                                                                  //�����������������ȷ��������ip��ַ�������п���Ϊ��������
		}
			ds.close();	
		// TODO Auto-generated method stub

	}

}
