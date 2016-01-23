package cc.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient {

	public static void main(String[] args) throws IOException {
		Socket  socket =new Socket("192.168.1.101",10007);//首先创建socket,指定服务器方的ip地址及其端口号
		OutputStream outputStream = socket.getOutputStream();//注意 不需要new一个outputstream出来，连接一旦创立，io流就有了,拿到输出流往里输入
		outputStream.write("tcp客户端来了".getBytes());//网络传输走的是字节数据
		InputStream inputStream = socket.getInputStream();
		byte [] bs =new byte[1024];
		int len =inputStream.read(bs);
		String text =new String(bs, 0, len);
		System.out.println(text);
		socket.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
