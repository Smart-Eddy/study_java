package method;


public class Child {
	/**
	 * @ 메서드(Method)
	 * 1. 절차지향언어에서 사용하는 함수(Function)을 객체지향언어에서는 메서드(Method)라고 부른다.
	 * 2. 메서드도 변수와 같이 선언 및 정의 후 필요한 곳에서 메서드를 호출()하여 사용한다.
	 * 3. 메서드의 선언 및 정의 형식은 [접근제어자] [반환타입] [메서드명 : 주소] [매개변수] { 로직 } 형식으로 작성한다.
	 * 4. 프로그램 내에서 같은 작업을 여러번 수행해야 한다면, 그 작업을 수행하는 메서드를 작성하고 필요할 때마다
	 *    해당 함수를 호출하여 코드를 재사용하는 것이 유지보수에도 좋다.
	 * 5. 자바에 존재하는 접근제어자(public, private, protected)에에 따라 호출 범위가 변경될 수 있다.
	 */
	
	public String name;
	public String gender;
	public int age;
	
	public Child() {
		System.out.println("====Child Class Constructor====");
	}
	
	
	public void getInfo() {
		System.out.println("====getInfo()====");
		System.out.println("name : " + this.name);
		System.out.println("gender : " + this.gender);
		System.out.println("age : " + this.age);
		//mySecret(); 접근제어자 private 클래스 내부에서는 접근 가능
	}
	
	// 메서드 오버로딩(Method Overloading)
	// 만약 같은 작업을 수행해야 하는 메서드에서 매개변수의 개수 혹은 타입이 다른 메서드가 필요하다면 
	// 오버로딩을 이용해서 메서드명을 하나로 통일해서 유지보수성을 높일 수 있다.
	// 대표적으로 System.out.println() 또한 오버로딩을 통해 하나의 메서드명으로 여러 자료형을 처리할 수 있다.
	public void getInfo(String param1, String pram2r) {
		System.out.println("====getInfo("+param1 + ", " + pram2r+")====");
	}
	
	public void setInfo(String name, String gender, int age) {
		System.out.println("====setInfo()====");
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	private void mySecret(){
		System.out.println("== mySecret is private ==");
	}
	
}