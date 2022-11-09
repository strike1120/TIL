package v02;

import javafx.print.Printer;

public class PrinterMain {

	public static void main(String[] args) {
		Printer p;

		p = new Printer();
		p.maker = "삼성";
		//print(p);

		Inkjet p1 = new Inkjet();
		p1.maker = "캐논";
		p1.color = "빨강";
//		print(p1);
		
		Laser l = new Laser();
		l.maker = "HP";
		l.toner = "10ml 검정 토너";
		print(l);
	}

	//가리킬때는 
	//받고나서 실제로 접근해서 사용할때는 캐스팅이 가능한상태인지 if문으로 확인하고 다운캐스팅 한 후 사용해야함!
	public static void print(Object p) { //Printer하위애들은 싹다 받을 수 있음.
		if(p instanceof Printer) return;
		
		if(p instanceof Inkjet) {
			Inkjet p1 = (Inkjet) p ; // 다운캐스팅
			System.out.println(p1.maker + "," + p1.color);
		} else if (p instanceof Laser) {
			Laser p1 = (Laser)p;
			System.out.println(p1.maker +"," + p1.toner);
		} else if (p instanceof Printer) { //반드시 superclass는 최하단에 있어야한다.왜? 위에 올라가면 얘한테 다 잡히니까
			Printer p1 = (Printer) p;
			System.out.println(p1.maker);
		}
	}
}