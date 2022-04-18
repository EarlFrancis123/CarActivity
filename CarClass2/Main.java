package CarClass2;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner inputsc = new Scanner(System.in);
        int option;
        String Travellocation;
        Car[] car = new Car[5];

        car[0] = new Car("SUV", "Model1", "Toyota", "2020");
        car[1] = new Car("Luxury", "Model2", "Ford", "2018");
        car[2] = new Car("Muscle Car", "Model3", "Honda", "2017");
        car[3] = new Car("Electric Car", "Model4", "Tesla", "2022");
        car[4] = new Car("Sprots Car", "Model5", "Lamborghini", "2021");
        car[0].setLocation("cebu");
        car[1].setLocation("cebu");
        car[2].setLocation("cebu");
        car[3].setLocation("cebu");
        car[4].setLocation("cebu");

   

        
        
        do{
            System.out.println("___________________________________________________________________________________");
            System.out.println("Press [1] For SUV");
            System.out.println("Press [2] For Luxury");
            System.out.println("Press [3] For Muscle Car");
            System.out.println("Press [4] For Electric Car");
            System.out.println("Press [5] For Sports Car");
            System.out.println("Press [6] to View all Cars Location");
            System.out.println("Press [0] to END");
            System.out.println("___________________________________________________________________________________");
            option=inputsc.nextInt();
            inputsc.nextLine();
            
                        if(option == 1){
                                System.out.println("Pleas input you travel location");
                                Travellocation = inputsc.nextLine();
                                car[0].setLocation(Travellocation);
                                System.out.println("___________________________________________________________________________________");
                                System.out.println("Car Name is "+ car[0].Name +" Car model " +car[0].Model+" Car Brand "+ car[0].Brand+" Car Year "+ car[0].Year + " Location "+ car[0].getLocation());
                                
                        }
                    
                        else if (option == 2){
                            System.out.println("Pleas input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[1].setLocation(Travellocation);
                            System.out.println("Car Name is "+ car[1].Name +" Car model " +car[1].Model+" Car Brand "+ car[1].Brand+" Car Year "+ car[1].Year + " Location "+ car[1].getLocation());
                        }else if(option == 3){
                            System.out.println("Pleas input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[2].setLocation(Travellocation);
                            System.out.println("Car Name is "+ car[2].Name +" Car model " +car[2].Model+" Car Brand "+ car[2].Brand+" Car Year "+ car[2].Year + " Location "+ car[2].getLocation());
                        }else if(option == 4){
                            System.out.println("Pleas input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[3].setLocation(Travellocation);
                            System.out.println("Car Name is "+ car[3].Name +" Car model " +car[3].Model+" Car Brand "+ car[3].Brand+" Car Year "+ car[3].Year + " Location "+ car[3].getLocation());
                        }else if(option == 5){
                            System.out.println("Pleas input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[4].setLocation(Travellocation);
                            System.out.println("Car Name is "+ car[4].Name +" Car model " +car[4].Model+" Car Brand "+ car[4].Brand+" Car Year "+ car[4].Year + " Location "+ car[4].getLocation());
                        }
                        else if(option == 6){
                            System.out.println("ALL CARS LOCATION");
                            System.out.println("\n");
                            System.out.println("Car "+ car[0].Name + " is in " + car[0].getLocation());
                            System.out.println("Car "+ car[1].Name + " is in " + car[1].getLocation());
                            System.out.println("Car "+ car[2].Name + " is in " + car[2].getLocation());
                            System.out.println("Car "+ car[3].Name + " is in " + car[3].getLocation());
                            System.out.println("Car "+ car[4].Name + " is in " + car[4].getLocation());

                            
                        }
                    }
        while(option != 0 );
            System.out.println("Program End Thank you!!");
       inputsc.close();
    

  
    
                    }
}
