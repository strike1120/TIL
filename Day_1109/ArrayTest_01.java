package global.sesoc.structure;

import java.util.ArrayList;

//insert, delete, update, search,
public class ArrayTest_01 {

	public static void main(String[] args) {
		String[] str = new String[20]; //Array
		int count = 0; //데이터의 개수
		ArrayList<String> list = new ArrayList<>(); //ArrayList. 방갯수 표시안해도됨
		
		//배열에 삽입 (insert)
		str[count++] = "사과"; //배열의 count방에 "사과"를 넣고 count를 1증가 시켜라
		str[count++] = "배";
		str[count++] = "복숭아";
		str[count++] = "수박";
		
		//전체 출력
		for(int i=0; i<count; ++i) {
			System.out.print(str[i] + " ");
		}
		System.out.println("\n");
		
		//삭제 (delete)
		//"배" 삭제
		for(int i=0; i<count; ++i) {
			if(str[i].equals("배")) { //str배열의 0번방의 데이터가 "배" 이니?
				for(int j = i; j<count;  ++j) {
					str[j] = str[j+1];
				}
				--count;
			}
		}
		
		//전체 출력
				for(int i=0; i<count; ++i) {
					System.out.print(str[i] + " ");
				}
				System.out.println("\n");
				
		//배열안의 데이터 수정 (update) - 수박->멜론 으로 수정
		for(int i=0; i<count; ++i) {
			if(str[i].equals("수박")) {
				str[i] = "멜론";
				break;
			}
		}
		//전체 출력 (데이터가 일부만 있을때)
		for(int i=0; i<count; ++i) {
			System.out.print(str[i] + " ");
		}
		System.out.println("\n");
		
		
		//데이터가 꽉 차 있을때, 전체를 출력하는 방법 (데이터가 일부만 있을때는 사용불가)
		for(String data : str) { 
			System.out.println(data);
		}
		list.add("사과");
		
	}
}