package oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmazonSearch obj=new AmazonSearch();
		obj.search("Iphone 15");
		obj.search(200000);
		obj.search(10000,"Zara");
		obj.search("bag", 20000);
		obj.search("Watch","Titen");
	}

}

