package interfacing;

/**
 * @ 인터페이스(Interface)
 * 1. 인터페이스는 일종의 작업명세서이다.
 * 2. 메서드를 정의할 수 없고 선언만 가능하다. 이를 추상메서드라고 부른다.
 * 3. Java에서 클래스는 다중상속을 지원하지 않지만 인터페이스는 implements 키워드를 통해 다중상속(구현)이 가능하다.
 * 4. 인터페이스 내부에는 멤버변수는 선언이 불가능하고 static final로 상수만 선언이 가능하다.(Java8 부터 default method도 정의가 가능하다.)
 * 5. implements 키워드를 통해 구현을 선언한 클래스에서 인터페이스의 추상메서드를 구현해야한다.(Override)
 * 6. 인터페이스는 클래스가 어떤 메서드를 구현해야하는지를 명시할 수 있고 이를 통해 다양한 클래스(구현체)들을 동일한 방식으로 다룰 수 있다.
 * 	-> 같은 메서드를 구현했지만 서로 다른 동작을 할 수 있다.(다형성)
 *
 */
public class Interfacing {

	public static void main(String[] args) {
		
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		// Toy라는 같은 자료형이기 때문에 같은 배열에 서로 다른 구현체를 담을 수 있게 된다.
		Toy toys[] = {robot, airplane};
		
		// 같은 메서드명이지만 서로 다르게 구현한 메서드가 호출된다.
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			System.out.println();
		}
	}

}
