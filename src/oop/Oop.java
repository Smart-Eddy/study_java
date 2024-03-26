package oop;

public class Oop {
	
	/**
	 * @ 객체지향 프로그래밍(Object Oriented Programming, OOP)
	 * 1. 현실 세계의 개체(Object)들을 추상화하여 모델링하여 클래스로 만든다.
	 * 2. 클래스를 통해 객체(인스턴스)를 생성해 마치 레고나 부품을 조립하듯이 프로그래밍하는 기법을 말한다.
	 * 3. 객체지향의 4대 특성
	 * 	1) 캡슐화(Encapsulation)
	 *    -> 클래스의 속성과 속성을 제어하는 메서드(getter, setter)를 하나로 묶어 외부에서 접근하는 것을 제한하는 것을 말한다.
	 *    -> 데이터의 무결성을 유지할 수 있고 의도치 않은 접근으로 부터 보안이 강화될 수 있다.
	 * 	2) 상속(Inheritance)
	 *    -> 상위(부모)클래스의 속성과 동작을 하위(자식)클래스에게 물려주는 것을 의미한다.
	 *    -> extends 키워드를 통해 상속시킬 수 있고 자바에서는 다중 상속이 불가능하다.(extends, implements는 혼용 가능)
	 *    -> 코드의 재사용성을 높일 수 있고 계층적인 관계 또한 표현할 수 있다.
	 * 	3) 추상화(Polymorphism)
	 *    -> 추상화는 객체의 공통된 특성을 강조, 집중하여 코드의 복잡성을 줄이고 코드의 이해도와 유지보수를 유용하게 만들어 준다.
	 * 	4) 다형성(Abstraction)
	 *    -> 다형성은 오버로딩, 오버라이딩을 통해 같은 이름의 메서드명을 재활용하거나,
	 *       같은 메서드를 호출해도 서로 다른 동작을 수행할 수 있도록 하는 것을 의미한다.
	 */
	public static void main(String[] args) {
		// new키워드로 객체 생성 시 가장 먼저 생성자 메서드를 호출()
		// new키워드를 통해 생성된 인스턴스의 주소(힙)를 참조변수(스택)가 참조하게 된다.
		Car grandeur = new Car();
		grandeur.name = "grandeur";
		grandeur.color = "black";
		grandeur.gear = "auto";
		grandeur.price = 3000;
		grandeur.run();
		grandeur.stop();
		grandeur.carInfo();
		
		// 생성자 오버로딩을 통해 인스턴스가 생성될 때 멤버필드(속성)을 초기화할 수 있다. 
		Car ramborgini = new Car("ramborgini", "red", "auto", 100000);
		ramborgini.run();
		ramborgini.stop();
		ramborgini.carInfo();
		
		// 객체 생성과 참조
		// granduer와 ramborgini 객체(인스턴스)는 같은 클래스인 Car 자료형이다.
		// 객체가 생성되었을 때 힙메모리에 생성되고 이를 참조변수가 참조하여 객체에 접근할 수 있다.
		// 생성된 객체(인스턴스)는 각 각의 메모리 주소를 가지고 있고 이 둘은 서로 다른 객체임을 알 수 있다.
		System.out.println("====Object Memory Addrees====");
		System.out.println("car_granduer : " + grandeur);
		System.out.println("car_ramborgini : " + ramborgini);
		
		// 객체 비교시 == 비교연산자는 두 객체의 참조(주소)를 비교한다.
		System.out.println("== : " + (grandeur == ramborgini)); // false
		// equals() 메서드는 두 객체의 내용을 비교한다.
		System.out.println("equals() : " + grandeur.equals(ramborgini)); // false
		// instanceof() 메서드는 두 객체의 타입(자료형)을 비교한다.
		System.out.println("instanceof() : " + (grandeur instanceof Car)); // true
		System.out.println("instanceof() : " + (ramborgini instanceof Car)); // true
		
		// 참조변수에 null이 저장되면 참조변수와 객체의 참조가 끊기고 더 이상 객체를 이용할 수 없게된다.
		// null이 저장되어 참조가 끊기게 되면 GC에 의해서 메모리(힙)에서 제거되게 된다.
		grandeur.carInfo();
		grandeur = null;
		//grandeur.carInfo(); NullPointerException 발생 
		
		
	}

}