package CarClass4;

public class Honda extends Car {
    private String carSound;

    public Honda(String Name, String Model, String Brand,String Year) {
        super(Name, Model, Brand, Year );
       
    }
    public Honda(String carSound,String Name, String Model, String Brand,String Year, double gas, String Location) {
       
        super(Name, Model, Brand, Year, gas, Location );
        this.carSound = carSound;
    }
   

    public String getCarSound() {
        return carSound;
    }

    public void setCarSound(String carSound) {
        this.carSound = carSound;
    }
}