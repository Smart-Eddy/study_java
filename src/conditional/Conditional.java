package conditional;

import java.util.Scanner;

public class Conditional {
	
	/**
	 * @ ���ǹ�(Conditional)
	 * 1. ���ǹ��� ������ true/false ����� ���� ���α׷��� �帧�� �����ϴ� �ڵ带 ���Ѵ�.
	 * 2. ������ ����� ���� ���� ���� �Ǵ� ���� ���Ϸ� ���α׷��� �б��ϰ� �ȴ�.
	 * 3. �츮�� �ϻ��Ȱ���� �� ���� ������ �ϴ� ��ó�� ���α׷��� ��쿡 ���� �����ϰ� �б��Ͽ� �帧�� �����Ѵ�.
	 * 4. ��ǥ������ if��(��������)�� switch��(��������)�� �ִ�.
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// if��
		if(num1 < num2) {
			System.out.println("if : num1�� num2���� �۽��ϴ�.");
		}
		
		// if-else��
		if(num1 > num2) {
			System.out.println("if-else : num1�� num2���� �۽��ϴ�.");
		} else {
			System.out.println("if-else : num1�� num2���� ũ�� �ʽ��ϴ�.");
		}
		
		// if-else-if��
		if(num1 > num2) {
			System.out.println("if-else-if : num1�� num2���� Ů�ϴ�.");
		} else if(num1 < num2){
			System.out.println("if-else-if : num1�� num2���� �۽��ϴ�.");
		}else if(num1 == num2) {
			System.out.println("if-else-if : num1�� num2�� �����ϴ�.");
		}else {
			System.out.println("if-else-if : num1�� num2�� ũ���� ������ ������ �ʽ��ϴ�.");
		}
		
		// switch��
		// switch���� �Է°��� case�� ���ǰ� �´ٸ� �ش� case�� �ڵ尡 ����ȴ�.
		// break ���� ������ switch���� �������´�.
		// default���� case�� �´� �Է°��� ���� �� �⺻������ ����ȴ�.(�ɼ�)
		System.out.println("������ �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		switch(score) {
			case 100 :
			case  90 : System.out.println("��");
				break;
			case 80 : System.out.println("��");
				break;
			case 70 : System.out.println("��");
				break;
			default : System.out.println("�ٽ� �õ��ϼ���!!!");
				break;
		}
		scanner.close();

	}

}
