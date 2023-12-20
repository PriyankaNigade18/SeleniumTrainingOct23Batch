package oop.Inheritance;

public class CarTest {

	public static void main(String[] args)
	{

		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited 
		b1.refule();//inherited 
		b1.stop();//inherited 
		b1.breakFeature();//inherited
		b1.price();
		
		System.out.println("*******************");
		
		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.breakFeature();//inherited
		c1.price();
		System.out.println("*******************");
		
		Car c2=new BMW();
		c2.start();//individual
		c2.refule();//individual
		c2.stop();//individual
		c2.breakFeature();//inherited
		c2.price();
		System.out.println("*******************");
		
		Audi a1=new Audi();
		a1.autoGear();//individual
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.breakFeature();//inherited
		
		System.out.println("*******************");

		Car c3=new Audi();
		c3.start();
		c3.refule();
		c3.stop();
		c3.breakFeature();//inherited
		
		


	}

}
