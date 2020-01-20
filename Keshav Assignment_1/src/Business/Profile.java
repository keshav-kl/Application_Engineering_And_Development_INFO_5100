/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kesha
 */
public class Profile {
    
    //General Information
    private String fname;
    private String lname;
    private String phone;
    private String ssn;
    private String dob;
    private String age;
    
    // Address Information
    private String street;
    private String city;
    private String state;
    private String zip;
    //Bank Information checking
    private String chbname;
    private String chbalance;
    private String chaccount;
    private String chrouting;
    //Bank Information 
    private String sbname;
    private String sbalance;
    private String saccount;
    private String srouting;
    //Driver's License
    private String license;
    private String doi;
    private String exp;
    private String blood;
    private String licensePicture;

    public String getLicensePicture() {
        return licensePicture;
    }

    public void setLicensePicture(String licensePicture) {
        this.licensePicture = licensePicture;
    }
 
    //Medical Information
    private String record;
    private String allergy1;
    private String allergy2;
    private String allergy3;
    
    //getters and setters
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getChbname() {
        return chbname;
    }

    public void setChbname(String chbname) {
        this.chbname = chbname;
    }

    public String getChbalance() {
        return chbalance;
    }

    public void setChbalance(String chbalance) {
        this.chbalance = chbalance;
    }

    public String getChaccount() {
        return chaccount;
    }

    public void setChaccount(String chaccount) {
        this.chaccount = chaccount;
    }

    public String getChrouting() {
        return chrouting;
    }

    public void setChrouting(String chrouting) {
        this.chrouting = chrouting;
    }

    public String getSbname() {
        return sbname;
    }

    public void setSbname(String sbname) {
        this.sbname = sbname;
    }

    public String getSbalance() {
        return sbalance;
    }

    public void setSbalance(String sbalance) {
        this.sbalance = sbalance;
    }

    public String getSaccount() {
        return saccount;
    }

    public void setSaccount(String saccount) {
        this.saccount = saccount;
    }

    public String getSrouting() {
        return srouting;
    }

    public void setSrouting(String srouting) {
        this.srouting = srouting;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDoi() {
        return doi;
    }
       
    public void setDoi(String doi) {
        this.doi = doi;
        
    }
    
    public String getExp(){
        return exp;
    }
    
    public void setExp(String exp){
        this.exp = exp;
    }
    
    public String getBlood(){
        return blood;
    }
    
    public void setBlood(String blood){
        this.blood = blood;
    }
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getAllergy1() {
        return allergy1;
    }

    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    public String getAllergy2() {
        return allergy2;
    }

    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    public String getAllergy3() {
        return allergy3;
    }

    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }
  
    
    
    
}
