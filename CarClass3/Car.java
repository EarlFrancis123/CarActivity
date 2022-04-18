package CarClass3;


public class Car {
  String Name;
  String Model;
  String Brand;
  String Year;
  private String Location;
  double gas;



  public Car(String Name, String Model, String Brand,String Year){
    this.Name = Name;
    this.Model = Model;
    this.Brand = Brand;
    this.Year = Year;

}

public double getGas() {
    return gas;
}

public void setGas(double gas) {
    this.gas = gas;
}

public Car(double gas){
this.gas = gas;
}


public String getLocation() {
    return Location;
}


public void setLocation(String location) {
    Location = location;
}

   

}
