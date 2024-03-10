package constructor;


public class Construtor {
	/**
	 * @ 생성자 
	 * 1. default 생성자가 없을 시 컴파일러가 default 생성자를 자동으로 생성해준다.
	 * 2. 하지만 사용자정의 생성자(생성자 오버로딩)이 있다면 default 생성자를 생성해주지 않기 때문에 명시 해주어야 한다.
	 * @ this
	 * 1. 자바에서 객체 자기 자신을 가르키는 키워드이다.
	 * 2. 객체 내부에서 생성자나 setter 등을 통해 값을 셋팅할 때 this키워드를 통해서 전역변수(멤버변수)와
	 *    메서드의 파라미터로 들어가게되는 지역변수를 쉽게 구별할 수 있다. 
	 */
	
	public static void main(String[] args) {
		
		// 객체 생성시 생성자 호출()
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass(100);
		int[] iArr = {10, 20, 30};
		ObjectClass obj3 = new ObjectClass("Hello", iArr);
		
	}

}
