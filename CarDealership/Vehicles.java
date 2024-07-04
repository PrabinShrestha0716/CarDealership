package CarDealership;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Vehicles {

    static String Brand;
    static String color;
    static int year;
    static double cost;


    public static String getBrand() {
        return Brand;
    }


    public static void setBrand(String brand) {
        Brand = brand;
    }


    public static String getColor() {
        return color;
    }


    public static void setColor(String color) {
        Vehicles.color = color;
    }


    public static int getYear() {
        return year;
    }


    public static void setYear(int year) {
        Vehicles.year = year;
    }


    public static double getCost() {
        return cost;
    }


    public static void setCost(double cost) {
        Vehicles.cost = cost;
    }


    public static void VehicleInfo(){

      Scanner sc1 = new Scanner(System.in);
    
    
        System.out.println("Before, I show you the collection of our car, Do you "
        + " any preference on brand? \n"
        + " we have different good brands like :\n"
        +"1. Honda\n"
        +"2. Toyota\n"
        +"3. Chevy\n"
        +"4. BMW\n"
        +"5. Audi\n");

         Brand = sc1.next();
         

         System.out.println("_______________________________________________________________________________");

         System.out.println(" \nThats a pretty good brand\n");

         System.out.println("Also, do you preference with colors? "
         + " we have different colors like :\n"
         +"1. Black\n"
         +"2. Silver\n"
         +"3. Blue \n");

         color = sc1.next();
         System.out.println("_______________________________________________________________________________");

         System.out.println("\n Thats a pretty good choice of color\n");

         System.out.println("ALso, do you preference any specific year? \n"
         + " we have different vehicles built in idfferent year like :\n"
         +"1. 2005-2010\n"
         +"2. 2010-2015\n"
         +"3. 2015-latest\n"
         +" Just type the number between 1-3 for your choice.");
          
         year = sc1.nextInt();
         System.out.println("_______________________________________________________________________________");
         System.out.println(" \nThats a pretty good choice.");

         System.out.println("\nThank you so much for your info and co-operation. "
         + " I want to ask the final question, How much is your budget for the car? :\n"
         +"1. 5000-10,000\n"
         +"2. 10,000-15,000\n"
         +"3. 15,000-more\n"
         +" Just type the number between 1-3 for your choice.");

         cost = sc1.nextInt();
         System.out.println("_______________________________________________________________________________\n");
         System.out.println("Thank you. Let me pull out the list of all the car based upon your prefrences.");


    }


    public static void Vehicleslist() throws InterruptedException{

        int choice1;

        Scanner sc2 = new Scanner(System.in);

       TimeUnit.SECONDS.sleep(2);

       System.out.println("Here is the list of your preferred car");

       if(year==1 && cost==1){
        
            System.out.println("1.2006 " + color + " " + Brand +"  with price value of $7000 with mileage of 145,000 miles"
            + "\n 2.2008 " + color + " " + Brand +"  with price value of $8500 with mileage of 125,000 miles"
            + "\n 3. 2010 "+ color + " " + Brand +"  with price value of $9000 with mileage of 105,000 miles\n");

            System.out.println("\n choose number between 1-3 to select your car");
            choice1 = sc2.nextInt();


            System.out.println("-------------------------------------------------------------");
            System.out.println("|                        CONGRATES                          |");
            System.out.println("-------------------------------------------------------------");


          if(choice1==1){
            System.out.println(" Congratulation for a new 2006" + color + " " + Brand + " car");
            }
          else if(choice1==2){
            System.out.println(" Congratulation for a new 2008" + color + " " + Brand + " car");
            }
          else{
            System.out.println(" Congratulation for a new 2010" + color + " " + Brand + " car");
            }

       }


       if(year==1 && cost==2){

        System.out.println("1.2008 " + color + " " + Brand +"  with price value of $10,000 with mileage of 75,000 miles "
        + "\n 2.2009 " + color + " " + Brand +"  with price value of $12,000 with mileage of 60,000 miles"
        + "\n 3. 2010 "+ color + " " + Brand +"  with price value of $15,000 with mileage of 45,000 miles \n");

       }


       if(year==1 && cost==3){

        System.out.println("1.2008 " + color + " " + Brand +"  with price value of $15,000 with mileage of 25,000 miles "
        + "\n 2.2009 " + color + " " + Brand +"  with price value of $16,500 with mileage of 15,000 miles"
        + "\n 3. 2010 "+ color + " " + Brand +"  with price value of $17,000 with mileage of 5,000 miles \n");

       }


       if(year==2 && cost==1){

       }

       if(year==2 && cost==2){

       }


       if(year==2 && cost==3){

       }

       if(year==3 && cost==1){

       }

       if(year==3 && cost==2){

       }

       if(year==3 && cost==3){

       }
      

       


    }
    
}
