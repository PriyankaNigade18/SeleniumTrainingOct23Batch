package controlFlowStatements;

public class LoopAssignment2 {

	public static void main(String[] args)
	{
		//factorial
           int fact=1;
		//int num=5;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
			
			
		}
		System.out.println("Factorial of 5 is: "+fact);
		

		System.out.println("***************************");
		
		int a=10,b=20;
		System.out.println("Before swapping: a="+a+" & b="+b);
//		a=b;
//		b=a;
		//extra variable
//		int temp=b;
//		b=a;
//		a=temp;
		
		//+--
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		System.out.println("After swapping: a="+a+" & b="+b);

		System.out.println("*****************************");
		
		
		int num=123,rem,sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}

		System.out.println("Reverse of "+temp+" is:"+sum);
		
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is  not a palindrome number");

		}
		
		System.out.println("****************************");
		
		int no=153,r,res=0;
		int n=no;
		
		while(no>0)
		{
			r=no%10;
			no=no/10;
			res=res+r*r*r;
		}
		
		System.out.println(res);
		if(n==res)
		{
			System.out.println(n+" is an armstrong number");
		}else
		{
			System.out.println(n+" is not an armstrong number");
		}
		
		System.out.println("*************************");
		
		for(int rr=1;rr<=4;rr++)
		{
			for(int c=1;c<=rr;c++)
			{
				System.out.print(rr+" ");
			}
			System.out.println();
		}
		
		System.out.println("*************************");

		for(int rr=1;rr<=4;rr++)
		{
			for(int c=1;c<=rr;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("*************************");
		int k=1;
		for(int rr=1;rr<=4;rr++)
		{
			for(int c=1;c<=rr;c++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
