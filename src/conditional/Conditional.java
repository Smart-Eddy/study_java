package conditional;

import java.util.Scanner;

public class Conditional {
	
	/**
	 * @ 조건문(Conditional)
	 * 1. 조건문은 조건의 true/false 결과에 따라 프로그램의 흐름을 제어하는 코드를 말한다.
	 * 2. 조건의 결과에 따라 양자 택일 또는 다자 택일로 프로그램이 분기하게 된다.
	 * 3. 우리가 일상생활에서 수 많은 선택을 하는 것처럼 프로그램도 경우에 따라 선택하고 분기하여 흐름을 제어한다.
	 * 4. 대표적으로 if문(양자택일)과 switch문(다자택일)이 있다.
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// if문
		if(num1 < num2) {
			System.out.println("if : num1은 num2보다 작습니다.");
		}
		
		// if-else문
		if(num1 > num2) {
			System.out.println("if-else : num1은 num2보다 작습니다.");
		} else {
			System.out.println("if-else : num1은 num2보다 크지 않습니다.");
		}
		
		// if-else-if문
		if(num1 > num2) {
			System.out.println("if-else-if : num1은 num2보다 큽니다.");
		} else if(num1 < num2){
			System.out.println("if-else-if : num1은 num2보다 작습니다.");
		}else if(num1 == num2) {
			System.out.println("if-else-if : num1은 num2와 같습니다.");
		}else {
			System.out.println("if-else-if : num1은 num2와 크지도 작지도 같지도 않습니다.");
		}
		
		// switch문
		// switch문에 입력값이 case에 조건과 맞다면 해당 case의 코드가 실행된다.
		// break 문을 만나면 switch문을 빠져나온다.
		// default문은 case에 맞는 입력값이 없을 때 기본적으로 실행된다.(옵션)
		System.out.println("점수를 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		switch(score) {
			case 100 :
			case  90 : System.out.println("수");
				break;
			case 80 : System.out.println("우");
				break;
			case 70 : System.out.println("미");
				break;
			default : System.out.println("다시 시도하세요!!!");
				break;
		}
		scanner.close();

	}

}