package CarDealership;

public class employee {


    public static void employeeInfo(){


            Customer cust = new Customer();

            String employeeName =cust.decision;

            System.out.println(employeeName);

            if(employeeName =="no"){
                System.out.println(" Hi, I am Robert Adision, I will be assiting you");
            }
            else{
                System.out.println("Hi, I am " + employeeName + " nice to meet you. Thank you for choosing me to assit you.");
            }


    }


    
}
