import java.util.Scanner;
/*
[문제-4] 제품의 바가지여부 확인하기
제품의 원가와 실제구매가격을 입력하여 얼마나 더 비싸게 또는 싸게 샀는지 출력하는 프로그램을 작성

[Question-4] Check if the product is ripped off
Write a program that prints out how much more expensive or cheaper you bought 
by entering the cost of the product and the actual purchase price.
 */
public class Practice_02 {

	public static void main(String[] args) {
		int cost ;
		int price;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your id?");
		name = sc.next();

		System.out.println("input the price");
		price = sc.nextInt();
		
		System.out.println("input cost of the product");
		cost = sc.nextInt();
		int margin = price - cost;
		System.out.println("Input completed");
		System.out.println("바가지는 " + margin + "원 입니다");

		
		
	}

}
