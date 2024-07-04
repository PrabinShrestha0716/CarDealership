package CarDealership;

import java.util.Scanner;

public class Customer {

static String decision;


    public static void Customerinfo(){
        
        
        System.out.print("What is your name?  : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        System.out.println( "Greetings, Mr "+ name + " to our delarship.");
        System.out.println( " Do you have any prefer employee to assit you today? "
        +" you can say no is you dont have any preference or can tell the name of the employee.");
 
    decision = sc.nextLine();
     

        switch (decision) {
            case "no":
                   System.out.println("no, problem! one of our employee will shortly be there with you soon.");
                break;
        
            default:
                 System.out.println("Thats great!"+ decision + " will be there shortly to assit you");
                break;
        }

    }


    public String getDecision() {
        return decision;
    }


    public void setDecision(String decision) {
        Customer.decision = decision;
    }

    
}
