package method;

public class Method {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		//child.name = "hong gil dong";
		//child.gender = "M";
		//child.age = 20;
		child.setInfo("hong gil dong", "M", 20);
		
		child.getInfo();
		child.getInfo("method", "overroding");
		
		//child.mySecret(); 접근제어자 private이기 때문에 외부에서 접근 불가능
	}
}