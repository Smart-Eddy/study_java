package abstractclass;

/**
 * @ 추상클래스(Abstract Class)
 * 1. 클래스의 공통된 부분을 추출해서 추상클래스로 만들고 이것을 상속해서 사용하게 된다.
 * 2. 추상클래스는 멤버변수를 가질 수 있다.
 * 3. 추상클래스를 상속하기 위해 extends 키워드를 사용한다.
 * 4. 인터페이스와 비슷하게 추상메서드를 선언하고 추상클래스를 상속한 클래스에서 추상메서드를 구현해야 한다.
 * 5. 일반 클래스와 마찬가지로 일반 메서드도 정의할 수 있다.
 * 	=> 즉, 추상클래스는 일반클래스의 특징을 가지고 있으면서 추상메서드도 포함할 수 있는 클래스이다.
 * 	=> 추상메서드를 가지기 때문에 추상클래스 타입으로는 객체 생성이 불가능하고 상속받은 클래스를 통해서 객체를 생성할 수 있다.
 *
 */
public class AbstractClass {

	public static void main(String[] args) {
		
		Bank myBank = new MyBank("LEE", "010-1234-5678", 1000);
		// super(name, account, totalAmount)가 호출되어 추상클래스의 멤버변수가 초기화된다.
		
		// 추상클래스에서 정의되어있는 메서드를 호출
		myBank.deposit();
		myBank.withdraw();
		
		// 추상클래스를 Override하여 구현한 메서드 호출
		myBank.installmentSavings();
		myBank.cancellation();
		
		// 정보출력
		myBank.getInfo();

	}

}
