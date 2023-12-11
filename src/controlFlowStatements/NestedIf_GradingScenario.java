package controlFlowStatements;

public class NestedIf_GradingScenario {

	public static void main(String[] args)
	{

		int marks=93;
		
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}

	}

}
