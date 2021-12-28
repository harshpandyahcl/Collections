import java.util.ArrayList;
import java.util.Iterator;
public class employeeDetails {
	
	int id;
	String name;
	String city;
	
	employeeDetails(int id, String name, String city){
		this.id = id;
		this.name = name;
		this.city=city;
	}
	
	public employeeDetails() {
		// TODO Auto-generated constructor stub
	}

	void displayEmployeeDetails(ArrayList<employeeDetails>ed){
		 System.out.println("Employee Detail"); 
	     for(employeeDetails emp: ed)
	     { 
	       System.out.println("Employee ID: " +emp.id); 
	       System.out.println("Employee Name: " +emp.name); 
	       System.out.println("Employee City: " +emp.city); 
	     } 
	    }
	    
	
	
	public static void main(String[] args) {
		ArrayList<employeeDetails> ed = new ArrayList<employeeDetails>(); 
		
		employeeDetails emp1 = new employeeDetails(1, "Harsh", "Corpus Christi" ); 
		employeeDetails emp2 = new employeeDetails(2, "Jay", "Austin"); 
		employeeDetails emp3 = new employeeDetails(3, "John", "Dallas"); 
		
		
		ed.add(emp1);
		ed.add(emp2);
		ed.add(emp3);
		
		employeeDetails disp = new employeeDetails();
		disp.displayEmployeeDetails(ed);
		
		
	}

}
