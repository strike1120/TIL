import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest_01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //hashmap 선언
		map.put("손흥민", "7");
		map.put("박지성", "10"); // {손흥민=7, 박지성=10}
		System.out.println(map);
		System.out.println(map.get("손흥민"));	
		map.remove("손흥민");
		System.out.println(map.get("손흥민")); //key에 해당하는 벨류가 없을 경우 -> null 	
		
//		map.size();
//		map.containsKey("손흥민");
//		map.containsValue("10");
//		map.isEmpty();
//
//		map.clear();
//		map.size();
//		map.isEmpty();
		
		//value값이 존재하는 위치에 새로 데이터를 넣으면 replace됨
		
		List<String> list = new ArrayList<>(); //ArrayList 선언
		System.out.println(list); // []
		list.add("손흥민");
		list.add("박지성");
		list.add("차범근");
		System.out.println(list);
		System.out.println(list.get(0));
		
		list.remove("손흥민");
		System.out.println(list.get(0)); //0번자리의 손흥민이 삭제되면 1번자리에 있던 박지성이 당겨지므로, 박지성이 출력됨.
	}

}
