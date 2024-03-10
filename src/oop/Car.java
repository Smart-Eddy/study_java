package oop;

	/**
	 * @ Ŭ���� Class
	 * 1. Ŭ������ ��ü�� ����� ���� ���赵(Ʋ)�̴�.
	 * 2. Ŭ������ ��ü(�ν��Ͻ�)�� �߻�ȭ�� �з��� ������ �ǹ��Ѵ�.
	 * 	ex1) ���(Ŭ����) , ȫ�浿(��ü/�ν��Ͻ�) 
	 * 	ex2) ���(Ŭ����) , �Ƿη�(��ü/�ν��Ͻ�) 
	 * 	ex2) �ڵ���(Ŭ����) , ���������(��ü/�ν��Ͻ�)
	 * 	-> ��, ��ü(�ν��Ͻ�)�� �Ӽ�+��ɿ� ���� Ư������ �� �ִ�(������ �� �ִ�) �繰 ���� �ǹ��ϰ� 
	 * 	   Ŭ������ �ش� ��ü(�ν��Ͻ�)�� �߻�ȭ�ϰ� �����ϱ� ���� ���赵�� �ǹ��Ѵ�.
	 * 3. Ŭ������ �������
	 * 	1) �Ӽ�(����ʵ�)
	 * 	2) ���(�޼���) : ������, ��ɸ޼���, getter/setter
	 * 	
	 */
public class Car {
	
	// �Ӽ�(��� �ʵ�)
	public String name;
	public String color;
	public String gear;
	public int price;
	
	/** ������(Constructor) - ��ü �ʱ�ȭ �޼���
	 *  1. �����ڴ� ��ü�� ������ �� ���� ���� ȣ��Ǵ� �޼���� �ѹ��� ȣ��ȴ�.
	 *  2. �ν��Ͻ�(��ü) ������ �����ڰ� �ƴ� new �����ڰ� �����Ѵ�.
	 *  3. Ŭ������ ������ �޼��尡 ���� �� �⺻�����ڰ� �����ȴ�.
	 *  4. ������ �����ε��� ���� �ν��Ͻ� ���� �� ����ʵ带 �ʱ�ȭ�� �� �ִ�.
	 *  4. ������ �޼��尡 2�� �̻�(�����ε�)�� �� �⺻�����ڰ� �ݵ�� �����ؾ��Ѵ�.
	 */
	
	// �⺻ ������(�޼���)
	public Car() {
		System.out.println("Car�� �����Ǿ����ϴ�.");
	}
	// ������ �����ε�(�޼���)
	public Car(String name, String color, String gear, int price) {
		this.name = name;
		this.color = color;
		this.gear = gear;
		this.price = price;
	}
	
	// ���(�޼���)
	public void run() {
		System.out.println(this.name + " : Run~~");
	}
	
	public void stop() {
		System.out.println(this.name + " : Stop!");
	}
	
	public void carInfo() {
		System.out.println("========myCarInfo========");
		System.out.println("name : " + this.name);
		System.out.println("color : " + this.color);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("===========end===========");
	}
}
