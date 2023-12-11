package controlFlowStatements;

public class Branchingstatements 
{
	
	public static String info(String msg)
	{
		return msg;
	}
	
	

	public static void main(String[] args)
	{
		//break statement you can use in switch and in loop
		
//		if(true)
//		{
//			break;//break cannot be used outside of a loop or a switch
//		}

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}

		System.out.println("************************************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				continue;//skip certain part of the code
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println("************************************");
		//return -return any result/data/output from method
		
		
		
		String res=info("Hello All!");
		System.out.println(res);
		
		
		
		
		
		
	}

}
