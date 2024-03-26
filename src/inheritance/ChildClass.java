package inheritance;

// extends 키워드를 통해서 상위 클래스를 상속시킬 수 있다.
public class ChildClass extends ParentClass{
	
	public ChildClass() {
		System.out.println("==ChildClass constructor==");
	}
	
	public void childFun() {
		System.out.println("==childFun START==");
	}

}
