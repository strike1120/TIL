import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_02 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("1", "손흥민");
		map.put("2", "박지성");
		map.put("3", "차범근");
		map.put("4", "이강인");
		map.put("5", "김민재");
		
		if(map.containsKey("4")) { // key값이 "4"인 데이터가 존재하니?
			System.out.println(map.get(4)); //존재하면 key값이 "4"인 value값을 출력해줘
		} else {
			System.out.println("데이터가 없습니다"); //존재하지 않으면 이런 메시지를 출력해줘
		}
		
		// key의 정보만 꺼내오기 (1.key값들을 먼저 꺼내온다)
		Set<String> set = map.keySet();
		
		//모든 key값을 출력하시오. (2.꺼내온 key값들을 출력한다)
		Iterator<String> iter = set.iterator(); 
		
		//배열을 순회하며 전체 출력
    	while(iter.hasNext()){ //hasNext() - 다음께 있니?
    		String key = iter.next(); //next() - 다음께 있으면 값을 가져와줘
    		String value = map.get(key); //map은 전체순회가 불가능하므로, key만따로 묶음으로 꺼낸뒤 key값을 순회하면서 변수에 담는다 
    		System.out.println(key + ":" + value);
    	}
    	
	}
}