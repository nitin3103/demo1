package StudentDeatils;

import java.util.Scanner;

public class Positive_or_neg {
	int N;
	Scanner s;
	void input()
	{ s= new Scanner(System.in);
	System.out.println("Enter the number (possitive or negative)");
	N= s.nextInt();
	}
	void display()
	{ System.out.println(N);
	
	}

	void PnN()
	{
		if(N>=0)
			System.out.println("Number is Positive");
			else 
				System.out.println("Number is Negative");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Positive_or_neg pn= new Positive_or_neg();
				pn.input();
     			pn.display();
				pn.PnN();
	}

}
