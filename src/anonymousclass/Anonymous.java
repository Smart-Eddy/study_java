package anonymousclass;

public class Anonymous {
	
	/**
	 * @ 익명클래스(Anonymous Class)
	 * 1. 이름이 없이 생성된 클래스이다.
	 * 2. 일반적으로 객체 생성 시 [Class] 참조변수명 = new [Class()]; 방식으로 객체를 생성하고 참조변수를 통해서 객체에 접근하지만
	 * 	  익명클래스같은 경우엔 참조변수없이 new [Class()]; 방식을 통해서 인스턴스를 생성하게 된다.
	 * 3. 익명클래스를 통해서 해당 클래스의 메서드를 Override하고 .(접근연산자)를 통해 Override된 메서드를 호출할 수 있다.
	 * 4. 이름(참조변수)가 없기 때문에 생성 후 다시 접근할 수 없다. 즉 Override가 한번 필요할 때 사용할 수 있다.
	 * 5. 익명클래스는 주로 인터페이스(Interface)나 추상클래스(Abstract)를 구현하거나 확장하는 간단한 클래스를 정의할 때 유용하게 사용하게 된다.
	 * ※ Java에서는 인터페이스나 추상클래스를 구현 및 확장할 때 익명클래스를 생성하고 참조변수를 할당할 수 있게된다.
	 * 	  -> 이를 통해 메인메서드 내에서 익명클래스를 활용하여 인터페이스나 추상클래스를 구현 및 확장할 수 있게 된다. (일반적인 클래스는 참조변수 할당 불가능)
	 */
	public static void main(String[] args) {
		
		// 일반적인 클래스는 익명클래스를 생성할 때 참조변수에 할당할 수 없기 때문에 단 한번만 사용이 가능하다.
		// .(접근연산자)를 사용해서 Override된 메서드를 호출할 수 있다.
		new AnonymousClass() {
			@Override
			public void method() {
				System.out.println("==AnonymousClass Override method() START==");
			}
		}.method();
		
		// 인터페이스나 추상클래스의 익명클래스를 생성할 땐 참조변수에 할당이 가능하다
		// 참조변수에 할당이 가능하기 때문에 익명클래스 생성 후 구현 및 확장된 메서드를 간단하게 사용이 가능하다.
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("==익명 클래스의 RUN()==");
			}
			
		};
		
		Thread myThread = new Thread(myRunnable);
		// 익명클래스를 통해 Override된 run()이 호출된다.
		myThread.run(); 

	}

}
