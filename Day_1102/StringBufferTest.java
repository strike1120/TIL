
public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer("무궁화 꽃이 피었습니다.");
		StringBuffer buf3 = new StringBuffer(500);
		
		System.out.println("buf1의 용량" + buf1.capacity()); //기본용량 16
		System.out.println("buf2의 용량" + buf2.capacity());
		System.out.println("buf3의 용량" + buf3.capacity());
		
		buf1.append(2);
		System.out.println(buf1 + "\nbuf1의 용량: " + buf1.capacity());
		buf1.append(45.56);
		buf1.append(true);
		System.out.println(buf1 + "\nbuf1의 용량: " + buf1.capacity());
		buf1.append('강');
		buf1.append("무궁화꽃");
		System.out.println(buf1 + "\nbuf1의 용량: " + buf1.capacity());
		buf1.insert(2, "송아지"); //insert는 중간에 끼워넣을때 사용한다
		System.out.println(buf1 + "\nbuf1의 용량: " + buf1.capacity());
		buf1.delete(5, 10);
		
		//buf3에 작업
		buf3.append("송아지")
		.append(true)
		.append(42.195)
		.insert(0, "강아지"); //method chaining (자기자신을 리턴할때만 사용가능)
		
		System.out.println(buf3 + "\nbuf3의 용량: " + buf3.capacity());//글자갯수 + 빈 공간(남은 빈공간이 많음)
		System.out.println("buf3의 길이: " + buf3.length()); //글자갯수
		
		
		buf3.trimToSize(); //빈공간 잘라내기
		System.out.println(buf3 + "\nbuf3의 용량: " + buf3.capacity());
		
		String str = buf3.toString(); //mutable(StringBuffer) -> immutable데이터(String)로 바뀜
	}

}
