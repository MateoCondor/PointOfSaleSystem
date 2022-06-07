package ec.edu.espe.PointofSaleSystem.view;

import ec.edu.espe.PointofSaleSystem.model.Customer;
import ec.edu.espe.PointofSaleSystem.model.Expense;
import ec.edu.espe.PointofSaleSystem.model.Order;
import ec.edu.espe.PointofSaleSystem.model.Product;
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
        ArrayList<Product> products;
        ArrayList<Order> orders;
        ArrayList<Expense> expenses;
        Scanner imput;
        String customerName;
        String customerSurname;
        String customerAdrress;
        int customerID;
        int customerPhone;
        String productName;
        String productID;
        float productPrice;
        int productQuantity;
        String itemName;
        String itemID;
        String orderDate;
        float paymentAmount;
        int numberOrder;
        int menuOption;
        int returnMenu = 0;
        float cuantityExpense = 0;
        int optionExpense;
        File fileC = new File("./CustomersData.csv");
        File fileP = new File("./ProductsData.csv");
        File fileO = new File("./OrdersData.csv");
        imput = new Scanner(System.in);
        customers = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
        expenses = new ArrayList<>();
        
        do{
            System.out.println("This is the Point of Sale System program");

            System.out.println("\n|====|MENU|====|");
            System.out.println("-1- Create Invoice");
            System.out.println("-2- Sales register");
            System.out.println("-3- Register new product");
            System.out.println("-4- Search product ");
            System.out.println("-5- Payments and expenses");
            System.out.println("-6- Daily Report");
            System.out.println("-0- EXIT ");
            System.out.println("\n|Insert your choise please|");
            menuOption = Integer.parseInt(imput.nextLine());

            switch(menuOption){
                case 0 :
                    returnMenu = 0;
                    break;
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
                    System.out.println("Product name: ");
                    productName = imput.nextLine();
                    System.out.println("Product ID: ");
                    productID = imput.nextLine();
                    System.out.println("Product price: ");
                    productPrice = Float.parseFloat(imput.nextLine());
                    System.out.println("Product Quantity: ");
                    productQuantity = Integer.parseInt(imput.nextLine());
                    
                    customers.add(new Customer(customerName,customerSurname,customerID,customerPhone,customerAdrress));
                    products.add(new Product(productName, productPrice, productID, productQuantity));
                    
                    try (FileWriter fileWc = new FileWriter(fileC,true);
                            FileWriter fileWp = new FileWriter(fileP,true);){
                        fileWc.write(customers.toString()+"\n");
                        fileWp.write(products.toString()+"\n");
                    }catch(Exception e){
                        System.out.println("An error has occurred");
                    }
                    
                    System.out.println("Customer data -> " + customers);
                    System.out.println("Product data -> " + products);

                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
                    break;
                case 2 :
                    System.out.println("Enter de order data");
                    System.out.println("\nName of the item sold: ");
                    itemName = imput.nextLine();
                    System.out.println("ID of the item sold: ");
                    itemID = imput.nextLine();
                    System.out.println("Number of the order: ");
                    numberOrder = Integer.parseInt(imput.nextLine());
                    System.out.println("Amount to pay: ");
                    paymentAmount = Float.parseFloat(imput.nextLine());
                    System.out.println("Date of the order: ");
                    orderDate = imput.nextLine();
                    
                    orders.add(new Order(itemName, itemID, numberOrder, paymentAmount, orderDate));
                    
                    try (FileWriter fileWo = new FileWriter(fileO,true);){
                        fileWo.write(orders.toString()+"\n");
                    }catch(Exception e){
                        System.out.println("An error has occurred");
                    }
                    
                    System.out.println("Order data -> " + orders);
                    
                    System.out.println("Want to return to the main menu? \n-1- Yes \n-0- No,Exit.");
                    returnMenu = Integer.parseInt(imput.nextLine());
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
                    
                    
                    System.out.println("Enter type of Expense to pay");
                    System.out.println("\n1. Electricity Bill ");
                    System.out.println("\n2. Water Bill  ");
                    System.out.println("\n3. Rent Bill ");
                    System.out.println("\n4. Gas Bill ");
                    optionExpense = imput.nextInt();
                    
                    if(optionExpense == 1){
                    System.out.println("Enter Cuantity of Electricity: ");
                    cuantityExpense = Float.parseFloat(imput.nextLine());
                    expenses.add(new Expense(cuantityExpense,0,0,0));
                    }
                    else{
                    if(optionExpense == 2){
                    System.out.println("Enter Cuantity of Water: ");
                    cuantityExpense = Float.parseFloat(imput.nextLine());
                    expenses.add(new Expense(0,cuantityExpense,0,0));
                    }
                    else{
                    if(optionExpense == 3){
                    System.out.println("Enter Cuantity of Rent: ");
                    cuantityExpense = Float.parseFloat(imput.nextLine());
                    expenses.add(new Expense(0,0,cuantityExpense,0));
                    }
                    else{
                    if(optionExpense == 4){
                    System.out.println("Enter Cuantity of Gas: ");
                    cuantityExpense = Float.parseFloat(imput.nextLine());
                    expenses.add(new Expense(0,0,0,cuantityExpense));
                    }
                    }
                    }
                         
                    }
                                         
                    try (FileWriter fileWo = new FileWriter(fileO,true);){
                        fileWo.write(orders.toString()+"\n");
                    }catch(Exception e){
                        System.out.println("An error has occurred");
                    }
                    
                    System.out.println("Expense Data -> " + expenses);
                    
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