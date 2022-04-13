package CarClass;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner inputsc = new Scanner(System.in);
        int option;
        String Travellocation;
       
        Car car = new Car("4by4", "Raptor", "Ford", "2020");
        car.setLocation("Cebu");
        System.out.println("My car is "+ car.Name + " and the moded " + car.Model + " and the brand is " + car.Brand + " year " + car.Year + " Location " + car.getLocation() );
        System.out.println("Pleas input you travel location");
     



        do{
            System.out.println("Press [0] if you dont want to travel");
            System.out.println("Press [1] if you want to travel and end the program");
            option=inputsc.nextInt();
            inputsc.nextLine();
            
                        if(option == 1){
                                System.out.println("Pleas input you travel location");
                                Travellocation = inputsc.nextLine();
                                car.setLocation(Travellocation);
                                System.out.println("My car is "+ car.Name + " and the moded " + car.Model + " and the brand is " + car.Brand + " year " + car.Year + " Location " + car.getLocation() );

                        }
                        else{

                        }
                    }
        while(option != 0 );
            System.out.println("Program End Thank you!!");
       inputsc.close();
    
  
    
                    }
}
