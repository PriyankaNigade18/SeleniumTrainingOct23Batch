package oop.Polymorphism;

public class AmazonSearch 
{
	public void search(String pname)
	{
		System.out.println("Search product by product name: "+pname);
	}

	public void search(int price)
	{
		System.out.println("Search product by product price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Search product by product name: "+pname+" & Price: "+price);
	}
	public void search(String pname,String bname)
	{
		System.out.println("Search product by product name: "+pname+" & Product brand name: "+bname);
	}
	
	public void search(int price,String bname)
	{
		System.out.println("Search product by product price: "+price+" & product brand name: "+bname);
	}
}
