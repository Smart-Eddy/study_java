package lambda;

/**
 * @ 람다식(Lambda Expression)
 * 1. 함수형 프로그래밍 기법을 지원하기 위해 Java8부터 등장한 기능이다.
 * 2. 람다식은 익명 함수(Anonymous Function)의 일종으로 메서드를 하나의 식으로 표현하게 된다.
 * 3. 주로 함수형 인터페이스(Function Interface)를 구현하는데 사용하게 된다.
 * 	-> * 함수형 인터페이스란 추상메서드를 1개만 가지고 있는 인터페이스를 말한다.
 * 	-> 기존의 인터페이스를 정의 후 인터페이스를 implements한 클래스에서 구현 후 객체를 생성하는 방식과 다르다.
 * 	-> 인터페이스를 implements하지 않고도 람다식을 통해서 추상메서드를 구현하고 참조변수에 대입할 수 있다.
 * 	-> 람다식을 사용하게 되면 익명클래스를 사용하는 것보다 코드가 더욱 간결해지고 가독성이 향상된다.
 *
 */
public class Lambda {

	public static void main(String[] args) {
		
		// 인터페이스에 정의된 추상메서드를 구현한 클래스가 없어도 람다식을 사용해서 추상메서드를 사용할 수 있다.
		
		// 1) 매개변수와 실행문만으로 작성한다. (접근제어자, 반환형, return 키워드를 생략한다.)
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {System.out.println(s1 + " " + s2 + " " + s3);}; // 추상메서드 정의
		li1.method("Hello", "Java", "World!!"); // 람다식에 의해 참조된 변수를 통해서 메서드 호출
		System.out.println();
		
		// 2) 매개변수가 1개이거나 데이터타입이 같을 때, 타입을 생략할 수 있다.
		LambdaInterface2 li2 = (s1) -> {System.out.println(s1);};
		li2.method("==Hello Rambda==");
		
		// 3) 실행문이 1개일 때, {}를 생략 가능하다.
		li2 = (s1) -> System.out.println(s1 + "실행문 1개일 때 {} 생략 가능!"); 
		li2.method("Rambda : ");
		
		// 4) 매개변수와 실행문 모두 1개일 때는 (), {} 둘다 생략 가능하다.
		li2 = s1 -> System.out.println(s1 + "실행문, 매개변수 모두 1개일 때 (), {} 둘 다 생략 가능!!");
		li2.method("Ramdb :");
		
		// 5) 매개변수가 없을 때 ()만 작성해서 사용한다.
		LambdaInterface3 li3 = () -> System.out.println("Parameter : 파라미터 없음");
		li3.method();
		
		// 6) 추상메서드에 반환값이 있는 경우
		LambdaInterface4 li4 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("method(10 + 20) : %d\n", li4.method(10, 20));
		
		li4 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.printf("method(10 - 20 : %d\n", li4.method(10, 20));
	}

}
