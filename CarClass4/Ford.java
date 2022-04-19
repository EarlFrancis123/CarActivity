package CarClass4;

public class Ford extends Car {
    private String carSound;

    public Ford(String Name, String Model, String Brand,String Year) {
        super(Name, Model, Brand, Year );
       
    }
    public Ford(String carSound,String Name, String Model, String Brand,String Year, double gas, String Location) {
       
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