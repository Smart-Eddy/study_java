package oop;

public class Oop {
	
	/**
	 * @ ��ü���� ���α׷���(Object Oriented Programming, OOP)
	 * 1. ���� ������ ��ü(Object)���� �߻�ȭ�Ͽ� �𵨸��Ͽ� Ŭ������ �����.
	 * 2. Ŭ������ ���� ��ü(�ν��Ͻ�)�� ������ ��ġ ���� ��ǰ�� �����ϵ��� ���α׷����ϴ� ����� ���Ѵ�.
	 * 3. ��ü������ 4�� Ư��
	 * 	1) ĸ��ȭ(Encapsulation)
	 *    -> Ŭ������ �Ӽ��� �Ӽ��� �����ϴ� �޼���(getter, setter)�� �ϳ��� ���� �ܺο��� �����ϴ� ���� �����ϴ� ���� ���Ѵ�.
	 *    -> �������� ���Ἲ�� ������ �� �ְ� �ǵ�ġ ���� �������� ���� ������ ��ȭ�� �� �ִ�.
	 * 	2) ���(Inheritance)
	 *    -> ����(�θ�)Ŭ������ �Ӽ��� ������ ����(�ڽ�)Ŭ�������� �����ִ� ���� �ǹ��Ѵ�.
	 *    -> extends Ű���带 ���� ��ӽ�ų �� �ְ� �ڹٿ����� ���� ����� �Ұ����ϴ�.(extends, implements�� ȥ�� ����)
	 *    -> �ڵ��� ���뼺�� ���� �� �ְ� �������� ���� ���� ǥ���� �� �ִ�.
	 * 	3) �߻�ȭ(Polymorphism)
	 *    -> �߻�ȭ�� ��ü�� ����� Ư���� ����, �����Ͽ� �ڵ��� ���⼺�� ���̰� �ڵ��� ���ص��� ���������� �����ϰ� ����� �ش�.
	 * 	4) ������(Abstraction)
	 *    -> �������� �����ε�, �������̵��� ���� ���� �̸��� �޼������ ��Ȱ���ϰų�,
	 *       ���� �޼��带 ȣ���ص� ���� �ٸ� ������ ������ �� �ֵ��� �ϴ� ���� �ǹ��Ѵ�.
	 */
	public static void main(String[] args) {
		// newŰ����� ��ü ���� �� ���� ���� ������ �޼��带 ȣ��()
		// newŰ���带 ���� ������ �ν��Ͻ��� �ּ�(��)�� ��������(����)�� �����ϰ� �ȴ�.
		Car grandeur = new Car();
		grandeur.name = "grandeur";
		grandeur.color = "black";
		grandeur.gear = "auto";
		grandeur.price = 3000;
		grandeur.run();
		grandeur.stop();
		grandeur.carInfo();
		
		// ������ �����ε��� ���� �ν��Ͻ��� ������ �� ����ʵ�(�Ӽ�)�� �ʱ�ȭ�� �� �ִ�. 
		Car ramborgini = new Car("ramborgini", "red", "auto", 100000);
		ramborgini.run();
		ramborgini.stop();
		ramborgini.carInfo();
		
		// ��ü ������ ����
		// granduer�� ramborgini ��ü(�ν��Ͻ�)�� ���� Ŭ������ Car �ڷ����̴�.
		// ��ü�� �����Ǿ��� �� ���޸𸮿� �����ǰ� �̸� ���������� �����Ͽ� ��ü�� ������ �� �ִ�.
		// ������ ��ü(�ν��Ͻ�)�� �� ���� �޸� �ּҸ� ������ �ְ� �� ���� ���� �ٸ� ��ü���� �� �� �ִ�.
		System.out.println("====Object Memory Addrees====");
		System.out.println("car_granduer : " + grandeur);
		System.out.println("car_ramborgini : " + ramborgini);
		
		// ��ü �񱳽� == �񱳿����ڴ� �� ��ü�� ����(�ּ�)�� ���Ѵ�.
		System.out.println("== : " + (grandeur == ramborgini)); // false
		// equals() �޼���� �� ��ü�� ������ ���Ѵ�.
		System.out.println("equals() : " + grandeur.equals(ramborgini)); // false
		// instanceof() �޼���� �� ��ü�� Ÿ��(�ڷ���)�� ���Ѵ�.
		System.out.println("instanceof() : " + (grandeur instanceof Car)); // true
		System.out.println("instanceof() : " + (ramborgini instanceof Car)); // true
		
		// ���������� null�� ����Ǹ� ���������� ��ü�� ������ ����� �� �̻� ��ü�� �̿��� �� ���Եȴ�.
		// null�� ����Ǿ� ������ ����� �Ǹ� GC�� ���ؼ� �޸�(��)���� ���ŵǰ� �ȴ�.
		grandeur.carInfo();
		grandeur = null;
		//grandeur.carInfo(); NullPointerException �߻� 
		
		
	}

}
