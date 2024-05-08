package application;

//full-time technician, inheriting properties and behaviors from the BaseTechnician class
public class FullTimeTechnician extends BaseTechnician {
	
	//Constructor for creating a FullTimeTechnician object.
    public FullTimeTechnician(String name, String technicianId, double salary) {
        super(name, technicianId, salary);// Calls the parent class (BaseTechnician) constructor
    }

    
     //Implements the abstract calculateSalary method from the BaseTechnician class.
    
    @Override
    public double calculateSalary() {
		return salary;
        
    }
    //Overrides the setSalary method from the BaseTechnician class.
    
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
