import java.util.Scanner;

class AllExceptions{
	
	void ArithmeticOperation(int a,int b)
	{
		int c;
		try {
			c=a/b;
			System.out.println("Result of:"+a+"/"+b+"="+c);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Invalid values:"+e);
		}
		finally 
		{
			System.out.println("finally executed Arithmetic Operation");
		}
	}
	
	void ArrayOperation(int a[],int i)
	{
		try 
		{
			System.out.println("Value at "+i+" is: "+a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Error:"+e);
		}
		finally 
		{
			System.out.println("finally executed  Array Operation");
		}
	}
}

public class Exceptions 
{
	public static void main(String[] args) 
	{
		int a,b,choice,exit=0;
		
		Scanner sc = new Scanner(System.in);
		AllExceptions ae= new AllExceptions();
		
		System.out.println("Enter operation:");
		while(exit!=1) {
			System.out.println("1.Arithmetic Operation  2.Array Operation  3.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter a numerator:");
				a = sc.nextInt();
				System.out.println("Enter a denomintor:");
				b = sc.nextInt();
				ae.ArithmeticOperation(a, b);
				break;
			case 2:
				System.out.println("Enter number of elements:");
				a = sc.nextInt();
				int arr[] = new int[a];
				System.out.println("Enter the elements:");
				for(b=0;b<a;b++) {
					arr[b]=sc.nextInt();
				}
				System.out.println("Enter index:");
				b=sc.nextInt();
				ae.ArrayOperation(arr, b);
				break;
			case 3:
				exit=1;
				System.out.println("Program exited!");
				break;
			default:
				System.out.println("Invalid Entry!!");
			}
		}
	}

}