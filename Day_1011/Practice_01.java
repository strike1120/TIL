import java.util.Scanner;

/*
char타입의 변수 ch에 임의의 영문자 1개를 저장하고,
대문자면 소문자로, 소문자면 대문자로 변환하여 출력.

After storing one random alphabet in the char type variable ch,
Write a program that 
converts uppercase letters to lowercase letters 
and lowercase letters to uppercase letters.
*/
public class Practice_01 {

	public static void main(String[] args) {
		
		//대문자 A이상이고 대문자Z이하이면 대문자
		//소문자 a이상이고 소문자z이하이면 소문자
		// 32 === ''(스페이스, 공백)
		// 'a' > 'A'
		
		char ch = 'A';
		
		if ('a'<= ch && ch <= 'z') {
			System.out.println((char)(ch - 32));
			
		} else { 
			System.out.println((char)(ch + 32));
			
		}
	}

}
