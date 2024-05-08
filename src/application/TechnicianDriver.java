package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TechnicianDriver {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        
        // Create a CSVReader object to read the file
        CSVReader reader = new CSVReader();
        
        String filepath = "C:/Users/mihre/OneDrive/Documents/COLLEGE CLASSES/Object Oriented Programing/Assigments/Assignment 2/data/technicians.csv";
        
     // Read the CSV file, parse technician data, and store results in an ArrayList
        List<BaseTechnician> technicians = reader.readTechnicians(filepath);
        
        
        // Display information and calculate salary for each technician
        for (int i = 0; i < technicians.size(); i++) {
            BaseTechnician technician = technicians.get(i);
            technician.displayDetails();
        

         // Calculate the technician's salary and print the result
            System.out.println("Calculated Salary: $" + technician.calculateSalary());
            System.out.println();// Print a blank line for spacing 
            
        }
 
        }
    }

