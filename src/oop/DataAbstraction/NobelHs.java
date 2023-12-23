package oop.DataAbstraction;

//Multiple Inheritance
public class NobelHs implements IMA,UMA
{

	@Override
	public void physio() {
		System.out.println("NobelHs......PhysioService");

		
	}

	@Override
	public void cardio() {
		System.out.println("NobelHs......CardioService");
		
	}
	
	public void medicalService()
	{
		System.out.println("NobelHs......MedicalService");
	}

	@Override
	public void nero() {

		System.out.println("NobelHs......NeroService");

		
	}

	@Override
	public void dental() {
		System.out.println("NobelHs......DentalService");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobelHs......Covid19Test");
		
	}

}
