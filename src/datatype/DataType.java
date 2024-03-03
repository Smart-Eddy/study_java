package datatype;


public class DataType {
	
	/**
	 * @ �ڷ���(DataType)
	 * 1. �ڷ����� ���� ũ���� �޸𸮿� ����� ����(�ڷ�)�� �ؼ��ϴ� ����̴�.
	 * 2. ��, �����Ϸ��� �޸��� ���̳ʸ��� ���̸� �ĺ��ϴ� ����̴�.
	 * 3. �⺻ �ڷ���(Primitive Type)
	 * 		�� ������
	 * 			1) byte : 1byte
	 * 			2) short : 2byte
	 * 			3) int : 4byte
	 * 			4) long : 8byte
	 * 		�� �Ǽ���
	 * 			1) float : 4byte
	 * 			2) double : 8byte
	 * 		�� ����
	 * 			1) boolean : 1byte
	 * 		�� ������
	 * 			1) char : 2byte
	 * 4. ���� �ڷ���(Reference Type)
	 *		- ���� �ڷ����� ��ü�� �����Ͽ� ���Ǵ� ������ Ÿ���̴�.
	 *		- ���� �ڷ����� ��ü�� �޸� �ּҸ� �����ϰ� ������ �ش� ��ü�� ����Ű�� ������ ������ �ȴ�.
	 *		- ��ǥ������ Ŭ����(class), �迭(Array), �������̽�(Interface), ������(enum) ���� �ְ� ����ڰ� ���� ������
	 *		  Ŭ������ Java API���� �����ϴ� Ŭ���� �� �پ��� �����ڷ����� �����Ѵ�.
	 *		- ���� �ڷ����� Null ���� ���� �� �ְ� �̴� �ƹ��� ��ü�� ����Ű�� �ʴ� ���¸� ��Ÿ�� �� �ִ�.
	 *		- ��ü(���� �ڷ���)�� ���� �� �� �� �޸𸮿� ���� �Ǿ��ٰ� �� �̻� ������ ���� �� GC(������ �÷���)�� ����� �ȴ�.
	 */
	public static void main(String[] args) {
		// �⺻ �ڷ���(Primitive Type)
		
		System.out.println("==========������==========");
		// byte(1byte)
		byte by = 1;
		System.out.println("by : " + by);
		// short(2byte)
		short s = 2;
		System.out.println("s : " + s);
		// int(4byte)
		int i = 4;
		System.out.println("i = " + i);
		//long(8byte)
		long l = 8;
		System.out.println("l = " + l);
		
		System.out.println("==========�Ǽ���==========");
		// float(4byte)
		float f = 4.0f;
		System.out.println("f = " + f);
		// double(8byte)
		double d = 8.0;
		System.out.println("d = " + d);
		
		System.out.println("==========����==========");
		// boolean(1byte, true/false)
		boolean b = false;
		System.out.println("b = " + b);
		
		System.out.println("==========������==========");
		// char(2byte)
		char c = 'a';
		System.out.println("c = " + c);
		
		// ���� �ڷ���(Reference Type)
		System.out.println("==========���ڿ�==========");
		// new Ű���带 ���� ��ü ������ �����ϴ�.
		// String str = new String("Hello Java World!");
		String str = "hello Java World!";
		System.out.println("str = " + str);
		
	}

}
