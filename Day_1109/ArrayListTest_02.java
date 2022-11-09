package global.sesoc.structure;

import java.util.ArrayList;
import java.util.Iterator;

//insert(C), delete(D), update(U), search(조회,Read)
//데이터 생성,  데이터 삭제, 데이터 수정/교체, 해당 데이터 (있나없나)조회,검색 
public class ArrayListTest_02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(); //ArrayList. 방갯수 표시안해도됨
		//arraylist는 count가 필요없음
		
		//ArrayList배열에 삽입 (insert)
		list.add("장미"); //arraylist는 count가 필요없음
		list.add("국화");
		list.add("코스모스");
		list.add("튤립");
	
		
		//전체 출력
		for(int i=0; i<list.size(); ++i) { // 전체데이터의 갯수 size()
			System.out.print(list.get(i) + " "); //데이터 꺼내기 get()
		}
		System.out.println("\n");
		
		//삭제 (delete)
		//<삭제 방법 1>
		String tmp = list.remove(1); //뭐가 삭제됐는지 확인하기 위해 변수에 담는다
		System.out.println(tmp);
		//<삭제 방법 2>
		boolean result = list.remove("튤립");
		System.out.println(result);
		
		//전체 출력 - ArrayList는 이런형태의 for문을 사용해서 출력한다. (배열에서는 데이터가 꽉차있을때만 이 방법을 사용가능)
		for(String data : list) {
			System.out.print(data+ " ");
		}
		System.out.println("\n");
				
		
		
		//장미를 찾아서 수국으로 수정 (update) - set(인덱스, 데이터) 
		list.set(0,"수국");
		//전체출력
		for(int i =0; i<list.size(); ++i) {
			System.out.print(list.get(i) + " " );
		}
		System.out.println("\n");
		
		//search하는 메소드가 무엇인지 알아보시오
		int index = list.indexOf("코스모"); //없는 데이터를 찾으면 -1을 return
		System.out.println(index);
		
		boolean ans = list.contains("수국");
		System.out.println(ans);
		
		//코스모스를 해바라기로 교체하는 코드 - 먼저 코스모스를 찾아서, 해바라기로 바꾼다.
		list.set(list.indexOf("코스모스"), "해바라기");
		
		
		
//전체 출력 - 데이터가 잘 교체되었는지 확인
	//방법1.
//		for(String data : list)
//			System.out.print(data + " ");
//		
//		System.out.println("\n");
		
	//방법2.리스트 전체를 순회(Iterator)하는 객체로 변환하여 출력하는 방식. (이 방법을 더 많이 사용함) - 한번 사용시 객체를 다시 만들어서 사용해야함!
		Iterator<String> iter = list.iterator(); //iterator는 배열안을 자유롭게 왔다갔다 할 수 있다
		//iter.hasNext(); //배열객체안의 데이터를 전진하면서 다음칸이 있는지 확인 -> 있으면 t, 없으면 f
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n종료");
		

		
	}
}