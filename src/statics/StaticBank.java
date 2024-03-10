package statics;


	/**
	 * @ static 변수
	 * 1. static 변수는 모든 객체가 동일한 객체 정보를 공유하기 위한 공유 변수이다.(공동저장창고)
	 * 2. 공유변수, 정적변수, 클래스변수로 불린다.
	 * 3. static 변수에 접근할 때는 Class명.변수명으로 접근할 수 있다.
	 * 4. this키워드는 사용할 수 없다.
	 * 5. static 키워드가 붙여진 변수나 메서드는 컴파일시 Static Area에 먼저 메모리를 할당받게 된다.
	 * 6. 자바API에서 제공되는 Math.[메서드]의 메서드나 System.out.[메서드] 등도 스태틱 변수와 메서드이다.
	 */
public class StaticBank {
	
	String name;
	static int amount = 0;
	
	public StaticBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		// static 변수에는 this 키워드 사용 불가능
		amount += money;
		System.out.println("amount : " + amount);
	}
	
	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : " + amount);
	}
	
	public void getBankInfo() {
		System.out.println("name : " + this.name);
		System.out.println("amount : " + amount);
	}

}
