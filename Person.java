import java.io.File;
public class Person
{	

	
	int r_o;
	String name;
	int est;
	String schedule_in;
	String schedule_out;
	String dept_status;
	String jobClass;
	int total;
	int balance;
	String insurance;
	int deduct;
	String year;
	String make;
	String color;
	String model;
	String rental;
	String license;
	String claim;
	String poa;
	
	File f;

	public void makePerson(int r_o,
			       String name,
			       int est,
			       String schedule_in,
			       String schedule_out,
			       String dept_status,
			       String jobClass,
			       int total,
                               int balance,
                               String insurance,
                               int deduct,
                               String year,
                               String make,
                               String color,
                               String model,
                               String rental,
                               String license,
                               String claim,
                               String poa)
	{
		this.name = name;
		this.schedule_in = schedule_in;
		this.schedule_out = schedule_out;
		this.dept_status = dept_status;
		this.jobClass = jobClass;
		this.insurance = insurance;
		this.year = year;
		this.make = make;
		this.color = color;
		this.model = model;
		this.rental = rental;
		this.license = license;
		this.claim = claim;
		this.poa = poa;
		this.r_o = r_o;
		this.est = est;
		this.total = total;
		this.balance = balance;
		this.deduct = deduct;
	}
	public void setFile(File f)
	{
		this.f = f;
	}
	public String toString() {
		return this.r_o + " " + this.name + " " + this.est + " "  + this.schedule_in + " " + this.schedule_out + " " +
		       this.dept_status + " " + this.jobClass +  " " + this.total + " " + this.balance  + " " + this.insurance + " " +
		       this.deduct + " " + this.year + " " +  this.make + " " + this.color + " " + this.model + " " + this.rental +
		       this.license + " " + this.claim + " " + this.poa;
		       
	}
	public String[] arrayString() {
		String[] out = new String[100];
		
		out[0] = Integer.toString(r_o);
		out[1] = name;
		out[2] = Integer.toString(est);
		out[3] = schedule_in;
		out[4] = schedule_out;
		out[5] = dept_status;
		out[6] = jobClass;
		out[7] = Integer.toString(total);
		out[8] = Integer.toString(balance);
		out[9] = insurance;
		out[10] = Integer.toString(deduct);
		out[11] = year;
		out[12] = make;
		out[13] = color;
		out[14] = model;
		out[15] = rental;
		out[16] = license;
		out[17] = claim;
		out[18] = poa;

		return out;

	}
	public static void main(String[] args) 
	{
		
	}
	
}
