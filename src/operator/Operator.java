package operator;


public class Operator {

	/**
	 * @ ������(Operator)
	 * 1. ���׿�����
	 *	- �ǿ����ڰ� �ϳ��� ����
	 *	ex ) +x, -x, !x
	 * 2. ���׿�����
	 * 	- �ǿ����ڰ� �ΰ� ����
	 * 	ex ) x=y, x<y, x!=y
	 *  3. ���׿�����
	 * 	- �ǿ����ڰ� ���� ����(���ǽ��� true��� true, false��� false�� ����
	 * 	ex ) [���ǽ�] : [��1] ? [��2]
	 */
	public static void main(String[] args) {
		
		// ���Կ����� =
		// �������� ���� ���ʿ� �����ϴ� ������
		int x = 10; int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// ��������� +, -, *, /, %
		x = 10; y = 20;
		System.out.println("x + y = " + (x + y)); // ����
		System.out.println("x - y = " + (x - y)); // ����
		System.out.println("x * y = " + (x * y)); // ����
		System.out.println("x / y = " + (x / y)); // ������
		System.out.println("x % y = " + (x % y)); // ������
		
		// ���� ���Կ����� +=, -=, *=, /=, %=
		// ���Կ����ڿ� ��������ڸ� �����Ͽ� ����� �� �ִ�.
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		System.out.println("x -= 10 : " + (x -= 10));
		System.out.println("x *= 10 : " + (x *= 10));
		System.out.println("x /= 10 : " + (x /= 10));
		System.out.println("x %= 10 : " + (x %= 10));
		
		// ���迬���� >, <, >=, <=, ==, !=
		// �ǿ����ڸ� ���Ͽ� ����� true/false�� �����Ѵ�.
		x = 10; y = 20;
		System.out.println("x > y : " + (x > y)); // x�� y���� ũ��
		System.out.println("x > y : " + (x < y)); // x�� y���� �۴�
		System.out.println("x > y : " + (x >= y)); // x�� y���� ũ�ų� ����
		System.out.println("x > y : " + (x <= y)); // x�� y���� �۰ų� ����
		System.out.println("x > y : " + (x == y)); // x�� y�� ����
		System.out.println("x > y : " + (x != y)); // x�� y�� ���� �ʴ�.
		
		// �������� &&(AND), ||(OR), !(NOT)
		// �ǿ������� �� ������ �����ϰ� ������� true/false�� �����Ѵ�.
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2)); // ����(AND) : �ǿ����� ��� true�� ���� true
		System.out.println("b1 || b2 : " + (b1 || b2)); // ����(OR) : �ǿ����� �� �ϳ��� true�̸� true
		System.out.println("!b1 : " + !b1); // ����(NOT) : true�� false�� ���� ��Ų��.(���׿�����)
		System.out.println("!b2 : " + !b2);
		// ��Ʈ��Ŷ(Short Circuit)
		// ��Ʈ ��Ŷ�� �� ���� ���� �� �ʿ� ���� ��������� �������� �ʴ� ���� �ǹ��Ѵ�.
		// ���� ���տ��꿡�� (b1 || b2) �� �� b1�� ��(true)��� b2�� ������ �������� �ʴ´�.
		// CPU�� ���ʿ��� ������ ������ �ʿ䰡 ����.
		// ������ ������ �� ��Ʈ��Ŷ�� �����Ͽ� ���ɼ��� ���� �� ��������� ���ʿ� �δ� ���� ����.
		
		// ����������
		x = 10;
		System.out.println("++x : " + (++x)); //�� ����, �� ����
		x = 10;
		System.out.println("--x : " + (--x)); // �� ����, �� ����
		x = 10;
		System.out.println("x++ : " + (x++)); // �� ����, �� ����
		System.out.println("x : " + (x));
		x = 10;
		System.out.println("x-- : " + (x--)); // �� ����, �� ����
		System.out.println("x : " + (x));
		
		// ���׿����� [���ǽ�] ? [��1] : [��2]
		// ���ǽ��� ���̸� [��1]�� ����ǰ�, �����̶�� [��2]�� ����ȴ�.
		x = 10; y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result); // x�� y���� ũ�� �ʱ� ������ false -> [��2]�� ����ȴ�.
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result); // x�� y���� �۱� ������ true -> [��1]�� ����ȴ�.
		// ���׿����ڴ� ���� ����ó�� ���Կ����ڿ� �Բ� ���� �� �ִ�.
		
		// ��Ʈ������ &, |, ^
		// �����͸� ��Ʈ(bit)������ ȯ���Ͽ� ������ ����, �ٸ� �����ڿ� ���� ���� �ӵ��� ���ȴ�.
		x = 2; // 0000 0010 
		y = 3; // 0000 0011
	
		//	AND ������ : x�� y�� ��� 1�̸� 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0010 (2)
		System.out.println("x & y : " + (x & y)); 
		
		//	OR ������ : x�� y�� �ϳ��� 1�̸� 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0011 (3)
		System.out.println("x | y : " + (x | y));
		
		//	XOR ������ : x�� y�� ������ 0, �ٸ��� 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0001 (1)
		System.out.println("x ^ y : " + (x ^ y)); 
		
	}

}
