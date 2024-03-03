package format;


public class Format {
	
	/**
	 * @ ���Ĺ���(Format specifier)
	 * 1. String.format() / System.out.printf() �޼��忡�� ����� �� �ִ�.
	 * 2. ���Ĺ��ڴ� ���ڿ� ������ Ư���� �������� �����͸� �� ����� �� ����Ѵ�.
	 * 3. �Ϲ������� % ��ȣ�� �Բ� ���ǰ� ����� �������� ������ ���� ����� ���Ĺ��ڰ� ������ �ִ�.
	 *
	 */
	public static void main(String[] args) {
		// ����
		int formatNum = 30;
		// %d : 10����
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d(10����)�� �Դϴ�.\n", formatNum);
		// %o : 8����
		System.out.printf("������ ����� %o(8����)�� �Դϴ�.\n", formatNum);
		// %x : 16����
		System.out.printf("������ ����� %x(16����)�� �Դϴ�.\n", formatNum);
		
		// ���� : %c
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�\n", 'a', 'A');
		// ���ڿ� : %s
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", "java", "JAVA");
		
		// �Ǽ�
		System.out.printf("d = %f\n", 1.14);
		
		// ���Ĺ��� �����ϱ�
		System.out.println("==���� ����==");
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		System.out.println("==������ ����==");
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		// ���Ĺ��� �Ҽ��� �����ϱ�
		System.out.println("==�Ҽ��� �����ϱ�==");
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
		
		
	
	}

}
