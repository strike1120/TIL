
public class CotinueTest {

	public static void main(String[] args) {
//		int i = 0;
		int j=0;
		while (true) {
//			int j=0; //while문을 돌때마다 값을 초기화.1이 무한히 찍힘.
			++j;
			if(j==10) break;
			if(j%2==0) continue;
			System.out.println(j);
		}
		
		for(int i=0; i<10; i++) {
			if(i==5) continue; //continue다음에 오는 모든 코드를 건너뛰고 바로 loop로 돌아감
			if(i%2 == 0) continue; //홀수만 찍어내는 코드
			System.out.println("현재 값 :"+i);
			
		}
		System.out.println("끝!");
	}

}
