package cc.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient {

	public static void main(String[] args) throws IOException {
		Socket  socket =new Socket("192.168.1.101",10007);//���ȴ���socket,ָ������������ip��ַ����˿ں�
		OutputStream outputStream = socket.getOutputStream();//ע�� ����Ҫnewһ��outputstream����������һ��������io��������,�õ��������������
		outputStream.write("tcp�ͻ�������".getBytes());//���紫���ߵ����ֽ�����
		InputStream inputStream = socket.getInputStream();
		byte [] bs =new byte[1024];
		int len =inputStream.read(bs);
		String text =new String(bs, 0, len);
		System.out.println(text);
		socket.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
