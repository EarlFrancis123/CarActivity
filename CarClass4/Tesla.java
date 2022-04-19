package CarClass4;

public class Tesla  extends Car{
    private String carSound;

    public Tesla(String Name, String Model, String Brand,String Year) {
        super(Name, Model, Brand, Year );
       
    }
    public Tesla(String carSound,String Name, String Model, String Brand,String Year, double gas, String Location) {
       
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
