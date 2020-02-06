/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.VitalSigns;
import Business.Patient;
import static Business.Patient.isPatientNormal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kesha
 */
public class Main {
    public static void main (String args[])
    {
        
    ArrayList<Patient> patientsList = new ArrayList<Patient>(); 
    int pId=0;
    
    while(true)
    {
         Scanner input = new Scanner (System.in);
  
         
     
         int count = 0;
    
       
      {
      
       
        
          System.out.println("\nPress 1 for New Patient, 2 for Existing Patient, 3 for Vital Sign History and 4 to Exit");
          System.out.println("1. New Patient");
          System.out.println("2. Existing Patient");
          System.out.println("3. Vital Sign History");
          System.out.println("4. Exit");
       
          int option = input.nextInt();
          
          while(true)
          {
              if(option < 0 || option > 4)
              {
                  System.out.println("Select Options between 1 and 4");
                  option = input.nextInt();
              }
              else break;
          }
          
         if(option == 1)
        
        {
          
          Patient patient = new Patient();
          VitalSigns vitalSigns = new VitalSigns();
         
          //Patient ID Setter
          pId = pId + 1;
          patient.setId(pId);
          System.out.println("The Patient ID is " +pId);
         
          //Patient Name Input Capture
          System.out.println("Enter Patient's Full Name" );
          String name=input.nextLine();
          name+=input.nextLine();
          patient.setName(name);
          
         //New Vital Sign Record  
         System.out.println("Input New Vital Signs for the Patient");
         System.out.println("------------------------------------");
         
         System.out.println("Enter 0 for New born (0-30 Days)");
         System.out.println("Enter 1 for Infant (1-12 Months)");
         System.out.println("Enter 2 for Toddler (1-3 Years)");
         System.out.println("Enter 3 for Pre Schooler (3-5 Years)");
         System.out.println("Enter 4 for School Age (6-12 Years)");
         System.out.println("Enter 5 for Adolescent (13+ Years)");
         vitalSigns.setAge(input.nextInt());
        
         System.out.println("Enter the Respiratory Rate");
         vitalSigns.setRespiratoryAge(input.nextInt());
         
         System.out.println("Enter the Heart Rate");
         vitalSigns.setHeartRate(input.nextInt());
                 
         System.out.println("Enter the Blood Pressure");
         vitalSigns.setBloodPressure(input.nextInt());
                 
         System.out.println("Enter the Weight in Kilos");
         vitalSigns.setWeightKilos((int) input.nextDouble());
                 
         System.out.println("Enter the Weight in Pounds");
         vitalSigns.setWeightPounds( input.nextDouble());
         
        
         
         System.out.println("-------------------------");
         
         System.out.println("The Vital Signs have been Recorded!");
         
         System.out.println("Is the Patient Normal? - " +isPatientNormal(vitalSigns));
         
         patient.vitalSignHistory.add(vitalSigns);
         patientsList.add(patient);
         //Code to Check Individual Vital Signs
        System.out.println("Do you want to check individual Vital Signs? (y/n)");
        char response = input.next().charAt(0);
        while (response != 'y' && response != 'n')
        {
            System.out.println("Please enter y or n");
            response = input.next().charAt(0);
        }
         
        if (response == 'y')
        {
              System.out.println("Enter the Vital Sign you want to check -");
            System.out.println("1. Respiratory Rate \n 2. Heart Rate \n 3. Blood Pressure \n 4. Weight in Kilos \n 5. Weight in Pounds");
            String vsign = input.nextLine();
            vsign+=input.nextLine();
        
            boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns,vsign);
            
         
        } else if (response == 'n')
        {
            continue;
        }
        
        
        
        }
         
         
         else  if(option == 2)
        {
            System.out.println("Enter Patient ID - ");
            int id = input.nextInt();
            Patient patient = patientsList.get(id-1);
            
            
            System.out.println("Patient's Name - " + patient.getName());
            System.out.println("Do you want to enter new Vital Signs? (y/n)");
            char response = input.next().charAt(0);
          
            //All other responses
            while (response != 'y' && response != 'n')
            {
               System.out.println("Enter y or n and hit enter");
               response = input.next().charAt(0);
            }
           
            if(response == 'y')
            {
                VitalSigns vitalSigns = new VitalSigns();
                
                System.out.println("Input New Vital Signs for the Patient");
                System.out.println("------------------------------------");
         
                System.out.println("Enter 0 for New born (0-30 Days)");
                System.out.println("Enter 1 for Infant (1-12 Months)");
                System.out.println("Enter 2 for Toddler (1-3 Years)");
                System.out.println("Enter 3 for Pre Schooler (3-5 Years)");
                System.out.println("Enter 4 for School Age (6-12 Years)");
                System.out.println("Enter 5 for Adolescent (13+ Years)");
                vitalSigns.setAge(input.nextInt());
        
                System.out.println("Enter the Respiratory Rate");
                vitalSigns.setRespiratoryAge(input.nextInt());
         
                System.out.println("Enter the Heart Rate");
                vitalSigns.setHeartRate(input.nextInt());
                 
                System.out.println("Enter the Blood Pressure");
                vitalSigns.setBloodPressure(input.nextInt());
                 
                System.out.println("Enter the Weight in Kilos");
                vitalSigns.setWeightKilos((int) input.nextDouble());
                 
                System.out.println("Enter the Weight in Pounds");
                vitalSigns.setWeightPounds( input.nextDouble());
         
        
         
                System.out.println("-------------------------");
         
                System.out.println("The Vital Signs have been Recorded!");
         
                System.out.println("Is the Patient Normal? - " +isPatientNormal(vitalSigns));
         
                patient.vitalSignHistory.add(vitalSigns);
                patientsList.add(patient);
                        //Code to Check Individual Vital Signs
               System.out.println("Do you want to check individual Vital Signs? (y/n)");
                char response1 = input.next().charAt(0);
                while (response1 != 'y' && response != 'n')
                {
                  System.out.println("Please enter y or n");
                  response1 = input.next().charAt(0);
        }
         
        if (response1 == 'y')
        {
              System.out.println("Enter the Vital Sign you want to check -");
            System.out.println("1. Respiratory Rate \n 2. Heart Rate \n 3. Blood Pressure \n 4. Weight in Kilos \n 5. Weight in Pounds");
            String vsign = input.nextLine();
            vsign+=input.nextLine();
        
            boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns,vsign);
            
         
        } else if (response == 'n')
        {
            continue;
        }
        
            }
            
        }
        
         else if (option == 3)
         {
             System.out.println("Enter Patient ID - ");
             int id = input.nextInt();
             
             Patient patient = patientsList.get(id-1);
             System.out.println("The History of Vital Signs for Patient Name - " +patient.getName() );
             
             for(VitalSigns v : patient.vitalSignHistory)
             {
                 System.out.println("Vital Signs listed below\n");
                 System.out.println("Patient's Age - " +v.getAge());
                 System.out.println("Patient's Respiratory Rate - " +v.getRespiratoryAge());
                 System.out.println("Patient's Heart Rate - " +v.getHeartRate());
                 System.out.println("Patient's Blood Pressure - " +v.getBloodPressure());
                 System.out.println("Patient's Weight in Kilos - " +v.getWeightKilos());
                 System.out.println("Patient's Weight in Pounds - " +v.getWeightPounds());
                 
             }
                     
         }
         else if (option == 4)
         {
             break;
         }
         System.out.println("Exit? (y/n)");
         char response = input.next().charAt(0);
         while (response != 'y' && response != 'n')
         {
             System.out.println("Input y/n");
             response = input.next().charAt(0);
         }
         
         if (response == 'y')
         {
             System.out.println("GoodBye");
             break;
         }
         else if (response == 'n')
         {
             continue;
         }
         
         }
        
      }



         
         
    }
    
    
    
}

