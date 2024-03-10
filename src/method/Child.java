package method;


public class Child {
	/**
	 * @ �޼���(Method)
	 * 1. ����������� ����ϴ� �Լ�(Function)�� ��ü��������� �޼���(Method)��� �θ���.
	 * 2. �޼��嵵 ������ ���� ���� �� ���� �� �ʿ��� ������ �޼��带 ȣ��()�Ͽ� ����Ѵ�.
	 * 3. �޼����� ���� �� ���� ������ [����������] [��ȯŸ��] [�޼���� : �ּ�] [�Ű�����] { ���� } �������� �ۼ��Ѵ�.
	 * 4. ���α׷� ������ ���� �۾��� ������ �����ؾ� �Ѵٸ�, �� �۾��� �����ϴ� �޼��带 �ۼ��ϰ� �ʿ��� ������
	 *    �ش� �Լ��� ȣ���Ͽ� �ڵ带 �����ϴ� ���� ������������ ����.
	 * 5. �ڹٿ� �����ϴ� ����������(public, private, protected)���� ���� ȣ�� ������ ����� �� �ִ�.
	 */
	
	public String name;
	public String gender;
	public int age;
	
	public Child() {
		System.out.println("====Child Class Constructor====");
	}
	
	
	public void getInfo() {
		System.out.println("====getInfo()====");
		System.out.println("name : " + this.name);
		System.out.println("gender : " + this.gender);
		System.out.println("age : " + this.age);
		//mySecret(); ���������� private Ŭ���� ���ο����� ���� ����
	}
	
	// �޼��� �����ε�(Method Overloading)
	// ���� ���� �۾��� �����ؾ� �ϴ� �޼��忡�� �Ű������� ���� Ȥ�� Ÿ���� �ٸ� �޼��尡 �ʿ��ϴٸ� 
	// �����ε��� �̿��ؼ� �޼������ �ϳ��� �����ؼ� ������������ ���� �� �ִ�.
	// ��ǥ������ System.out.println() ���� �����ε��� ���� �ϳ��� �޼�������� ���� �ڷ����� ó���� �� �ִ�.
	public void getInfo(String param1, String pram2r) {
		System.out.println("====getInfo("+param1 + ", " + pram2r+")====");
	}
	
	public void setInfo(String name, String gender, int age) {
		System.out.println("====setInfo()====");
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	private void mySecret(){
		System.out.println("== mySecret is private ==");
	}
	
}
