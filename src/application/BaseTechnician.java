package application;

public abstract class BaseTechnician implements TechDetail {
	// Protected members allow access from within the package and from subclasses 
    protected String name;
    protected String technicianId;
    protected double salary;

    // Constructor for initializing technician details.
    public BaseTechnician(String name, String technicianId, double salary) {
        this.name = name;
        this.technicianId = technicianId;
        this.salary = salary;
    }
    //Prints the technician's ID, name, and salary to the console.
   
    public void displayDetails() {
        System.out.println("Technician ID: " + technicianId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
   
    //Responsible for calculating the technician's salary
    public abstract double calculateSalary(); 
    
    
    //Allows modification of a technician's salary.
    
    public void setSalary(double salary) {
        this.salary = salary;
}

}


