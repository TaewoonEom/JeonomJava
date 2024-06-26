package org.Jeonom.day16.socket.stream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {
		String address = "127.0.0.1";	
		Socket socket = null;
		int port = 8888;
		OutputStream os = null;
		try {
			socket = new Socket(address, port);
			System.out.println("서버와의 연결에 성공하였습니다.");
//			socket.getInputStream();
			os = socket.getOutputStream();
			os.write(104);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
