
public class StringTest_01 {

	public static void main(String[] args) {
		// String생성자 사용해보기
		// 1.String()
		String s1 = new String(); //empty string 객체 생성
		
		// 2. String(byte[] bytes)
		byte[] by = {65, 66, 97, 99, 100}; //선언과 동시에 초기화
		String s2 = new String(by); //"341509"
		System.out.println(s2);
		
		// 3. String(char[] value)
		char[] ch = {'강', '남', '스','타','일'};
		String s3 = new String(ch); //강남스타일
		System.out.println(s3);
		
		// 4.String(String original)
		String s4 = new String("대한민국");
		
		// 5.
		String s5 = "대한민국"; //메모리의 string pool에 만들어짐 (같은 대한민국은 들어올 수 없다)
		String s55 ="대한민국"; //새로 생성하지않고 기존에 있던 곳을 참조한다
		System.out.println(s5 == s55); //true
		String s6 = new String("대한민국");//메모리 heap에 완전히 새롭게 만들어냄.그래서 주소값이 다름
		String s7 = new String("대한민국");//메모리 heap에 항상 새롭게 만들어냄.그래서 주소값이 다름
		System.out.println(s5 == s6); //주소 비교. false
		System.out.println(s5.equals(s6)); //값 비교. true
		System.out.println(s6 == s7); //주소비교. false
		System.out.println(s6.equals(s7)); //값(데이터)비교. 이게 올바른 표현방식임. true
		
		s55 = s55 + "Korea"; //주소값이 달라짐.
		System.out.println(s5 == s55); //주소비교.false 
		
		
		
		
	}

}
