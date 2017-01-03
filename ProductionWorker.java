import java.util.Date;

public class ProductionWorker extends Employee{
	int shift;
	double hourlyPayRate;
	
	public ProductionWorker(int eNumber, String eName, Date hDate, int shiftTime, double pay){
		super(eNumber, eName, hDate);
		shift = shiftTime;
		hourlyPayRate = pay;
	}

	public String toString(){
		String s;
		s = "Employee Number: " + employeeNumber + "\nEmployee Name:" + name + "\nHire Date: " + hireDate + "\nShift Time: " + shift + "Pay: " + hourlyPayRate;
		return s;
	}
}
