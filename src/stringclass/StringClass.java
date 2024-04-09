package stringclass;

/**
 * @ String 문자열
 * 1. 문자열을 다루는 String(객체)은 데이터가 변하면 메모리상의 변화가 많아 속도가 느리다는 단점이 있다.
 * 2. Java에서 String은 불변(immutable)클래스 라고도 부른다.
 * 3. String은 생성된 문자열 리터럴을 String Pool이라는 메모리 영역에서 관리한다.
 *    ex) "hello" 라는 문자열 리터럴을 여러 번 사용하게 되더라도 이를 하나의 인스턴스로 관리하게 된다.
 * 4. String은 불변객체이기 때문에 한 번 생성된 문자열을 변경할 수 없도록 되어 있다.
 *    즉, 문자열을 변경하게되면 새로운 문자열 객체가 생성되고, 기존의 문자열은 변경되지 않는다.
 *    -> 기존의 문자열이 사용되지 않을 시 GC에 의해서 메모리 회수가 이루어지게 된다.
 * 5. String의 intern() 메서드를 호출하게 되면 문자열을 String Pool에 있는 문자열 리터럴과 동일하게 만들어 문자열 풀에 추가할 수 있다.
 *    -> 이렇게 하면 동일한 문자열을 여러 번 사용하게 되는 경우 메모리 사용을 최적화할 수 있게된다.
 * 6. 문자열 연결 시 (+ 연산자 사용)은 내부적으로 StringBuilder, StringBuffer를 사용해서 처리하게 된다.
 *    -> 따라서 문자열 연결 연산을 반복적으로 수행하는 경우 StringBuffer, StringBuilder를 직접 생성해서 사용하는 것이 성능상 이점이 있다.
 */
public class StringClass {

	public static void main(java.lang.String[] args) {
		// 1) String과 메모리
		// -------------------------------------------------------------------------------------------------
		String str1 = "JAVA"; // 문자열 리터럴 "hello"는 String Pool에 저장된다.
		String str2 = new String("JAVA"); // 새로운 String 객체가 Heap 메모리에 생성된다.
		
		// intern() 메서드를 사용해 문자열을 String Pool에 추가
		String str3 = str2.intern();
		
		// 문자열 리터럴과 intern() 메서드를 사용한 문자열은 동일한 인스턴스를 참조하게 된다.
		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true
		
		// 문자열이 변경되면 기존의 객체를 버리고, 새로운 객체를 메모리에 생성한다. 이떄, 기존 객체는 GC에 의해 메모리 회수가 이루어진다.
		str1 = str1 + "_8";
		System.out.println("String : " + str1);
		
		// 2) StringBuffer, StringBuilder : String의 단점을 보완한 클래스로 데이터가 변경되어도 메모리에서 기존 객체를 재활용한다.
		// -------------------------------------------------------------------------------------------------
		// StringBuffer  : 동기화(Synchronization) 기법을 사용하여 멀티스레드 환경에서 안전하게 사용할 수 있다.
		//				 : 쓰레드 간에 StringBuffer 인스턴스를 공유하고 있는 경우, 한 쓰레드에서 수정 시 다른 쓰레드는 대기하게 된다.
		// -------------------------------------------------------------------------------------------------
		// StringBuilder : StringBuffer보다 속도가 빠르다.
		// 				 : 동기화기법을 사용하지는 않기 때문에 단일스레드환경에서의 사용이 적합하다.
		// 				 : 일반적으로 단일스레드 환경에서는 성능적으로 StringBuffer에 비해 빠르고 유리하다.
		// 				 : 하지만 멀티스레드환경이라면 StringBuffer를 사용하거나 동기화 처리를 해주어야 한다.
		
		StringBuffer sf = new StringBuffer("JAVA");
		sf.append("_8"); // 기존 객체에 append()를 이용해 문자열을 추가
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "!!!");
		System.out.println("StringBuffer : " + sf);
		
		StringBuilder sb = new StringBuilder("JAVA");
		sb.append("_8");
		System.out.println("StringBuilder : " + sb);
	}

}
