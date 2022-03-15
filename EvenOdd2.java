package pack;

public class EvenOdd2 {

	
	void evenoddcheck()
	{
		int a=13; 
		if(a%2==0) //% - reminder
			{
			 System.out.println(" this is a even number");
		     System.out.println("bye");
			}
		else
			System.out.println(" this is a odd number");

	}
	
	
	
	public static void main(String[] args) {
		EvenOdd2 e= new EvenOdd2();
		e.evenoddcheck();

	}

}
