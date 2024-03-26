package datatype;


public class DataType {
	
	/**
	 * @ 자료형(DataType)
	 * 1. 자료형은 일정 크기의 메모리에 저장된 정보(자료)를 해석하는 방법이다.
	 * 2. 즉, 컴파일러가 메모리의 바이너리의 길이를 식별하는 방법이다.
	 * 3. 기본 자료형(Primitive Type)
	 * 		■ 정수형
	 * 			1) byte : 1byte
	 * 			2) short : 2byte
	 * 			3) int : 4byte
	 * 			4) long : 8byte
	 * 		■ 실수형
	 * 			1) float : 4byte
	 * 			2) double : 8byte
	 * 		■ 논리형
	 * 			1) boolean : 1byte
	 * 		■ 문자형
	 * 			1) char : 2byte
	 * 4. 참조 자료형(Reference Type)
	 *		- 참조 자료형은 객체를 참조하여 사용되는 데이터 타입이다.
	 *		- 참조 자료형은 객체의 메모리 주소를 저장하고 변수는 해당 객체를 가르키는 참조를 가지게 된다.
	 *		- 대표적으로 클래스(class), 배열(Array), 인터페이스(Interface), 열거형(enum) 등이 있고 사용자가 직접 정의한
	 *		  클래스나 Java API에서 제공하는 클래스 등 다양한 참조자료형이 존재한다.
	 *		- 참조 자료형은 Null 값을 가질 수 있고 이는 아무런 객체를 가르키지 않는 상태를 나타낼 수 있다.
	 *		- 객체(참조 자료형)이 생성 될 때 힙 메모리에 저장 되었다가 더 이상 사용되지 않을 때 GC(가비지 컬렉션)의 대상이 된다.
	 */
	public static void main(String[] args) {
		// 기본 자료형(Primitive Type)
		System.out.println("==========정수형==========");
		// byte(1byte)
		byte by = 1;
		System.out.println("by : " + by);
		// short(2byte)
		short s = 2;
		System.out.println("s : " + s);
		// int(4byte)
		int i = 4;
		System.out.println("i = " + i);
		//long(8byte)
		long l = 8;
		System.out.println("l = " + l);
		
		System.out.println("==========실수형==========");
		// float(4byte)
		float f = 4.0f;
		System.out.println("f = " + f);
		// double(8byte)
		double d = 8.0;
		System.out.println("d = " + d);
		
		System.out.println("==========논리형==========");
		// boolean(1byte, true/false)
		boolean b = false;
		System.out.println("b = " + b);
		
		System.out.println("==========문자형==========");
		// char(2byte)
		char c = 'a';
		System.out.println("c = " + c);
		
		// 참조 자료형(Reference Type)
		System.out.println("==========문자열==========");
		// new 키워드를 통해 객체 생성이 가능하다.
		// String str = new String("Hello Java World!");
		String str = "hello Java World!";
		System.out.println("str = " + str);
		
	}

}