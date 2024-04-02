package innerclass;

public class InnerClass {

	public static void main(String[] args) {
		
		// Outer클래스의 멤버변수 접근
		Outer oc = new Outer();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);
		System.out.println();
		
		// Outer클래스 내의 Inner클래스 멤버변수 접근
		Outer.Inner in = oc.new Inner();
		System.out.println("in.num : " + in.num);
		System.out.println("in.str3 : " + in.str3);
		System.out.println();
		
		// Outer클래스 내의 static Inner클래스 멤버변수 접근
		Outer.SInner si = new Outer.SInner();
		System.out.println("si.num : " + si.num);
		System.out.println("si.str4 : " + si.str4);
		System.out.println();
	}

}
