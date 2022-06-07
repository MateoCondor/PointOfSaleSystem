package ec.edu.espe.PointofSaleSystem.view;

import ec.edu.espe.PointofSaleSystem.model.Customer;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE
 */
public class PointofSaleSystemDisplay {
    public static void main(String[] args) {
        ArrayList<Customer> customers;
        Scanner imput;
        String customerName;
        String customerSurname;
        String customerAdrress;
        int customerID;
        int customerPhone;
        int menuOption;
        int returnMenu = 0;
        File file = new File("./CustomersData.csv");
        imput = new Scanner(System.in);
        customers = new ArrayList<>();
        
        do{
            System.out.println("This is the Point of Sale System program");

            System.out.println("\n|====|MENU|====|");
            System.out.println("-1- Create Invoice");
            System.out.println("-2- Sales register");
            System.out.println("-3- Register new product");
            System.out.println("-4- Search product ");
            System.out.println("-5- Payments and expenses");
            System.out.println("-6- Daily Report");
            System.out.println("\n|Insert your choise please|");
            menuOption = Integer.parseInt(imput.nextLine());

            switch(menuOption){
                case 1 :
                    System.out.println("\nPlease enter the following data");
                    System.out.println("Customer name: ");
                    customerName = imput.nextLine();
                    System.out.println("Customer surname: ");
                    customerSurname = imput.nextLine();
                    System.out.println("Identification card: ");
                    customerID = Integer.parseInt(imput.nextLine());
                    System.out.println("Phone: ");
                    customerPhone = Integer.parseInt(imput.nextLine());
                    System.out.println("Address: ");
                    customerAdrress = imput.nextLine();
                    
                    customers.add(new Customer(customerName,customerSurname,customerID,customerPhone,customerAdrress));
                    
                    try (FileWriter fileW = new FileWriter(file,true);){
                        fileW.write(customers.toString()+"\n");
                    }catch(Exception e){
                        System.out.println("An error has occurred");
                    }
                    
                    System.out.println("Invoice data -> " + customers);

                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
                case 2 :
                    System.out.println("\nSales made by date and time will be recorded\n");
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());;
                    break;
                case 3 :
                    System.out.println("\nA new product will be registered with a name and a unit price\n");
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
                case 4 :
                    System.out.println("\nSystem to search for the existence and price of any previously registered product\n");
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
                case 5 :
                    System.out.println("\nPayments to suppliers and expenses for basic services will be recorded\n");
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
                case 6 :
                    System.out.println("\nRecord of daily sales, payments and expenses organized by date and time\n");
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
            }
        }while(returnMenu==1); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PointofSaleSystemDisplay{");
        sb.append('}');
        return sb.toString();
    }

}