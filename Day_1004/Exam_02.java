/* 
  산술연산자 int
  사과 개당 4300원인 사과가 2335개 있다 (price, count)
  도매상 13명이 나눠 가져가려고 하면 한 명당 얼마를 내야하는가? (people, perCost)
  
  There are 2,335 apples, priced at 4,300 won per apple.
  If 13 wholesalers try to share apples, how much should each person pay?
 */
public class Exam_02 {

	public static void main(String[] args) {
		int price = 4300;
		int count = 2335;
		int people = 13;
		
	    int perCost = count / people * price ;
	    System.out.println(perCost + "won");

	}

}
