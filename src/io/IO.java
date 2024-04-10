package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ 입/출력(Input/Output)
 * 1. 다른 곳의 데이터를 가져오는 것을 입력(Input), 다른 곳으로 데이터를 내보내는 것을 출력(Output)이라고 한다.
 * 2. 이 때 입/출력은 스트림(Stream)이라는 공간을 연결 후 스트림을 통해서 데이터(byte)를 전송되게 된다.
 * ※ InputStream (추상클래스)
 *   -> FileInputStream : byte단위의 입력
 *   -> DataInputStream : byte단위의 입력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다.
 *   -> BufferedReader : Reader클래스의 문자단위 입력을 문자열 단위의 입력으로 처리할 수 있다.
 * ※ OutputStream (추상클래스)
 *   -> FileOutputStream : byte단위의 출력
 *   -> DataOutputStream : byte단위의 출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다.
 *   -> BufferedWriter : Writer클래스의 문자단위 출력을 문자열 단위의 출력으로 처리 할 수 있다.
 */
public class IO {

	public static void main(String[] args) {
		
		// write()
		OutputStream outputStream = null;
		try {
			// 해당 경로에 File을 생성
			// File이 존재하면 덮어씌기, File이 존재하지 않으면 새로 File을 생성한다.
			outputStream = new FileOutputStream("C:\\dev\\WORKSPACE\\java\\study_java\\src\\io\\hello.txt");
			String data = "Hello Java World!!";
			byte[] dataArr = data.getBytes(); // 문자열을 byte[]로 변환해주는 역활을 한다.
			
			try {
				// write() -> byte[]에 담겨있는 data를 한번에 출력한다.
				// ※ write() 호출 시 매개변수에 offset, length를 전달하여 원하는 배열길이 만큼 출력이 가능하다.
				outputStream.write(dataArr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // 자원 회수
			try {
				if(outputStream == null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// read()
		InputStream inputStream = null;
		try {
			// 해당 경로의 File에 InputStream 연결
			inputStream = new FileInputStream("C:\\dev\\WORKSPACE\\java\\study_java\\src\\io\\hello.txt");
			int data = 0;
			
			while(true) {
				try {
					// read() -> 1byte씩 데이터를 읽어온다.
					// ※ read() 호출 시 매개변수에 배열을 전달 시 해당 배열길이만큼 데이터를 읽을 수 있다.
					// 더이상 read할 data가 없을 시 -1이 return된다.(end of stream)
					data = inputStream.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				// -1 은 end of stream을 뜻한다. 이를 통해 데이터의 끝을 확인하고 처리할 수 있다.
				if(data == -1) break;
				//System.out.println("data : " + data); // ASCII 코드로 data를 가져오게 됨
				System.out.println("data : " + (char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // 자원 회수
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// FileCopy
		// 기존 파일의 data를 read() -> write() 하면 copy가 된다.
		try {
			inputStream = new FileInputStream("C:\\dev\\WORKSPACE\\java\\study_java\\src\\io\\hello.txt");
			outputStream = new FileOutputStream("C:\\dev\\WORKSPACE\\java\\study_java\\src\\io\\hello_copy.txt");
			
			int data = 0;
			
			while(true) {
				try {
					data = inputStream.read();
					if(data == -1) break;
					outputStream.write(data);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream == null) outputStream.close();
				if(inputStream == null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
