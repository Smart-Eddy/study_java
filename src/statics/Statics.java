package statics;

public class Statics {

	public static void main(String[] args) {
		
		// lee, kim �̶�� ���� �ٸ� ��ü�� �����Ǿ����� StaticBank Ŭ������ amount�� static �����̱� ������
		// ��ü���� amount ������ �����͸� �����ϰ� �ȴ�.
		
		StaticBank lee = new StaticBank("lee");
		lee.saveMoney(100); 
		lee.getBankInfo();
		StaticBank kim = new StaticBank("kim");
		kim.saveMoney(300);
		kim.getBankInfo();
		
		// Class.[������]���� static������ ���� �����ϴ�.
		StaticBank.amount += 500;
		kim.getBankInfo();
		kim.spendMoney(900);
		lee.getBankInfo();
		
	}
}
