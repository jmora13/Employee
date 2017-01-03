import java.util.Date;

public class OfficeWorker extends Employee {
	String position;
	double yearlyPayRate;
	
	public OfficeWorker(int eNumber, String eName, Date hDate, String pos, double salary){
		super(eNumber, eName, hDate);
		position = pos;
		yearlyPayRate = salary;
	}
	public String toString(){
		String s;
		s = "Employee Number: " + employeeNumber + "\nEmployee Name:" + name + "\nHire Date " + hireDate + "\nPosition " + position + "Salary: " + yearlyPayRate;
		return s;
	}
}
