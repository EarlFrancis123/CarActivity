package CarClass3;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner inputsc = new Scanner(System.in);
        int option;
        String Travellocation;
        double Traveldistance;
        Car[] car = new Car[5];
        CalculateGasUsed calculateGasUsed= new CalculateGasUsed();

       

        car[0] = new Car("SUV", "Model1", "Toyota", "2020");
        car[1] = new Car("Luxury", "Model2", "Ford", "2018");
        car[2] = new Car("Muscle Car", "Model3", "Honda", "2017");
        car[3] = new Car("Electric Car", "Model4", "Tesla", "2022");
        car[4] = new Car("Sprots Car", "Model5", "Lamborghini", "2021");
   
        for(int i =0;i<car.length; i++){
            car[i].setLocation("Cebu");;
        }
     
        for(int i =0;i<car.length; i++){
            car[i].setGas(10.00);;
        }
        
        
        do{
            System.out.println("___________________________________________________________________________________");
            System.out.println("Press [1] to View all Cars Specification");
            System.out.println("Press [2] For SUV");
            System.out.println("Press [3] For Luxury");
            System.out.println("Press [4] For Muscle Car");
            System.out.println("Press [5] For Electric Car");
            System.out.println("Press [6] For Sports Car");
            System.out.println("Press [7] to View all Cars Location");
            System.out.println("Press [0] to END");
            System.out.println("___________________________________________________________________________________");
            option=inputsc.nextInt();
            inputsc.nextLine();
                         if(option == 1){
                            System.out.println("Car Name "+ car[0].Name +" Car model " +car[0].Model+" Car Brand "+ car[0].Brand+" Car Year "+ car[0].Year + " Tank Capacity "+ car[0].getGas());
                            System.out.println("Car Name "+ car[1].Name +" Car model " +car[1].Model+" Car Brand "+ car[1].Brand+" Car Year "+ car[1].Year + " Tank Capacity "+ car[1].getGas());
                            System.out.println("Car Name "+ car[2].Name +" Car model " +car[2].Model+" Car Brand "+ car[2].Brand+" Car Year "+ car[2].Year + " Tank Capacity "+ car[2].getGas());
                            System.out.println("Car Name "+ car[3].Name +" Car model " +car[3].Model+" Car Brand "+ car[3].Brand+" Car Year "+ car[3].Year + " Tank Capacity "+ car[3].getGas());
                            System.out.println("Car Name "+ car[4].Name +" Car model " +car[4].Model+" Car Brand "+ car[4].Brand+" Car Year "+ car[4].Year + " Tank Capacity "+ car[4].getGas());
                         }
                        else if(option == 2){
                                System.out.println("Please input you travel location");
                                Travellocation = inputsc.nextLine();
                                car[0].setLocation(Travellocation);
                                System.out.println("Please input the travel distance");
                                Traveldistance = inputsc.nextDouble();
                                car[0].setGas (calculateGasUsed.GasUsed(car[0].getGas(), Traveldistance));
                                System.out.println("___________________________________________________________________________________");
                                System.out.println("Car "+ car[0].Name + " Currently is in "+ car[0].getLocation() +" And the Available Gas is  " + car[0].getGas());
                                
                        }
                    
                        else if (option == 3){
                            System.out.println("Please input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[1].setLocation(Travellocation);
                            System.out.println("Please input the travel distance");
                            Traveldistance = inputsc.nextDouble();
                            car[1].setGas (calculateGasUsed.GasUsed(car[1].getGas(), Traveldistance));
                            System.out.println("___________________________________________________________________________________");
                            System.out.println("Car "+ car[1].Name + " Currently is in "+ car[1].getLocation() +" And the Available Gas is  " + car[1].getGas());

                        }
                        else if(option == 4){
                            System.out.println("Please input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[2].setLocation(Travellocation);
                            System.out.println("Please input the travel distance");
                            Traveldistance = inputsc.nextDouble();
                            car[2].setGas (calculateGasUsed.GasUsed(car[2].getGas(), Traveldistance));
                            System.out.println("___________________________________________________________________________________");
                            System.out.println("Car "+ car[2].Name + " Currently is in "+ car[2].getLocation() +" And the Available Gas is  " + car[2].getGas());
                            
                        }
                        else if(option == 5){
                            System.out.println("Please input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[3].setLocation(Travellocation);
                            System.out.println("Please input the travel distance");
                            Traveldistance = inputsc.nextDouble();
                            car[3].setGas (calculateGasUsed.GasUsed(car[3].getGas(), Traveldistance));
                            System.out.println("___________________________________________________________________________________");
                            System.out.println("Car "+ car[3].Name + " Currently is in "+ car[3].getLocation() +" And the Available Gas is  " + car[3].getGas());
                            
                        }
                        else if(option == 6){
                            System.out.println("Please input you travel location");
                            Travellocation = inputsc.nextLine();
                            car[4].setLocation(Travellocation);
                            System.out.println("Please input the travel distance");
                            Traveldistance = inputsc.nextDouble();
                            car[4].setGas (calculateGasUsed.GasUsed(car[4].getGas(), Traveldistance));
                            System.out.println("___________________________________________________________________________________");
                            System.out.println("Car "+ car[4].Name + " Currently is in "+ car[4].getLocation() +" And the Available Gas is  " + car[4].getGas());
                            
                        }
                        else if(option == 7){
                            System.out.println("ALL CARS LOCATION");
                            System.out.println("\n");
                            System.out.println("Car "+ car[0].Name + " is in " + car[0].getLocation()+ " Available Gas " + car[0].getGas());
                            System.out.println("Car "+ car[1].Name + " is in " + car[1].getLocation()+ " Available Gas " + car[1].getGas());
                            System.out.println("Car "+ car[2].Name + " is in " + car[2].getLocation()+ " Available Gas " + car[2].getGas());
                            System.out.println("Car "+ car[3].Name + " is in " + car[3].getLocation()+ " Available Gas " + car[3].getGas());
                            System.out.println("Car "+ car[4].Name + " is in " + car[4].getLocation()+ " Available Gas " + car[4].getGas());

                            
                        }
                    }
        while(option != 0 );
            System.out.println("Program End Thank you!!");
       inputsc.close();
    

  
    
                    }
}
