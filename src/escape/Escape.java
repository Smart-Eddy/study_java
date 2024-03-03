package escape;

public class Escape {

	/**
	 * @ 특수문자(Escape)
	 * 1. 특수한 목적으로 사용되는 문자로 
	 * 개행이나 탭을 나타내거나 문자열 내에 큰따옴표나 작은따옴표 등을 표기할 때 \(역슬래시)를 붙여 사용한다.
	 */
	public static void main(String[] args) {
		// \t 탭
		System.out.println("Good\tMorning~");
		// \n 개행
		System.out.println("Good\nMorning~");
		// \' 작은 따옴표 표기 
		System.out.println("Good \'Morning~\'");
		// \" 큰 따옴표 표기
		System.out.println("\"Good\" Moring~");

	}

}
