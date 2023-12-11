package arrayDemo;

public class MultiDArray {

	public static void main(String[] args)
	{
		// Using new Keyword
		
		//row-->cell-->data
		
		int arr[][]=new int[2][4];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=100;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("Number of rows : "+arr.length);//2
		System.out.println("Number of columns: "+arr[0].length);//3
		
		//Single data
		System.out.println(arr[1][2]);//60
		
		//System.out.println(arr[2][0]);//ArrayIndexOutOgBoundsException

		System.out.println("**Iteration Of Multi D Array**");
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************************");
		
		for(int r[]:arr)//row
		{
			for(int c:r)
			{
				System.out.print(c+"  ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("************Literal Way*****************");
		
		String data[][]= {{"Suresh","Mumbai"},{"Ketan","Pune"},{"Rekha","Pune"},{"Kiran","Nagpur"}};
		
		System.out.println("Number of rows: "+data.length);//4
		System.out.println("Number of Columns: "+data[0].length);//2
		
		//single data
		System.out.println(data[2][0]);//Rekha
		
		//Iterate using Nested for loop
		
		System.out.println("**************Using Simple for loop**********************");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"    ");
			}
			System.out.println();
			
		}
		
		System.out.println("**************Using for each loop**********************");

		for(String i[]:data)//["Suresh","Mumbai"]
		{
			for(String j:i)
			{
				System.out.print(j+"      ");
			}
			System.out.println();
		}
		
		System.out.println("*******************************************");
		
		
		
		
		
		
		
		
		
		
		
	}

}
