import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Study_hashset { //hashset에는 중복된 데이터가 들어갈 수 없다. (cf.)list는 중복된 데이터가 들어갈 수 있다.
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);  //  [e, H, l, o] 출력 -> 순서를 지키지 않고 출력됨
    	Set<String> set = new HashSet<>();
    	set.add("아메리카노");
    	set.add("카푸치노");
    	set.add("더치커피");
    	set.add("모카라떼");
    	set.add("프라프치노");
        
    	set.size();
    	System.out.println(set); // 이런식으로 전체를 출력하는 방식은 X -> interator를 사용할것!
    	
    	set.add("아메리카노"); //동일한 데이터가 있기 때문에 삽입 불가
    	System.out.println(set);
    	System.out.println(set.size()); 
    	
    	set.remove("더치커피");
    	System.out.println(set);
    	
    	//set은 iterator메소드(전체순회 출력하는 함수) 사용가능 
    	Iterator<String> iter = set.iterator(); 
    	while(iter.hasNext()){ //hasNext - 다음께 있니?
    		System.out.println(iter.next()); //next - 다음께 있으면 가져오는메소드
    	}
    	
    	set.clear();
    	System.out.println(set);
        
    }
}