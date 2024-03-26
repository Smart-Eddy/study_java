package encapsulation;

	/**
	 * @ 캡슐화(Encapsulation)
	 * 1. Class의 속성(멤버변수)의 접근제어자를 private(Class 내부에서만 접근가능)으로 설정한다.
	 * 2. 멤버변수를 private으로 선언해 누구나 멤버변수의 값에 쉽게 접근하지 못하도록 제한하고 멤버변수에 접근하기 위해서
	 *    public method(getter, setter)를 활용해서 멤버변수에 접근하게 된다.
	 * 3. 이렇게 클래스 내부의 세부적인 구현을 숨기고 public 메서드를 통해서 접근을 통제하여 코드의 안정성과 보안을 향상시킬 수 있는
	 *    기법을 데이터 은닉(Data hiding)이라고 한다.
	 * 4. 데이터은닉은 캡슐화(Encapsulation)의 한 측면으로 데이터와 그 데이터를 다루는 메서드를 하나로 묶는 것을 의미한다.
	 * 5. 캡슐화를 통해서 외부 접근을 제어, 데이터의 유효성을 검사할 수 있다.
	 */
public class DatahidingStudent {
	
	// Class의 속성(멤버변수)의 접근제어자가 만약 public이라면 누구나 접근이 가능하고 값을 변경할 수 있기 때문에 위험하다.
	// public String name;
	
	// 멤버변수(데이터)를 private으로 선언, 외부로 부터 데이터를 쉽게 변질되지 않도록 보호할 수 있다.
	private String name;
	private int score;
	
	public DatahidingStudent() {
	}
	public DatahidingStudent(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// public 메서드인 getter()를 통해서 데이터의 값에 접근(출력)할 수 있다.
	public String getName() {
		return name;
	}

	// public 메서드인 setter()를 통해서 데이터의 값을 변경(입력)할 수 있다.
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	

}