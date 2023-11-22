package week1;

public class OperatorDemo
{

	public static void main(String[] args)
	{

		System.out.println("*******Arithmetic Operators********");

		int a=20,b=10;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		/*
		 * Increment and decrement operators
		 * post and pre increment
		 * a++         ++a  = a=a+1
		 * 
		 * post and pre decrement
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println(a);//20
		//a++;//it will not update on that line(post-->next time)
		System.out.println(a++);//20
		System.out.println(a);//21
		
		
		System.out.println(b);//10
		//++b;
		System.out.println(++b);//11
		System.out.println(b);//11
		
		
		int x=90;
		int y=x++;
		
		System.out.println(y);//90
		System.out.println(x);//91
		
		int c=156;
		int d=c++;
		
		System.out.println(d);//156
		System.out.println(c);//157
		
		int e=89;
		int f=++e;
		System.out.println(f);//90
		System.out.println(e);//90
		
		
		//Decrement a--    --a  a=a-1
		int p=120,q=90;
		System.out.println(p);//120
		System.out.println(p--);//120 post
		System.out.println(p);//119
		
		System.out.println(q);//90
		System.out.println(--q);//89
		System.out.println(q);//89
		
		int o=78;
		int z=o--;
		System.out.println(o);//77
		System.out.println(z);//78
		
		
		int h=46;
		int r=--h;
		
		System.out.println(r);//45
		System.out.println(h);//45
		
		
		System.out.println("*******Relational Operators*********");
		//r,h=45  p=119 f,e =90  z=78
		
		System.out.println("Greater than >: "+(e>z));//true
		System.out.println("Less than <: "+(z<e));//true
		System.out.println("Greater than equal to >=: "+(p>=f));//true
		System.out.println(r>=h);//true
		System.out.println(z>=p);//false
		System.out.println("Less than equal to <=:"+(r<=e));//true
		System.out.println("Comparison operator ==: "+(f==e));
		System.out.println(z==r);//false
		
		System.out.println("Not Equal to !=: "+(z!=r));//true
		System.out.println(r!=h);//false
		
		System.out.println("*****Logical Operators*********");
		/*
		 * c1	c2	(And)&&	 (OR)||		!(Not)
		 * T	T		T		T		
		 * T	F		F		T
		 * F	T		F		T
		 * F	F		F		F
		 * 
		 */
		
		System.out.println((p>e) && (r<z));//true
		System.out.println((p>e) && (p<z));//false
		System.out.println((z==r)&& (r==h));//false
		System.out.println((r==e) && (p<h));//false
		
		System.out.println((p>e) || (r<z));//true
		System.out.println((p>e) || (p<z));//true
		System.out.println((z==r) || (r==h));//true
		System.out.println((r==e) || (p<h));//false
		
		System.out.println("*******logical Not*****");
		
		System.out.println(true);//true
		
		System.out.println(!true);//false
		
		System.out.println(p>e);//true
		System.out.println(!(p>e));//false
		
		System.out.println("************Conitional Operator(unary)****");
		
		//condition ? true : false
		
		int a1=90, b1=570;
		
		if(a1>b1)
		{
			System.out.println(a1+" is greater than "+b1);
		}
		else
		{
			System.out.println(b1+" is greater than "+a1);

		}
		
		System.out.println("*****************");
		
		System.out.println((a1>b1)?a1+" is greater than "+b1:b1+" is greater than "+a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
