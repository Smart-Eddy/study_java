package constructor;


public class Construtor {
	/**
	 * @ ������ 
	 * 1. default �����ڰ� ���� �� �����Ϸ��� default �����ڸ� �ڵ����� �������ش�.
	 * 2. ������ ��������� ������(������ �����ε�)�� �ִٸ� default �����ڸ� ���������� �ʱ� ������ ��� ���־�� �Ѵ�.
	 * @ this
	 * 1. �ڹٿ��� ��ü �ڱ� �ڽ��� ����Ű�� Ű�����̴�.
	 * 2. ��ü ���ο��� �����ڳ� setter ���� ���� ���� ������ �� thisŰ���带 ���ؼ� ��������(�������)��
	 *    �޼����� �Ķ���ͷ� ���ԵǴ� ���������� ���� ������ �� �ִ�. 
	 */
	
	public static void main(String[] args) {
		
		// ��ü ������ ������ ȣ��()
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass(100);
		int[] iArr = {10, 20, 30};
		ObjectClass obj3 = new ObjectClass("Hello", iArr);
		
	}

}
