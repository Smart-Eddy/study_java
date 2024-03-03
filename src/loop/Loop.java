package loop;

import java.util.Scanner;

public class Loop {
	
	/**
	 * @ �ݺ���(Loop)
	 * 1. ���α׷� ������ Ư�� ���ǿ� ���� �ݺ������� �����ϴ� ���̴�.
	 * 2. �ݺ����� �⺻������ for�� while�� do-while�� ���� �ִ�.
	 * 3. �ݺ��� ������ break, continue ���� ���ؼ� �ݺ����� ��� �����ϴ�.
	 * 4. ���α׷��Ӱ� �ݺ����� ���ǽ��� �� �� �ۼ��� �� ���ѷ����� �߻��ؼ� �ý����� ��������� ���� ������ ��������.
	 */
	public static void main(String[] args) {
		// for��
		// for([�ʱⰪ];[���ǽ�];[������])���� �����ǰ� ������ true�� ���� �ݺ� ����ȴ�.
		// �迭�̳� ����Ʈ ���� ���ӵ� �ڷᱸ���� ����� �� �����ϴ�.
		System.out.printf("[for]����� �������� �� �� �Դϱ�? : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		System.out.printf("%d ���� ����մϴ�!!\n", inputNum);
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		// while��
		// for���� �ʱⰪ, ���ǽ�, ������ ���� for�� ������ �ѹ��� �ۼ��ϴ� �Ͱ� �ٸ���
		// while()���� ���ǽĸ��� �� �� �ִ�.
		// �ʱⰪ�� �������� while�� ���̳� ������ �ۼ� ���־���Ѵ�.
		// ���α׷����� Ư�� ������ �ƴ� �� ����ؼ� ����Ǿ�� �� �� ����ϸ� �����ϴ�.
		System.out.printf("[while]����� �������� �� �� �Դϱ�? : ");
		inputNum = scanner.nextInt();
		System.out.printf("%d ���� ����մϴ�!!\n", inputNum);
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
			i++;
		}
		
		// do-while��
		// do-while������ do���� 1���� ������ ����ȴ�.
		// do�� ���� �� while���� ���ǿ� ���� �� �ݺ����� ������ �����ϰ� �ȴ�.
		int j = 10;
		do {
			System.out.println("[do]������ 1���� ����˴ϴ�.");
			j++;
		}while(j < 13); // ���ǽ��� false���� ���� �ѹ��� ������ ����ȴ�.

	}

}
