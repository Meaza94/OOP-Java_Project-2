package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReader {

    
	public ArrayList<BaseTechnician> readTechnicians(String filePath)throws NumberFormatException,IOException{
		// Create an empty ArrayList to store the technicians we'll extract from the file
        ArrayList<BaseTechnician> technicians = new ArrayList<>();
        
        // try-with-resources ensures the BufferedReader is automatically closed, preventing resource leaks  
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
         // Loop through each line in the CSV file
            while ((line = br.readLine()) != null) {
            	
            	// Split the line by commas to separate the technician's data fields 
                String[] data = line.split(",");
               
                // Extract values from the data array
                String technicianId = data[2];
                String name = data[1];
                double salary = Double.parseDouble(data[3]);// Convert salary string to a double value
                String type = data[0].trim();
                
                
                // to determine if the technician is fulltime or PartTime and create the corresponding object
                if (type.equalsIgnoreCase("Fulltime")) {
                    technicians.add(new FullTimeTechnician(name, technicianId, salary));
                } else {
                	technicians.add(new PartTimeTechnician(name, technicianId, salary));
                } 
                
             
                
            }
            // Return the list of technicians created from the CSV file data
        return technicians;
    }
        
    }
}
