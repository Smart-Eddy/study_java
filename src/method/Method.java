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
		
		//child.mySecret(); ���������� private�̱� ������ �ܺο��� ���� �Ұ���
	}
}
