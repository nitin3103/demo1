package StudentDeatils;

import java.util.Scanner;

public class Greater_num {

	int N;
	int Y;
	Scanner s;
	void input()
	{ s= new Scanner(System.in);
	System.out.println("Enter first Number1");
	N= s.nextInt();
	System.out.println("Enter second Number2");
	Y= s.nextInt();
	}
	
	void display()
	{ System.out.println("You have Entered a Number1 is  " + N +" & Number2 is  "+ Y);
	
	}

	void GN()
	{
		if(N>Y)
			System.out.println("Number_1 is greater than number_2");
			else 
				System.out.println("Number_2 is greater than number_1");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greater_num Grt_num= new Greater_num();
				Grt_num.input();
     			Grt_num.display();
				Grt_num.GN();
	}

}

	


