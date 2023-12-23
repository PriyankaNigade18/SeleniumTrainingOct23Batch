package oop.DataAbstraction;

public class HDFC implements RBI
{

	public void customerDetails()
	{
		System.out.println("HDFC......Customers Details()");
	}

	@Override
	public void withdraw() {

		System.out.println("HDFC......withdraw()");
		
	}

	@Override
	public void deposite() {
		System.out.println("HDFC......deposite()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC......rateOfInterest 8%");

	}
}
