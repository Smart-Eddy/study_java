package constructor;

public class ObjectClass {
	
	int i;
	String str;
	int iArr[];

	// default �����ڰ� �������� ������ ������ ������ �ڵ����� default �����ڰ� �����ȴ�.
	
	public ObjectClass() {
		System.out.println("==defalut ObjectClass()==");
	}
	 

	// ��������� ������(������ �����ε�)
	public ObjectClass(int i) {
		System.out.println("==Overroding1 ObjectClass()==");
		this.i = i;
		System.out.println("i = " + i);
	}

	// ��������� ������(������ �����ε�)
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
