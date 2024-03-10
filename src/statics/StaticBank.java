package statics;


	/**
	 * @ static ����
	 * 1. static ������ ��� ��ü�� ������ ��ü ������ �����ϱ� ���� ���� �����̴�.(��������â��)
	 * 2. ��������, ��������, Ŭ���������� �Ҹ���.
	 * 3. static ������ ������ ���� Class��.���������� ������ �� �ִ�.
	 * 4. thisŰ����� ����� �� ����.
	 * 5. static Ű���尡 �ٿ��� ������ �޼���� �����Ͻ� Static Area�� ���� �޸𸮸� �Ҵ�ް� �ȴ�.
	 * 6. �ڹ�API���� �����Ǵ� Math.[�޼���]�� �޼��峪 System.out.[�޼���] � ����ƽ ������ �޼����̴�.
	 */
public class StaticBank {
	
	String name;
	static int amount = 0;
	
	public StaticBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		// static �������� this Ű���� ��� �Ұ���
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
