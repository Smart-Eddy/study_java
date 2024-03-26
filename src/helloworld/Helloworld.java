package helloworld;


public class Helloworld {
	
	/**
	 * @ 자바프로그램의 실행구조
	 * 1. 소스코드 작성(.java)
	 * 2. 컴파일(Compile) -javac.exe
	 * 3. bytecode파일 생성(.class)
	 * 4. JVM(Java Virtual Machine) 구동 -java.exe
	 * 5. LINK 작업 (메모리 로딩/ 실행준비/ 실행결정/ 초기화 등) -RUN
	 */
	public static void main(String[] args) {
		// main Method는 프로그램이 시작될 때 가장 먼저 실행된다.
		System.out.println("Hello Java World!!");
	}
}