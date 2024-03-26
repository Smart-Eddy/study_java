package operator;


public class Operator {

	/**
	 * @ 연산자(Operator)
	 * 1. 단항연산자
	 *	- 피연산자가 하나만 존재
	 *	ex ) +x, -x, !x
	 * 2. 이항연산자
	 * 	- 피연산자가 두개 존재
	 * 	ex ) x=y, x<y, x!=y
	 *  3. 삼항연산자
	 * 	- 피연산자가 세개 존재(조건식이 true라면 true, false라면 false를 대입
	 * 	ex ) [조건식] : [식1] ? [식2]
	 */
	public static void main(String[] args) {
		
		// 대입연산자 =
		// 오른쪽의 값을 왼쪽에 대입하는 연산자
		int x = 10; int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 산술연산자 +, -, *, /, %
		x = 10; y = 20;
		System.out.println("x + y = " + (x + y)); // 덧셈
		System.out.println("x - y = " + (x - y)); // 뺄셈
		System.out.println("x * y = " + (x * y)); // 곱셈
		System.out.println("x / y = " + (x / y)); // 나눗셈
		System.out.println("x % y = " + (x % y)); // 나머지
		
		// 복합 대입연산자 +=, -=, *=, /=, %=
		// 대입연산자와 산술연산자를 결합하여 사용할 수 있다.
		x = 10;
		System.out.println("x += 10 : " + (x += 10));
		System.out.println("x -= 10 : " + (x -= 10));
		System.out.println("x *= 10 : " + (x *= 10));
		System.out.println("x /= 10 : " + (x /= 10));
		System.out.println("x %= 10 : " + (x %= 10));
		
		// 관계연산자 >, <, >=, <=, ==, !=
		// 피연산자를 비교하여 결과를 true/false로 리턴한다.
		x = 10; y = 20;
		System.out.println("x > y : " + (x > y)); // x가 y보다 크다
		System.out.println("x > y : " + (x < y)); // x가 y보다 작다
		System.out.println("x > y : " + (x >= y)); // x가 y보다 크거나 같다
		System.out.println("x > y : " + (x <= y)); // x가 y보다 작거나 같다
		System.out.println("x > y : " + (x == y)); // x가 y와 같다
		System.out.println("x > y : " + (x != y)); // x가 y와 같지 않다.
		
		// 논리연산자 &&(AND), ||(OR), !(NOT)
		// 피연산자의 논리 연산을 수행하고 결과값을 true/false로 리턴한다.
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2)); // 논리곱(AND) : 피연산자 모두 true일 때만 true
		System.out.println("b1 || b2 : " + (b1 || b2)); // 논리합(OR) : 피연산자 중 하나라도 true이면 true
		System.out.println("!b1 : " + !b1); // 부정(NOT) : true와 false를 반전 시킨다.(단항연산자)
		System.out.println("!b2 : " + !b2);
		// 쇼트서킷(Short Circuit)
		// 쇼트 서킷은 논리 연산 과정 중 필요 없는 연산과정은 연산하지 않는 것을 의미한다.
		// 만약 논리합연산에서 (b1 || b2) 일 때 b1이 참(true)라면 b2의 연산은 수행하지 않는다.
		// CPU는 불필요한 연산을 수행할 필요가 없다.
		// 논리식을 구성할 때 쇼트서킷을 생각하여 가능성이 높은 논리 연산과정을 앞쪽에 두는 것이 좋다.
		
		// 증감연산자
		x = 10;
		System.out.println("++x : " + (++x)); //선 증가, 후 연산
		x = 10;
		System.out.println("--x : " + (--x)); // 선 감소, 후 연산
		x = 10;
		System.out.println("x++ : " + (x++)); // 선 연산, 후 증가
		System.out.println("x : " + (x));
		x = 10;
		System.out.println("x-- : " + (x--)); // 선 연산, 후 감소
		System.out.println("x : " + (x));
		
		// 삼항연산자 [조건식] ? [식1] : [식2]
		// 조건식이 참이면 [식1]이 실행되고, 거짓이라면 [식2]가 실행된다.
		x = 10; y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result); // x가 y보다 크지 않기 때문에 false -> [식2]가 실행된다.
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result); // x가 y보다 작기 때문에 true -> [식1]이 실행된다.
		// 삼항연산자는 위의 예제처럼 대입연산자와 함께 사용될 수 있다.
		
		// 비트연산자 &, |, ^
		// 데이터를 비트(bit)단위로 환산하여 연산을 수행, 다른 연산자에 비해 연산 속도가 향상된다.
		x = 2; // 0000 0010 
		y = 3; // 0000 0011
	
		//	AND 연산자 : x와 y가 모두 1이면 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0010 (2)
		System.out.println("x & y : " + (x & y)); 
		
		//	OR 연산자 : x와 y중 하나라도 1이면 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0011 (3)
		System.out.println("x | y : " + (x | y));
		
		//	XOR 연산자 : x와 y가 같으면 0, 다르면 1
		//	0000 0010
		//	0000 0011
		//	---------
		//	0000 0001 (1)
		System.out.println("x ^ y : " + (x ^ y)); 
		
	}

}