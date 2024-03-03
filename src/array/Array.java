package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	/**
	 * @ �迭(Array)
	 * 1. �迭�� �ε����� �̿��ؼ� �ڷ����� ������ �����͸� ������ �� �ִ� �ڷᱸ���̴�.
	 * 2. ������ ������ Ÿ���� ������ �޸𸮿� ���������� ��ġ�ǰ� �ȴ�.
	 * 3. Java�� �迭���� �ѹ� ����� �迭�� ũ��� �ٽ� ����� �� ����.
	 * 4. �迭�� �����ϱ� ���ؼ��� �迭�� ù��° �ּҰ��� �˸� �ȴ�.
	 * 5. �迭�� �ּҰ��� �迭�� �̸�(������)�̴�. -> �� �迭�� �̸��� �迭�� �����ּҰ� �ȴ�.
	 * 6. Java�� �迭�� ��ü�� �����Ѵ�. �迭 ���� �� �ʱ�ȭ ���� �ʾҴٸ� �ش� Ÿ���� �⺻������ �����ȴ�.
	 * 	- Ÿ�Ժ� �⺻��
	 * 		1) ������ : null
	 * 		2) ������ : 0
	 * 		3) �Ǽ��� : 0.0
	 * 		4) ���� : false
	 * 		5) ������ : ' '(����)
	 */
	public static void main(String[] args) {
		// �迭 ���� �� �ʱ�ȭ
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		// �ε����� �����ؼ� ���� ���� �����ϴ�.
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		// �迭 ����� �ʱ�ȭ�� ���ÿ� �ϱ�.
		int[] arr2 = {10, 20, 30};
		// �迭���� �ε����� Ȱ���ϴ� �ڷᱸ���� �ݺ����� ���ؼ� �����ϴ� ���� ȿ�����̴�.
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("for�� : arr2[" + i + "] = " + arr2[i]);
		}
		
		// �迭 ����� ����
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// arrAtt1�� ����
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		// arrAtt1�� ��� ���
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// �迭 ��� ����
		// Arrays.copyOf() �޼���� �迭�� ���(��)�� �����ؼ� ���ο� �迭�� �����Ѵ�.
		// -> �� arrAtt1 �迭�� arrAtt3 �迭�� ���� ������ ���� ��ü�� �ƴϴ�.
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// �迭 ����
		// arrAtt2 �迭�� arrAtt1 �迭�� ���� �ּ� ���� ����Ű�� �ִ�.
		// -> �� arrAtt1 �迭�� arrAtt2 �迭�� ���� �޸� �ּҸ� ����Ű�� �ִ�.
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		// ������ �迭
		// ������ �迭�� �迭�ȿ� �� �ٸ� �迭�� �ִ� �迭�̴�.
		// 2���� �迭������ ���� ��������� 3���� �̻���ʹ� �� ������� �ʴ´�.
		// �迭�ȿ� �迭�� �ִ� ������ ������ �Ϲ� �迭�� �����ϴ� ����̳� ������ ����.
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));
		
		
		// �迭�� �̿��� �л���� ���α׷� ����
		System.out.println("==========�迭�� �̿��� �л���� ���α׷�==========");
		String[] names = {"������", "�����", "�����", "����ȯ"};
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		double avg = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s�� ������ �Է��ϼ���! : ", names[i]);
			scores[i] = scanner.nextInt();
			System.out.printf("%s ���� : \t%.2f\n", names[i], (double)scores[i]);
			avg += (double)scores[i]/names.length;
		}
		System.out.println("=====================================");
		System.out.printf("������� : \t%.2f\n", avg);
		scanner.close();
		

	}

}
