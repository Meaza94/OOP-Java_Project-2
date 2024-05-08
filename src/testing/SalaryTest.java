package testing;


import application.FullTimeTechnician; //Imports the FullTimeTechnician class
import application.PartTimeTechnician; // Imports the PartTimeTechnician class
import org.junit.jupiter.api.Test;  // Imports JUnit testing components
import static org.junit.jupiter.api.Assertions.*;
/**
 * The SalaryTest class hosts JUnit tests to verify salary calculations
 * for full-time and part-time technicians.
 */
public class SalaryTest {

    @Test // JUnit test case
    public void testFullTimeTechnicianSalary() {
        // Create a FullTimeTechnician object with sample data
        FullTimeTechnician technician = new FullTimeTechnician("Meaza", "FT152", 50000.0);

        // Assert that the calculated salary matches the expected annual salary
        assertEquals(50000.0, technician.calculateSalary());
    }

    @Test //  another test case
    public void testPartTimeTechnicianSalary() {
        // Create a PartTimeTechnician with sample data
        PartTimeTechnician technician = new PartTimeTechnician("David", "PT678", 24.5); 

        // Assert that the calculated salary is based on hourly rate and standard 37.5 hour workweek
        assertEquals(918.75, technician.calculateSalary()); 
    }
}