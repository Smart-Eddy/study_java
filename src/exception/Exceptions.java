package exception;

/**
 * @ 예외처리(Exception)
 * 1. 예외란 프로그램에 문제가 있는 것을 말하며 예외로 인해 시스템 동작이 멈추는 것을 막는 행위를 예외처리라고 부른다.
 * 2. Checked Exception
 *    -> 예외처리를 반드시 해야하는 경우이다.
 *    -> 네트워크, 파일 시스템 처리 등
 *    -> 예외처리를 하지 않을 시 컴파일에러가 발생한다.
 * 3. Unchecked Exception 
 *    -> 예외처리를 개발자의 판단에 맞기는 경우이다.
 *    -> 데이터 오류 등
 *    -> 예외처리를 하지 않아도 무관하지만 예외가 발생할 시 에러가 발생할 수 있다.
 * 4. Exception 클래스
 *    -> NullPointerException : 객체를 가르키지 않고 있는 레퍼런스를 이용할 때 발생
 *    -> ArrayIndexOutOfBoundException : 배열에서 존재하지 않는 인덱스를 가르킬 때
 *    -> NumberFormatException : 숫자데이터에 문자데이터 등을 넣었을 때
 *    -> ...... 이 외에도 굉장히 많은 Exception의 하위 클래스가 존재한다.
 * 5. 정리
 *    1) try     : 예외가 발생할 코드를 try문 스코프 내에 작성한다.
 *    2) catch   : try문에서 발생한 예외를 catch문에서 Exception 클래스를 이용해 잡고 처리할 수 있다.
 *               : catch문은 다중으로 사용할 수 있고 Exception의 하위클래스 별로 디테일하게 예외를 처리할 수 있다.
 *    3) finally : finally문 내의 코드는 예외 발생 여부와 관계없이 무조건 실행된다.
 *               : 네트워크 등의 자원을 사용 후 예외가 발생해도 반드시 자원을 반납할 때 사용하게 된다.
 *    4) throws  : 예외를 직접 처리하지 않고 호출한 곳에서 처리하도록 한다.
 *    ※ Exception(checked), RuntimeException(unchecked) 클래스를 상속하여 직접 커스텀 예외 클래스를 만들 수도 있다.
 * 
 */
public class Exceptions {

	public static void main(String[] args) {
		
		// try ~ catch
		int i = 10;
		int j = 0;
		int r = 0;
		System.out.println("==Exception BEFORE==");
		// 예외가 발생할 코드를 try문의 스코프 내에 작성한다.
		try {
			r = i / j; // 정수를 0으로 나누기 연산할 시 ArithemticException이 발생하게 된다.
			System.out.println("try문에서 예외 발생 시 발생 이후 코드는 실행되지 않는다!!");
		// 예외 발생 시 catch문에서 Exception 객체가 해당 예외를 잡고 처리할 수 있다.
		} catch (Exception e) {
			e.printStackTrace(); // console에 예외내용을 출력한다.
			String msg = e.getMessage(); // 해당 예외에 대한 메세지를 가져온다.
			System.out.println("msg : " + msg);
		// finally : 네트워크 처리 등을 할 때 자원을 반납하는 경우 많이 사용된다.
		} finally { 
			System.out.println("finally문은 예외 발생 여부에 상관없이 언제나 실행된다!!");
		}
		// catch문은 하위클래스를 이용해서 여러개 작성 가능하다.( 예외를 디테일하게 나누어 처리할 경우 사용할 수 있다.
		System.out.println("==Exception AFTER=="); // 예외가 발생했지만 프로그램이 종료되지 않고 출력된다.
		
		// throws된 예외를 호출한 곳에서 처리해 주어야한다.
		Exceptions ex = new Exceptions();
		try {
			ex.firstMethod();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// throws : 예외를 직접 처리하지 않고 호출한 곳으로 던진다.
	public void firstMethod() throws Exception{
		secondMethod();
	}
	public void secondMethod() throws Exception{
		thirdMethod();
	}
	public void thirdMethod() throws Exception{
		int i = 10 / 0;
		System.out.println("throws!!");
	}

}
