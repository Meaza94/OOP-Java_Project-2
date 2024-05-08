package application;

//part-time technician, extending the BaseTechnician class for core properties and behaviors.
public class PartTimeTechnician extends BaseTechnician {
    
	 //Constructs a PartTimeTechnician object. 
    public PartTimeTechnician(String name, String technicianId, double hourlyRate) {
        super(name, technicianId, hourlyRate);// Call the BaseTechnician constructor
        this.setSalary(hourlyRate);// Immediately set the actual hourlyRate
    }
    

    //the calculateSalary method from BaseTechnician, providing the salary calculation 
    @Override
    public double calculateSalary() {
    return salary * 37.5;
    }

    //Overrides the setSalary method from BaseTechnician, allowing modification of a 
    @Override
    public void setSalary(double hourlyRate) {
        this.salary = hourlyRate;
       
;    }

    
}
