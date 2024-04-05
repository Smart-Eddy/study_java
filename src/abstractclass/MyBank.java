package abstractclass;

public class MyBank extends Bank{
	
	public MyBank(String name, String account, int totalAmount) {
		// 상속받은 추상클래스(Bank)에서 Override된 생성자를 호출한다.
		super(name, account, totalAmount);
	}

	// 상속받은 추상클래스(Bank) 내부의 추상메서드를 반드시 구현 해주어야한다.
	@Override
	public void installmentSavings() {
		System.out.println("==installmentSavings() START==");
	}
	
	@Override
	public void cancellation() {
		System.out.println("==cancellation() START==");
	}
	

}
