package cc.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(10007);
		System.out.println("����������");
		Socket socket = serverSocket.accept();//��ȡ�ͻ��˶���
		InputStream inputStream = socket.getInputStream();//�õ���������
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		String text =  new String(bs, 0, len);
		System.out.println(text);
		OutputStream outputStream =socket.getOutputStream();//�õ����������д
		outputStream.write("���Ƿ����������Ѿ��յ�".getBytes());
		socket.close();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
