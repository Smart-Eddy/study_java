package oop;

	/**
	 * @ 클래스 Class
	 * 1. 클래스는 객체를 만들기 위한 설계도(틀)이다.
	 * 2. 클래스는 객체(인스턴스)를 추상화한 분류나 집합을 의미한다.
	 * 	ex1) 사람(클래스) , 홍길동(객체/인스턴스) 
	 * 	ex2) 펭귄(클래스) , 뽀로로(객체/인스턴스) 
	 * 	ex2) 자동차(클래스) , 람보르기니(객체/인스턴스)
	 * 	-> 즉, 객체(인스턴스)는 속성+기능에 따라 특정지을 수 있는(실존할 수 있는) 사물 등을 의미하고 
	 * 	   클래스는 해당 객체(인스턴스)를 추상화하고 생성하기 위한 설계도를 의미한다.
	 * 3. 클래스의 구성요소
	 * 	1) 속성(멤버필드)
	 * 	2) 기능(메서드) : 생성자, 기능메서드, getter/setter
	 * 	
	 */
public class Car {
	
	// 속성(멤버 필드)
	public String name;
	public String color;
	public String gear;
	public int price;
	
	/** 생성자(Constructor) - 객체 초기화 메서드
	 *  1. 생성자는 객체가 생성될 때 제일 먼저 호출되는 메서드로 한번만 호출된다.
	 *  2. 인스턴스(객체) 생성은 생성자가 아닌 new 연산자가 수행한다.
	 *  3. 클래스에 생성자 메서드가 없을 시 기본생성자가 생략된다.
	 *  4. 생성자 오버로딩을 통해 인스턴스 생성 시 멤버필드를 초기화할 수 있다.
	 *  4. 생성자 메서드가 2개 이상(오버로딩)일 때 기본생성자가 반드시 존재해야한다.
	 */
	
	// 기본 생성자(메서드)
	public Car() {
		System.out.println("Car가 생성되었습니다.");
	}
	// 생성자 오버로딩(메서드)
	public Car(String name, String color, String gear, int price) {
		this.name = name;
		this.color = color;
		this.gear = gear;
		this.price = price;
	}
	
	// 기능(메서드)
	public void run() {
		System.out.println(this.name + " : Run~~");
	}
	
	public void stop() {
		System.out.println(this.name + " : Stop!");
	}
	
	public void carInfo() {
		System.out.println("========myCarInfo========");
		System.out.println("name : " + this.name);
		System.out.println("color : " + this.color);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("===========end===========");
	}
}
