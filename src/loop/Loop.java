package loop;

import java.util.Scanner;

public class Loop {
	
	/**
	 * @ 반복문(Loop)
	 * 1. 프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것이다.
	 * 2. 반복문은 기본적으로 for문 while문 do-while문 등이 있다.
	 * 3. 반복문 내에서 break, continue 문을 통해서 반복문의 제어가 가능하다.
	 * 4. 프로그래머가 반복문의 조건식을 잘 못 작성할 시 무한루프가 발생해서 시스템이 강제종료될 수도 있으니 조심하자.
	 */
	public static void main(String[] args) {
		// for문
		// for([초기값];[조건식];[증감식])으로 구성되고 조건이 true일 동안 반복 실행된다.
		// 배열이나 리스트 등의 연속된 자료구조와 사용할 때 유용하다.
		System.out.printf("[for]출력할 구구단은 몇 단 입니까? : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		System.out.printf("%d 단을 출력합니다!!\n", inputNum);
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		// while문
		// for문이 초기값, 조건식, 증감식 등을 for문 내에서 한번에 작성하는 것과 다르게
		// while()에는 조건식만이 들어갈 수 있다.
		// 초기값과 증감식은 while문 밖이나 내에서 작성 해주어야한다.
		// 프로그램에서 특정 조건이 아닐 때 계속해서 실행되어야 할 때 사용하면 유용하다.
		System.out.printf("[while]출력할 구구단은 몇 단 입니까? : ");
		inputNum = scanner.nextInt();
		System.out.printf("%d 단을 출력합니다!!\n", inputNum);
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
			i++;
		}
		
		// do-while문
		// do-while문에서 do문은 1번은 무조건 수행된다.
		// do문 수행 후 while문의 조건에 따라 더 반복할지 멈출지 결정하게 된다.
		int j = 10;
		do {
			System.out.println("[do]무조건 1번은 실행됩니다.");
			j++;
		}while(j < 13); // 조건식이 false여도 최초 한번은 무조건 실행된다.

	}

}
