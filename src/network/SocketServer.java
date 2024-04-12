package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		try {
			// ServerSocket 생성
			serverSocket = new ServerSocket(8080); // port번호
			System.out.println("client 맞을 준비 완료!!");
			
			// ServerSocket의 accept() 메서드는 클라이언트의 요청을 받고 통신에 사용할 수 있는 Socket을 return한다.
			socket = serverSocket.accept();
			System.out.println("client 연결 완료!! ");
			System.out.println("socket: " + socket);
			
			// 데이터 송/수신을 위해 socket에 stream을 연결한다.
			inputStream = socket.getInputStream(); 
			dataInputStream = new DataInputStream(inputStream);
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while(true) {
				// 클라이언트에서 입력한 message를 read()
				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage : " + clientMessage);
				
				dataOutputStream.writeUTF("message 전송 완료!");
				dataOutputStream.flush(); // 버퍼에 남아 있는 모든 데이터를 출력
				
				if(clientMessage.equals("STOP")) break;
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원회수
				if(serverSocket != null) serverSocket.close();
				if(socket != null) socket.close();
				if(dataInputStream != null) dataInputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(inputStream != null) inputStream.close();
				if(outputStream != null) outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
