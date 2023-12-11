package arrayDemo;

public class SingleDArray {

	public static void main(String[] args) {

		/*
		 * Array as single dimension
		 * 
		 * Ways:
		 * ======
		 * 1.Using new keyword
		 * 2.Using literal(constant)
		 * 
		 * Array is implemented in java as Object
		 * No method support
		 * 
		 * 
		 */
		//Using new keyword
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Length of array: "+sid.length);//5
		
		//to get single data
		System.out.println(sid[3]);//104
		//System.out.println(sid[-1]);//ArrayIndexOutOfBoundsException
		
		//get all the elements from array
		System.out.println("**********Iteration using for loop**********");
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("**********Iteration using for each loop**********");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		
		
		System.out.println("****************************************");
		
		String location[]=new String[3];
		location[0]="Pune";
		location[1]="Mumbai";
		location[2]="Nagpur";
		
		System.out.println("Total locations in array: "+location.length);
		
		System.out.println(location[2]);//Nagpur
		System.out.println("**********Iteration using for loop********");
		
		for(int i=0;i<3;i++)
		{
			System.out.println(location[i]);
		}
		
		System.out.println("**********Iteration using for each loop**********");

		for(String i:location)
		{
			System.out.println(i);
		}
		
		System.out.println("***********************************************");
		
		double marks[]=new double[3];
		marks[0]=46.11;
		marks[1]=70.23;
		marks[2]=68.24;
		
		System.out.println("Total Marks from array: "+marks.length);//3
		
		System.out.println("Total marks for students: "+(marks[0]+marks[1]+marks[2]));
		
		System.out.println("**********Iteration using for loop********");
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		System.out.println("**********Iteration using for each loop**********");

		for(double i:marks)
		{
			if(i>10.11)
			{
				System.out.println("pass");
			}else
			{
				System.out.println("Fail");
			}
			System.out.println(i);
		}
			
		System.out.println("************Using literal way***************");
		
		int arr[]= {10,20,30,40,50};
		
		System.out.println(arr[3]);//40
		System.out.println("length: "+arr.length);//5
		
		//for each
		for(int i:arr)
		{
		System.out.println(i);	
		}
		
		
		System.out.println("********************************");
		
		char ch[]= {'A','B','C'};
		
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		System.out.println("************************************");
		
		
		Object empdata[]= {"Sarang",'M',"pune",25,9686655489L,78.89};
		
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
