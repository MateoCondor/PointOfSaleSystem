package ec.edu.espe.PointofSaleSystem.view;

import ec.edu.espe.PointofSaleSystem.model.Customer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE
 */
public class PointofSaleSystemDisplay {
    public static void main(String[] args) {
        System.out.println("This is the Point of Sale System program");
        
        ArrayList<Customer> customers;
        Scanner imput;
        imput = new Scanner(System.in);
        
        
        System.out.println("|====|MENU|w====|");
        System.out.println("-1- Create Invoice");
        System.out.println("-2- Sales register");
        System.out.println("-3- Register new product");
        System.out.println("-4- Search product ");
        System.out.println("-5- Payments and expenses");
        System.out.println("-6- Daily Report");
        System.out.println("\n|Insert your choise please|");
        int menuOption = imput.nextInt();
        
        switch(menuOption){
            case 1 :
                System.out.println("\n\nPlease enter the following data");
                System.out.println("Customer name: ");
                String customerName = imput.next();
                System.out.println("Identification card: ");
                int customerID = imput.nextInt();
                System.out.println("Phone: ");
                int customerPhone = imput.nextInt();
                System.out.println("Address: ");
                String customerAdrress = imput.next();
                
                customers = new ArrayList<>();
                customers.add(0,new Customer(customerName, customerID, customerPhone, customerAdrress));
                
                System.out.println("Invoice data -> " + customers);
                        
                break;
            case 2 :
                System.out.println("\nSales made by date and time will be recorded");
                break;
            case 3 :
                System.out.println("\nA new product will be registered with a name and a unit price");
                break;
            case 4 :
                System.out.println("\nSystem to search for the existence and price of any previously registered product");
                break;
            case 5 :
                System.out.println("\nPayments to suppliers and expenses for basic services will be recorded");
                break;
            case 6 :
                System.out.println("\nRecord of daily sales, payments and expenses organized by date and time");
                break;
        }
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PointofSaleSystemDisplay{");
        sb.append('}');
        return sb.toString();
    }
    
}