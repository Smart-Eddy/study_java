package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	/**
	 * @ 배열(Array)
	 * 1. 배열은 인덱스를 이용해서 자료형이 동일한 데이터를 관리할 수 있는 자료구조이다.
	 * 2. 동일한 데이터 타입의 변수가 메모리에 연속적으로 배치되게 된다.
	 * 3. Java의 배열에서 한번 선언된 배열의 크기는 다시 변경될 수 없다.
	 * 4. 배열에 접근하기 위해서는 배열의 첫번째 주소값을 알면 된다.
	 * 5. 배열의 주소값은 배열의 이름(변수명)이다. -> 즉 배열의 이름은 배열의 시작주소가 된다.
	 * 6. Java는 배열을 객체로 관리한다. 배열 선언 후 초기화 하지 않았다면 해당 타입의 기본값으로 설정된다.
	 * 	- 타입별 기본값
	 * 		1) 참조형 : null
	 * 		2) 정수형 : 0
	 * 		3) 실수형 : 0.0
	 * 		4) 논리형 : false
	 * 		5) 문자형 : ' '(공백)
	 */
	public static void main(String[] args) {
		// 배열 선언 후 초기화
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		// 인덱스에 접근해서 값에 접근 가능하다.
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		// 배열 선언과 초기화를 동시에 하기.
		int[] arr2 = {10, 20, 30};
		// 배열같이 인덱스를 활용하는 자료구조는 반복문을 통해서 접근하는 것이 효율적이다.
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("for문 : arr2[" + i + "] = " + arr2[i]);
		}
		
		// 배열 복사와 참조
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// arrAtt1의 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		// arrAtt1의 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// 배열 요소 복사
		// Arrays.copyOf() 메서드는 배열의 요소(값)만 복사해서 새로운 배열을 생성한다.
		// -> 즉 arrAtt1 배열과 arrAtt3 배열은 값은 같지만 같은 객체가 아니다.
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// 배열 참조
		// arrAtt2 배열은 arrAtt1 배열의 시작 주소 값을 가르키고 있다.
		// -> 즉 arrAtt1 배열과 arrAtt2 배열은 같은 메모리 주소를 가르키고 있다.
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		// 다차원 배열
		// 다차원 배열은 배열안에 또 다른 배열이 있는 배열이다.
		// 2차원 배열까지는 종종 사용하지만 3차원 이상부터는 잘 사용하지 않는다.
		// 배열안에 배열이 있는 구조일 뿐이지 일반 배열과 접근하는 방식이나 사용법은 같다.
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
		
		
		// 배열을 이용한 학사관리 프로그램 예제
		System.out.println("==========배열을 이용한 학사관리 프로그램==========");
		String[] names = {"박지성", "손흥민", "김민재", "안정환"};
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		double avg = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s의 점수를 입력하세요! : ", names[i]);
			scores[i] = scanner.nextInt();
			System.out.printf("%s 점수 : \t%.2f\n", names[i], (double)scores[i]);
			avg += (double)scores[i]/names.length;
		}
		System.out.println("=====================================");
		System.out.printf("평균점수 : \t%.2f\n", avg);
		scanner.close();
		

	}

}