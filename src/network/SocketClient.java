package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		Scanner scanner = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;

		try {
			// Client용 Socket 생성
			socket = new Socket("localhost", 8080); // 127.0.0.1 : localhost
			System.out.println("Server 연결 완료!!");
			System.out.println("socket : " + socket);
			
			// 데이터 송/수신을 위해 socket에 stream을 연결한다.
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("message를 입력하세요...");
				System.out.println("STOP 입력 시 탈출~");
				
				// scanner를 통해서 message를 입력받는다.
				String outMessage = scanner.nextLine();
				
				// 입력한 메세지를 서버로 출력한다.
				dataOutputStream.writeUTF(outMessage);
				dataOutputStream.flush();
				
				// 서버에서 수신된 메세지를 read()
				String inMessage = dataInputStream.readUTF();
				System.out.println("inMessage : " + inMessage);
				
				if(outMessage.equals("STOP")) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원회수
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
