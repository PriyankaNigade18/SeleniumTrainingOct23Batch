package oop.Encapsulation;


class Employee
{
	//data+Function
	
	//data
	private int id=101;
	private String name="Kiran";
	
	//Public method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}
}




public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show();
		//e1.id=201;//The field Employee.id is not visible
		e1.setId(301);
		e1.setName("Parag");
		
		System.out.println(e1.getId()+"  "+e1.getName());
		//e1.show();
		

	}

}
