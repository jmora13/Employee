import java.util.*;

public class Employee {
	int employeeNumber;
	String name;
	Date hireDate;
	
	public Employee(int eNumber, String eName, Date hDate){
		employeeNumber = eNumber;
		name = eName;
		hireDate = hDate;
	}

	public String toString(){
		String s;
		s = "Employee Number: " + employeeNumber + "\nEmployee Name:" + name + "\nHire Date: " + hireDate;
		return s;
	}

	public static void main(String[] args){
		Employee[] list = new Employee[6];
		Date d1 = new Date(1999,12,6);
		Date d2 = new Date(2000,12,6);
		Date d3 = new Date(2001,12,6);
		Date d4 = new Date(2002,12,6);
		Date d5 = new Date(2003,12,6);
		Date d6 = new Date(2004,12,6);
		
		list[0] = new ProductionWorker(0,"Employee 0",d1,0, 5.0);
		list[1] = new ProductionWorker(1,"Employee 1", d2,1,5.0);
		list[2] = new ProductionWorker(2, "Employee 2", d3, 1, 5.0);
		list[3] = new OfficeWorker(3, "Employee 3", d4, "regular worker", 50000.0);
		list[4] = new OfficeWorker(3, "Employee 4", d5, "regular worker", 60000.0);
		list[5] = new OfficeWorker(3, "Employee 5", d6, "regular worker", 70000.0);
		
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i].toString());
		}
	}
}
