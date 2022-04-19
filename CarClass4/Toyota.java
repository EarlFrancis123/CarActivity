package CarClass4;

public class Toyota extends Car {
    private String carSound;

    public Toyota(String Name, String Model, String Brand,String Year) {
        super(Name, Model, Brand, Year );
       
    }
    public Toyota(String carSound,String Name, String Model, String Brand,String Year, double gas, String Location) {
       
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