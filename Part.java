public class Part
{	
	Person customer;
	int part_number;
	String part_name;
	int cost;
	int labour_cost;
	
	public void makePart(Person customer, String part_name, int part_number, int cost, int labour_cost)
	{
		this.customer = customer;
		this.part_name = part_name;
		this.part_number = part_number;
		this.cost = cost;
		this.labour_cost = labour_cost;
		
	}	
	public String toString() {
		return this.part_name + " " + Integer.toString(this.part_number) + " " + Integer.toString(this.cost)
		+ " " + Integer.toString(this.labour_cost);
		       
	}
	public String[] arrayString() {
		String[] out = new String[100];

		out[0] = customer.name;
		out[1] = part_name;

		return out;
	}
	
	
}
