package innerclass;

public class Outer {
	
	int num = 10;
	String str1 = "java";
	static String str2 = "world";
	
	public Outer() {
		System.out.println("==Outer constructor==");
	}
	
	/**
	 * @ InnerClass(내부클래스)
	 * 1. 다른 클래스 내부에 정의된 클래스를 말한다.
	 * 2. Inner클래스는 다른 클래스의 멤버로 간주되고 외부클래스의 메서드에서만 사용할 경우 선언하는 경우가 있다.
	 * 3. Inner클래스는 Outer클래스의 멤버 변수 및 메서드에 대한 접근이 자유롭다.
	 * 4. Inner클래스에서 Outer클래스의 private 멤버에도 접근이 가능하다.
	 * 	-> Inner클래스는 코드의 응집성을 높이고 관련된 클래스를 그룹화할 때는 유용하다.
	 * 	-> 하지만 코드의 가독성과 데이터를 공유해서 사용하는 것만이 그리 좋지 않기 때문에 잘 사용되지는 않는다.
	 */
	class Inner{
		int num = 100;
		// Inner클래스를 통해 Outer클래스의 멤버에 접근 가능
		String str3 = str1;
		
		public Inner() {
			System.out.println("==Inner constructor==");
		}
	}
	
	static class SInner{
		int num = 1000;
		// static 클래스는 외부 클래스 멤버에 접근 X (메모리 생성 시점과 구역이 다름)
		// String str4 = str1;
		String str4 = str2;
		
		public SInner() {
			System.out.println("==SInner constructor==");
		}
	}
}
