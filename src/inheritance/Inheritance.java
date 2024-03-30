package inheritance;

/**
 * @ 상속(Inheritance)
 * ※ Java에서 모든 클래스의 최상위 클래스는 항상 Object 클래스이다.
 * ※ extends 키워드를 붙여주지 않아도 모든 클래스는 Object 클래스를 상속받고 있다.
 * ※ super 키워드는 상속받은 상위클래스를 가르키는 키워드이다.
 * 1. 하위클래스에 extends 키워드를 사용해서 상속을 구현할 수 있다.
 * 2. Java에서는 다중 상속을 지원하지 않는다.
 * 		-> 다중 상속을 지원하는 언어도 있으나 다중 상속 시 다이아몬드 구조 문제가 발생할 수 있다.
 * 		-> 다이아몬드 구조란 하위 클래스가 중복된 상위 클래스의 멤버에 대한 접근이 모호할 수 있기 때문에 발생하는 문제이다.
 * 3. 상속은 클래스 간의 관계를 정의하는 객체지향 기법 중 하나로 한 클래스가 다른 클래스의 특성(속성, 메서드)를 확장할 수 있는 메커니즘이다.
 * 4. 상속을 활용하면 기존 클래스의 속성과 메서드를 재사용할 수 있고 이를 통해 코드의 중복을 줄이고 유지보수가 편해지게 된다. 
 * 5. 상속을 실제 세상에서의 할아버지 -> 아버지 -> 아들 식의 상속 구조보다는 확장 및 재사용의 개념으로 이해하는 것이 적절하다.
 * 		-> 동물 -> 포유류 -> 고래
 * 					   -> 박쥐 
 * 			   -> 조류 -> 참새
 * 					  -> 펭귄
 *
 */
public class Inheritance {

	public static void main(String[] args) {
		
		// 하위클래스를 생성하게 되면 상위클래스가 먼저 메모리에 객체가 생성된 후 하위클래스 또한 메모리에 생성되게 된다.
		ChildClass child = new ChildClass();
		
		// 상위클래스인 ParentClass가 메모리에 로딩되었기 때문에 상위클래스의 메서드도 하위에서 참조할 수 있다.
		child.parentFun();
		// 하위클래스 ChildClass에서 정의한 메서드 또한 호출이 가능하다.
		child.childFun();
		
		// 상속을 해도 private 접근제어자에는 참조가 불가능하다.
		// child.privateFun();
		
		// @Override(재정의) 되지 않았다면 상위클래스의 makeJjajang()가 호출된다.
		// child.makeJjajang();
		// ==makeJjajang() START==
		
		child.makeJjajang(); // <--  @Override(재정의)된 makeJjajng() 호출 : ==more makeJjajang() START==

	}

}
