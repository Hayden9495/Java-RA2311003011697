import java.util.Scanner;

class Parento{
	// This is an abstract Class
	
	String name;
	int age;
	int rollno;

	public void Setmember(String n,int a,int r){
	this.name = n;
	this.age = a;
	this.rollno = r;
	
	System.out.println(name+" "+age+" "+rollno);
	}
}

class Inherito extends Parento{
	// This is an inherited class of an abstract class
	
	//Polymorphism => Constructor Overloading
	
	Inherito(){
	    Setmember("Default",0,0);
	};
	Inherito(String n,int a,int r){
		Setmember(n,a,r);
	};
}


public class OOPS{
    public static void main(String []args){
	Inherito obj1 = new Inherito("Hayden",18,1697);
	Inherito obj2 = new Inherito();
}
}
