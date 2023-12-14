package arrayDemo;

import java.util.LinkedHashSet;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String is an immutable class in java
		 * String is collection of characters
		 * Ways:
		 * ===========
		 * 1.Literal---->object will create inside SCP(String constant pool)
		 * SCP does not allowed duplicate Object
		 */

		
		String s1="Hello";
		String s2="Hello";
		
		//To compare JVM id's for object ==
		System.out.println(s1==s2);//true
		
		String s3=new String("Hello");
		System.out.println(s1==s3);
		
		
		//String is immutable class
		
		System.out.println("*********String is Immutable class**********");
		s1=s1+" All";
		System.out.println(s1);//Hello All
		
		System.out.println(s1==s2);//false
		
		System.out.println("****************String Methods***********");
		
		//length()=char+space
		System.out.println("To calculate length of String s1: "+s1.length());//9
		
		//conversion= toUpperCase()  toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		/*
		 * Equality of Strings (methods=data  Operators(==)=id)
		 * equals()=exact matching but it is case sensitive
		 * equalsIgnoreCase()= exact matching but it is not case sensitive
		 */
		
		String act="Selenium is webui automation library";
		String exp="Selenium is webui automation Library/tool";
		
		//System.out.println("Using equals(): "+act.equals(exp));//true
		
		System.out.println("Using equals(): "+act.equals(exp));//false
		System.out.println("Using equalsInoreCase(): "+act.equalsIgnoreCase(exp));//false
		
		
		//concat() /+
		System.out.println(s1.concat(" "+act));
		System.out.println(s1+" "+act);
		
		
		
		//trim()- ignore white space before and after the string
		String ss1="     Welcome All      ";
		System.out.println(ss1);
		System.out.println(ss1.trim());
		
		//charAt(index)
		String ss2="Hello All";
		System.out.println(ss2.charAt(0));//H

		//contains()-partial String
		//String exp="Selenium is webui automation Library/tool";
		
		System.out.println("Is webui available in exp string?: "+exp.contains("webui"));//true
		System.out.println("Is tool available in exp string?: "+exp.contains("tool"));//true
		System.out.println("Is testng available in exp string?: "+exp.contains("testng"));//false
		
		//startsWith(Prefix)  endsWith(suffix)
		System.out.println("expected string started with Selenium?: "+exp.startsWith("Selenium"));//T
		System.out.println("expected string started with Sele?: "+exp.startsWith("Sele"));//T
		System.out.println("expected string started with S?: "+exp.startsWith("S"));//T
		System.out.println("expected string started with nium?: "+exp.startsWith("nium"));//f

		System.out.println("expected string ends with Library/tool?: "+exp.endsWith("Library/tool"));//T
		System.out.println("expected string ends with tool?: "+exp.endsWith("tool"));//T

		System.out.println("expected string ends with ol?: "+exp.endsWith("ol"));//T

		System.out.println("expected string ends with oo?: "+exp.endsWith("oo"));//f

		
		System.out.println("***************************");		
		
		//split(regular expression)-RE used for patten matching
		String tools="Selenium,TestNG,Cucumber,Maven,Postman";
		String arr[]=tools.split(",");
		System.out.println(arr[0]);//selenium
		
		String obj=tools.split(",")[2];
		System.out.println(obj);//cucumber
		System.out.println("*****************");
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************");
		
		String date="27-dec-2010";
		String day=date.split("-")[0];
		String month=date.split("-")[1];
		String year=date.split("-")[2];
		
		
		System.out.println("day is: "+day+"\nMonth is: "+month+"\nYear is: "+year);
		
		//Scenario Based Question
		//1.How to remove space from given string-replaceAll()
		String data="TestNg is Unit testing framework";
		System.out.println(data);
		String res=data.replaceAll(" ","");
		System.out.println(res);
		
		
		//2.How to remove duplicate characters from String-LinkedHashSet
		String ss3="abababcdef";
		System.out.println(ss3);
		
		//pass string data to LinkedHashSet class-remove duplicates characters
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		
		for(int i=0;i<ss3.length();i++)
		{
			ls.add(ss3.charAt(i));
		}
		
		System.out.println(ls);
		
		//Take  a String and print even position character
		//in upper case and odd position character in lower case
		
		String ss4="Amit";
		System.out.println(ss4);
		String result="";
		
		for(int i=0;i<ss4.length();i++)
		{
			if(i%2==0)
			{
//				result=result+ss4.charAt(i);
//				result.toUpperCase();
				result=result+ss4.toUpperCase().charAt(i);
				
				
			}else
			{
//				result=result+ss4.charAt(i);
//				result.toLowerCase();
				result=result+ss4.toLowerCase().charAt(i);
			}
			
		}
		
		System.out.println(result);
		
		//How to reverse any string with Method and without Method
		
		/*
		 * StringBuffer class & StringBuilder
		 * Both mutable
		 * New keyword 
		 */
		
		StringBuilder br=new StringBuilder("Hello");
		System.out.println(br);
		
		br.append("All");
		
		System.out.println(br);
		System.out.println(br.reverse());
		
		System.out.println("*************************");
		
		//Without method 
		String sa="Java";
	
		String ans="";
		
		for(int i=sa.length()-1;i>=0;i--)
		{
			ans=ans+sa.charAt(i);
		}
		
		System.out.println("Reverse of a string "+sa+" is: "+ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
