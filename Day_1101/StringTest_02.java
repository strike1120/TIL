
public class StringTest_02 {

	public static void main(String[] args) {
		//static이 안붙어있으면 객체를 먼저 생성하고 써야함
		
		//char  charAt(int index)
		String a = "대한민국";
		System.out.println(a.charAt(2)+ "\n");
		
		//int	codePointAt(int index)
		String myStr = "Hello";
	    int result = myStr.codePointAt(0);
	    System.out.println(result+ "\n");
		
		//int	compareTo(String anotherString) - 문자열 두개를 유니코드로 변환하여 비교
	    String myStr1 = "A";
	    String myStr2 = "B";
	    System.out.println(myStr1.compareTo(myStr2)+ "\n"); 
	    
	    
		//String concat(String str)
		String str1 = "대한민국 ", str2 ="화이팅";
		System.out.println(str1.concat(str2)+ "\n");
		
		String firstName = "John ";
	    String lastName = "Doe";
	    System.out.println(firstName.concat(lastName)+ "\n");
	    
		//boolean	contains(CharSequence s)
	    String myStr3 = "Hello";
	    System.out.println(myStr3.contains("Hel"));
	    System.out.println(myStr3.contains("e"));
	    System.out.println(myStr3.contains("Ho")+ "\n");
	    
	    //boolean	endsWith(String suffix)
	    String myStr4 = "Hello";
	    System.out.println(myStr4.endsWith("Hel"));
	    System.out.println(myStr4.endsWith("llo"));
	    System.out.println(myStr4.endsWith("o") +"\n");
	    
		//boolean	equals(Object anObject)
	    String c = "Hello";
	    String d = "Hello";
	    String e = "Another String";
	    System.out.println(c.equals(d)); // Returns true because they are equal
	    System.out.println(c.equals(e)+"\n"); // false
	    
		//int	indexOf(int ch)
	    String myStr11 = "Hello planet earth, you are a great planet.";
	    System.out.println(myStr11.indexOf("planet")+"\n");
	    
		//boolean	isEmpty()
	    String s1="";  
	    String s2="javatpoint";  
	      
	    System.out.println(s1.isEmpty());  
	    System.out.println(s2.isEmpty());  
	    
	    //int	length()
	    
		//String	replace(char oldChar, char newChar)
	    
		//String[]	split(String regex)
	    
		//String	substring(int beginIndex)
	    
		//String	substring(int beginIndex, int endIndex)
	    
		//String toLowerCase()
	    
		//String toUppercaer()
		
		
		
	}

}
