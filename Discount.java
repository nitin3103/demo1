package StudentDeatils;

import java.util.Scanner;

public class Discount {
	
     int P_price1;
     int P_price2;
     Scanner s;
     String P_name1;
     String P_name2;
      void input() 
      {
    	  s= new Scanner(System.in);
    	  
    	  System.out.prinln("Enter the name of Product1");
    	  P_name1= s.next();
    	  System.out.println("Enter Product1 price");
    	  P_price1= s.nextInt();
    	  System.out.prinln("Enter the name of Product2");
    	  P_name2= s.next();
    	  System.out.println("Enter Product2 price");
    	  P_price2= s.nextInt();
      }
      
      void display()
  	{ System.out.println("You have Entered Product1 price is  " + P_price1 +" & Product2 is  "+ P_price2);
  	
  	}
      void discount_percentage()
      {if (P_price1>=2000)
         System.out.println("you will get 10% discount on your purchase");
         else
    	  System.out.println("You will get 7% discount on your purchase");
      
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Discount D= new Discount();
          D.input();
          D.display();
          D.discount_percentage();
	}

}
