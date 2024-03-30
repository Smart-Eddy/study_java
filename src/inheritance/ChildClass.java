package inheritance;

// extends 키워드를 통해서 상위 클래스를 상속시킬 수 있다.
public class ChildClass extends ParentClass{
	
	public ChildClass() {
		System.out.println("==ChildClass constructor==");
	}
	
	public void childFun() {
		System.out.println("==childFun() START==");
	}
	
	// 상속받은 상위클래스의 메서드를 Override(재정의)할 수 있다.
	// Override란 상위클래스에 정의된 메서드를 하위클래서에서 동일한 메서드 시그니처를 유지한 채로 메서드를 재정의하는 것을 말한다.
	// Override를 통해 상위클래스의 메서드의 동작을 변경하거나 추가적인 동작을 추가할 수도 있다.
	// 객체지향 프로그래밍에서 이를 두고 다형성(Polymorphism)을 구현한다고 한다.
	@Override
	public void makeJjajang() {
		System.out.println("==more makeJjajng() START==");
	}

}
