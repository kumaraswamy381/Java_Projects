package OOPS;

public class Parent 
{
	int a= 10;
	void display() {
		System.out.println("parent class");
	}

class Child extends Parent

{
	int b=20;
	void show() {
		System.out.println("child class");
		
	}
}

static class inherit
{
	public static void main(String[] args) 
	{
		Parent parentObj = new Parent(); 
		Parent.Child obj= parentObj.new Child();
		System.out.println("child class variable" +obj.b);
		obj.show();
		System.out.println("Parent class variable" +obj.a);
		obj.display();


	}

}
}
