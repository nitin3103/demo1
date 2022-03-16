package StudentDeatils;

import java.util.Scanner;
	
public class Studentmarks {
	int marks;
	String S_name;
	Scanner s;
	void input()
	{ s= new Scanner(System.in);
	System.out.println("student name");
	S_name= s.next(); //take input as input from user 
	System.out.println("student marks (b/w 1-100)");	
	marks= s.nextInt();
		
	}
	void display()
	{ System.out.println(S_name +" marks "+ marks);
	}
	
	void PF() {
		if (marks>=40)
			System.out.println("student is pass");
		else
		    System.out.println("student is fail");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentmarks sm= new Studentmarks();
	       sm.input();
	       sm.display();
	       sm.PF();
		
         
        	 
	
	}

}
