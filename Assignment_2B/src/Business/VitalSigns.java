package Business;

/**
 *
 * @author kesha
 */
public class VitalSigns {
    
    private int age;
    private int respiratoryAge;
    private int heartRate;
    private int bloodPressure;
    private double weightKilos;
    private double  weightPounds;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getRespiratoryAge() {
        return respiratoryAge;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public double getWeightKilos() {
        return weightKilos;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setRespiratoryAge(int respiratoryAge) {
        this.respiratoryAge = respiratoryAge;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setWeightKilos(double weightKilos) {
        this.weightKilos = weightKilos;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }
    
    
}
