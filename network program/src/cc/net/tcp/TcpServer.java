package cc.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(10007);
		System.out.println("服务器开启");
		Socket socket = serverSocket.accept();//获取客户端对象
		InputStream inputStream = socket.getInputStream();//拿到输入流读
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		String text =  new String(bs, 0, len);
		System.out.println(text);
		OutputStream outputStream =socket.getOutputStream();//拿到输出流往外写
		outputStream.write("我是服务器，我已经收到".getBytes());
		socket.close();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
