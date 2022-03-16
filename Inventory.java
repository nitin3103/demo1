package StudentDeatils;

import java.util.Scanner;

public class Inventory {

		
		String pname;
		int price;
		int Qty;
		Scanner s;
		String discount;
		
		void input()
	{  s= new Scanner(System.in);
	System.out.println("enter pname ");
	pname= s.next();//take string as input from user
	System.out.println("enter price ");
	price= s.nextInt();
	System.out.println("enter qty");
	Qty= s.nextInt();
		}
		void display()
		{
			System.out.println(pname +" "+ price+" "+Qty);
		}
	void calculate(){
		if( price>=3000)
		discount ="10%";
    else	
  	  discount ="9%";
		System.out.println("discount");
	System.out.println(discount);
	}
		public static void main(String[] args) {
			   Inventory e= new Inventory();
			   e.input();
			   e.display();
			   e.calculate();
		}
		
}
