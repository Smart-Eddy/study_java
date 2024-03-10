package statics;

public class Statics {

	public static void main(String[] args) {
		
		// lee, kim 이라는 서로 다른 객체가 생성되었지만 StaticBank 클래스에 amount는 static 변수이기 때문에
		// 객체끼리 amount 변수의 데이터를 공유하게 된다.
		
		StaticBank lee = new StaticBank("lee");
		lee.saveMoney(100); 
		lee.getBankInfo();
		StaticBank kim = new StaticBank("kim");
		kim.saveMoney(300);
		kim.getBankInfo();
		
		// Class.[변수명]으로 static변수에 접근 가능하다.
		StaticBank.amount += 500;
		kim.getBankInfo();
		kim.spendMoney(900);
		lee.getBankInfo();
		
	}
}
