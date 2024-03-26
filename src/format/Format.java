package format;


public class Format {
	
	/**
	 * @ 서식문자(Format specifier)
	 * 1. String.format() / System.out.printf() 메서드에서 사용할 수 있다.
	 * 2. 서식문자는 문자열 내에서 특정한 형식으로 데이터를 입 출력할 때 사용한다.
	 * 3. 일반적으로 % 기호와 함께 사용되고 출력할 데이터의 유형에 따라 사용할 서식문자가 정해져 있다.
	 *
	 */
	public static void main(String[] args) {
		// 정수
		int formatNum = 30;
		// %d : 10진수
		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d(10진수)도 입니다.\n", formatNum);
		// %o : 8진수
		System.out.printf("오늘의 기온은 %o(8진수)도 입니다.\n", formatNum);
		// %x : 16진수
		System.out.printf("오늘의 기온은 %x(16진수)도 입니다.\n", formatNum);
		
		// 문자 : %c
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다\n", 'a', 'A');
		// 문자열 : %s
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		// 실수
		System.out.printf("d = %f\n", 1.14);
		
		// 서식문자 정렬하기
		System.out.println("==왼쪽 정렬==");
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		System.out.println("==오른쪽 정렬==");
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		// 서식문자 소수점 제한하기
		System.out.println("==소수점 제한하기==");
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
		
		
	
	}

}