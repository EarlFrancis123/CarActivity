package CarClass;


public class Car {
  String Name;
  String Model;
  String Brand;
  String Year;
  private String Location;


  public Car(String Name, String Model, String Brand,String Year){
    this.Name = Name;
    this.Model = Model;
    this.Brand = Brand;
    this.Year = Year;
  



}


public String getLocation() {
    return Location;
}


public void setLocation(String location) {
    Location = location;
}


}
