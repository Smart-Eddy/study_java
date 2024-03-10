package constructor;

public class ObjectClass {
	
	int i;
	String str;
	int iArr[];

	// default 생성자가 존재하지 않으면 컴파일 시점에 자동으로 default 생성자가 생성된다.
	
	public ObjectClass() {
		System.out.println("==defalut ObjectClass()==");
	}
	 

	// 사용자정의 생성자(생성자 오버로딩)
	public ObjectClass(int i) {
		System.out.println("==Overroding1 ObjectClass()==");
		this.i = i;
		System.out.println("i = " + i);
	}

	// 사용자정의 생성자(생성자 오버로딩)
	public ObjectClass(String str, int[] iArr) {
		System.out.println("==Overroding2 ObjectClass()==");
		this.str = str;
		this.iArr = iArr;
		System.out.println("str = " + str);
		for(int i : iArr) {
			System.out.println("iArr[] = " + i);
		}
	}



}
