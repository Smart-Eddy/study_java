package collections;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ Collection
 * 1. Java에서 데이터를 저장하고 관리하기 위한 자료구조를 제공하는 인터페이스의 집합이다.
 * 2. Collection은 배열과 비슷하지만 크기(길이)를 동적으로 조절할 수 있고, 다양한 자료구조를 지원한다.
 * 3. 자주 사용하는 인터페이스로는 List, Map, Set, Queue 등이 있다.
 * 4. 1) List  : 순서가 있는 자료구조, 중복(O) -> ArrayList, LinkedList 등
 *    2) Set   : 순서가 없는 자료구조, 중복(X) -> HashSet, TreeSet 등
 *    3) Map   : 키-값(key-value)쌍의 형식으로 데이터를 관리하는 자료구조 키는 중복(X) -> HashMap, TreeMap, LinkedHashMap 등 
 *    4) Queue : FIFO(First-In-First-Out, 선입선출) 방식으로 데이터를 저장하고 관리하는 자료구조 -> LinkedList, PriorityQueue 등
 *    5) Stack : LIFO(Last-In-First-Out, 후입선출) 방식으로 데이터를 저장하고 관리하는 자료구조 -> LinkedList, Stack 등
 *
 */
public class Collections {

	public static void main(String[] args) {
		/**
		 * @ Generic(제네릭)<>
		 * 1. 컬렉션 생성 시 제네릭 문법을 사용하여 컬렉션에 담길 데이터 타입을 명시해줄 수 있다.
		 * 2. 제네릭을 사용하면 컴파일 시점에 타입을 체크하게 되어 컬렉션에 잘못된 타입의 요소를 추가하는 것을 방지할 수 있다.
		 *   -> 타입 안정성(TypeSafety)을 보장할 수 있다.
		 * 3. 또한 컴파일러가 형변환을 자동으로 처리해주기 때문에 데이터를 가져올 때 형변환을 할 필요가 없어지게 된다.
		 */
		
		System.out.println("===================List Start===================");
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("list.size : " + list.size());
		// 데이터 추가
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list.size : " + list.size());
		System.out.println("list : " + list);
		// 데이터 변경
		list.set(1, "Python");
		System.out.println("list : " + list);
		// 데이터 추출
		String str = list.get(1);
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("str : " + str);
		//데이터 제거
		list.remove(1);
		System.out.println("list.remove(1) -> list : " + list);
		// 데이터 전체 제거
		list.clear();
		System.out.println("list.clear() -> list : " + list);
		// 데이터 유무 확인
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() : " + b);
		System.out.println("====================List End====================");
		
		System.out.println("====================Map Start===================");
		// HashMap 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.size() : " + map.size());
		// 데이터 추가
		map.put(10, "Hello");
		map.put(20, "Java");
		map.put(30, "World");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		// 데이터 수정
		map.put(20, "Python");
		System.out.println("map : " + map);
		// 데이터 추출
		str = map.get(20);
		System.out.println("map.get(20) : " + str);
		// 데이터 제거
		map.remove(20);
		System.out.println("map.remove(20)-> map : " + map);
		// 특정 데이터 포함 유무
		b = map.containsKey(20);
		System.out.println("map.containsKey(20) : " + b);
		b = map.containsValue("Hello");
		System.out.println("map.containsValue(\"Hello\") : " + b);
		// 데이터 전체 제거
		map.clear();
		System.out.println("map.clear() -> map : " + map);
		// 데이터 유무
		b = map.isEmpty();
		System.out.println("map.isEmpty() -> map : " + map);
		System.out.println("====================Map End=====================");
		

	}

}
