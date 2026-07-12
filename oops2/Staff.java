package oopsdemo2;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 4:10:39 PM
 * Email : sirinandini.a@gmail.com
 */

public class Staff {

	private int empId;
	private String name;
	protected float salary,hra;

	// Constructor
	public Staff(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Methods
	void getHRA(){
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
	}

	void display(){
		System.out.println(empId+" "+name+" "+salary);
	}

	void print(){
		System.out.println("Gross Salary of Staff :"+(salary+hra));
	}

}


class Manager extends Staff{
	protected float da;
	private float gross;


	// Constructor
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
	}


	void getDA() {
		da = (salary * 80)/100;
		System.out.println("DA is : "+da);
	}

	void getGross()	{
		gross= salary+hra+da;
		System.out.println("Gross Salary of Manager is :"+gross);
	}	

}


class Director extends Manager{
	/* Staff --> Manager -->Director */

	// Declaration of properties
	private float ta,gross;


	// Constructor
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	
	
	// Methods
	void getTA(){
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}

	void getGross(){
		gross= salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :"+gross);
	}
}
