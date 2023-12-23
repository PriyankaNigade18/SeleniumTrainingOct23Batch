package oop.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{

		//child class ref and child class object
		HDFC h1=new HDFC();
		h1.customerDetails();//individual
		h1.withdraw();//inherited abstract 
		h1.deposite();//inherited abstract 
		h1.rateOfInterest();//inherited abstract 
		System.out.println(h1.x);
		//h1.x=101;
		System.out.println("**************************");
		
		//parent class ref and child class object
		RBI r1=new HDFC();
		r1.withdraw();
		r1.deposite();
		r1.rateOfInterest();
		
		System.out.println("**************************");

		
		Axies a1=new Axies();
		a1.withdraw();
		a1.deposite();
		a1.rateOfInterest();
				
		
		
		
		
		
	}

}
