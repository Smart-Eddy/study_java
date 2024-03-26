package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		DatahidingStudent student = new DatahidingStudent();
		
		// DatahidingStudent Class의 속성(멤버변수)는 private이기 때문에 외부에서 직접적으로 접근이 불가능하다.
		// 멤버변수(데이터)에 접근하기 위해 public 메서드인 getter,setter를 인터페이스로 활용해서 멤버변수의 값에 입/출력이 가능하다.
		
		// setter를 통한 값 입력
		student.setName("lee");
		student.setScore(99);
		
		// getter를 통한 값 출력
		System.out.println(student.getName());
		System.out.println(student.getScore());
	}

}
