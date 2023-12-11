package controlFlowStatements;

public class LoopDemo
{

	public static void main(String[] args)
	{
		//for loop
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("*************************");
		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("*************************");

//		for(;;)//condition is true
//		{
//			System.out.println("Hi");
//		}
		
		System.out.println("*************************");
		
		//While loop
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Hello All");
			i++;
		}
		
		System.out.println("*************************");
		
		int j=1;
		while(j<=10)
		{
			System.out.println(j);
			j++;
		}
		
		//Number of iterations are not known-while loop
		//Sum of digits num=123   sum of digits=6
		
		int num=12345,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
			
		}
		
		
		System.out.println("Sum of digits: "+sum);
		
		
		
//		int fact=1;
//		for(int i=5;5>=1;i--)
//		{
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);

		System.out.println("***********************");
		
		//do-while loop- Exit control loop(one time execution)
		
		int k=1;
	
		do
		{
			System.out.println("Welcome All");
			k++;
		}while(k==10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
