/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;
/**
 *
 * @author kesha
 */



public class Patient {
    
    public static void main(String args[])
    {
     Patient patient = new Patient();
     VitalSigns vitalSigns = new VitalSigns();
     
     Scanner input = new Scanner(System.in);
     
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
                 
         System.out.println("Is the Patient Normal? - " +isPatientNormal(vitalSigns));
                 
                 
    }
    
    public static boolean isPatientNormal(VitalSigns vitals){
        String ageGroup = getAgeGroup(vitals.getAge());
        
        System.out.println("Respiratory Age - "+checkRespiratoryrate(ageGroup, vitals.getRespiratoryAge()));
        System.out.println("Heart Rate - "+checkHeartRate(ageGroup, vitals.getHeartRate()));
        System.out.println("Blood Pressure - "+checkBloodPressure(ageGroup, vitals.getBloodPressure()));
        System.out.println("Weight in Kilos - "+checkWeightInKilos(ageGroup, vitals.getWeightKilos()));
        System.out.println("Weight in Pounds - "+checkWeightInPounds(ageGroup, vitals.getWeightPounds()));
        
        return checkRespiratoryrate(ageGroup, vitals.getRespiratoryAge()) &&
        checkHeartRate(ageGroup, vitals.getHeartRate()) &&
        checkBloodPressure(ageGroup, vitals.getBloodPressure()) &&
        checkWeightInKilos(ageGroup, vitals.getWeightKilos()) &&
        checkWeightInPounds(ageGroup, vitals.getWeightPounds());
    }
    
    public static String getAgeGroup(int age){
        
       if(age == 0){
           return "New Born";
       }
       else if(age == 1){
           return "Infant";
       }
       else if(age == 2) {
                   return "Toddler";
       }
       else if(age ==3) {
               return "Preschooler";
       }
       else if(age == 4){
               return "School Age";
       }
       else if(age == 5){
               return "Adolescent";
       }
       else{
           return "Invalid Age";
       }
    }
 
    
    public static boolean checkRespiratoryrate(String ageGroup, int rate){
        
        if((rate >= 30 && rate <=50) && ageGroup.equals("New Born")){
            return true;
        }
        else if ((checkSameRate(rate)) && ageGroup.equals("Infant")){
            return true;
                }
        
        else if ((checkSameRate(rate)) && ageGroup.equals("Toddler")){
            return true;
        }
       
        else if ((checkSameRate(rate)) && ageGroup.equals("Preschooler")){
            return true;
        }
        
        else if ((checkSameRate(rate)) && ageGroup.equals("School Age")){
            return true;
        }
        
        else if ((rate >= 12 && rate <= 20) && ageGroup.equals("Adolescent")){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static boolean checkHeartRate(String ageGroup, int heartRate) {
    
        if((heartRate >= 120 && heartRate <= 160) && ageGroup.equals("New Born")){
            return true;
        }
        else if ((heartRate >= 80 && heartRate <= 140) && ageGroup.equals("Infant")){
            return true;
        }
        else if ((heartRate >= 80 && heartRate <= 130) && ageGroup.equals("Toddler")){
            return true;
        }
        
        else if ((heartRate >= 80 && heartRate <= 120) && ageGroup.equals("Preschooler")){
            return true;
        }  
        
        else if ((heartRate >= 70 && heartRate <= 110) && ageGroup.equals("School Age")){
            return true;
        }
        
        else if ((heartRate >= 55 && heartRate <= 105) && ageGroup.equals("Adolescent")){
            return true;
        }
        
        else { 
            return false;
        }
        
        }
    
    public static boolean checkBloodPressure(String ageGroup, int bloodPressure){
        
        if((bloodPressure >= 50 && bloodPressure <= 70) && ageGroup.equals("New Born")){
            return true;
        }
        else if ((bloodPressure >= 70 && bloodPressure <= 100) && ageGroup.equals("Infant")){
            return true;
        }
        
        else if ((bloodPressure >= 80 && bloodPressure <= 110) && ageGroup.equals("Toddler")){
            return true;
            }
        else if ((bloodPressure >= 80 && bloodPressure <= 110) && ageGroup.equals("Preschooler")){
            return true;
        }
        else if ((bloodPressure >= 80 && bloodPressure <= 120) && ageGroup.equals("School Age")){
            return true;
        }
        else if ((bloodPressure >= 110 && bloodPressure <= 120) && ageGroup.equals("Adolescent")){
            return true;
        }
        else 
        {
          return false;
        }
        
    } 
            
          public static boolean checkWeightInKilos(String ageGroup, double kilos){
              
              if((kilos >= 2 && kilos <= 3) && ageGroup.equals("New Born")){
                  return true;
              }
              else if ((kilos >= 4 && kilos <= 10) && ageGroup.equals("Infant")){
                  return true;
              }
              else if ((kilos >= 10 && kilos <= 14 ) && ageGroup.equals("Toddler")){
                  return true;
              }
          
              else if ((kilos >= 14 && kilos <= 18 ) && ageGroup.equals("Preschooler")){
                  return true;
              }
              else if ((kilos >= 18 && kilos <= 42) && ageGroup.equals("School Age")){
                  return true;
              }
              else if ((kilos >= 50 && kilos >= 42) && ageGroup.equals("Adolescent")){
                  return true;
              }
              else {
                  return false;              
              }
          } 
    
          public static boolean checkWeightInPounds(String ageGroup, double pounds){
              if((pounds >= 4.5 && pounds <= 7 ) && ageGroup.equals("New Born")){
                  return true;
              }
              else if ((pounds >= 7 && pounds <= 22) && ageGroup.equals("Infant")){
                  return true;
              }
              else if ((pounds >= 22 && pounds <= 31) && ageGroup.equals("Toddler")){
                  return true;
              }
              else if ((pounds >= 31 && pounds <= 40) && ageGroup.equals("Preschooler")){
                  return true;
              }
              else if ((pounds >= 41 && pounds <= 92) && ageGroup.equals("School Age")){
                  return true;
              }
              else if ((pounds >= 110 && pounds >= 92) && ageGroup.equals("Adolescent")){
                  return true;
              }
              else {
                  return false;
              }
          }
    
    public static boolean checkSameRate(int rate){
        return rate >=20 && rate <= 30;
    }
        
    
}

