package pack;
// Q wap to check if a given number is even or odd
//Q wap to check if a number enetered by user is even or odd

import java.util.*;

public class Evenorodd 
{

	public static void main(String[] args) {
        
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int a= s.nextInt();
        		
		//int a=13; 
		if(a%2==0) //% - reminder
			{
			 System.out.println(" this is a even number");
		     System.out.println("bye");
			}
		else
			System.out.println(" this is a odd number");
		
	}

}
