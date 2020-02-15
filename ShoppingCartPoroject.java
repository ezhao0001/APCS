import java.util.Scanner;
public class ShoppingCartPoroject{
  
  static int totalItems;
  static String [] items;
  static double [] prices;
  static int [] quantity;
  
  public static void main (String [] args){
    System.out.println("Welcome to my store");
   totalItems = getItemQuantity("How many items do you wish to buy?");
   items = new String [totalItems];
   prices = new double [totalItems];
   quantity = new int [totalItems];
   
   int count = 0;
   while (count <totalItems){
      getItemDetails(count);
      count++;
   }
   displayCart();
  }
  
  private static void getItemDetails(int index){
    items [index] = getItemName("What is the name of item #" + (index+1) + "?");
    prices [index] = getItemPrice("What is the price of item #" + (index+1) + "?");
    quantity [index] = getItemQuantity("How many of item #" + (index+1) + " do you wish to buy?");
  }
  
  private static void displayCart(){
    System.out.println("##############################################");
    System.out.println("Shopping Cart Details....");
    System.out.println("##############################################");
    
    for (int i = 0; i< totalItems; i++){
      showLineItem(i);
  }
    System.out.println("##########################################");
    double subtotal = calculateSubtotal();
    double tax = subtotal*0.0875;
    double total = subtotal + tax;
    
    System.out.println("Subtotal: " + subtotal);
    System.out.println("Sales tax @ 8.75%: " + tax);
    System.out.println("Total Cost: " + total);
    System.out.println("Average Cost of All Items: " + subtotal/getTotalItems());
    System.out.println("Thanks for shopping with us! Please come again!");
  }
  
  private static double calculateSubtotal(){
    double total = 0;
    
    for (int i = 0; i<totalItems; i++){
      total += prices [i] * quantity[i];
    }
    return total;
  }
  
    
  private static void showLineItem(int index){
    String quantityText = quantity [index] + "\t--\t";
    String itemText = items[index] + "............";
    String priceText = prices[index] + " = " + prices [index]*quantity [index];
   
    System.out.println(quantityText + itemText + priceText);
    }
  
  private static int getTotalItems(){
    int sum = 0;
    for (int item : quantity)
      sum += item;
    
    return sum;
  }
  
  private static double getItemPrice (String m){
    System.out.println(m);
    Scanner scan = new Scanner (System.in);
    return scan.nextDouble();
  }
                                           
  private static String getItemName (String m){
    System.out.println(m); 
    Scanner scan = new Scanner (System.in );
    return scan.nextLine();
  }
 
  private static int getItemQuantity (String m){
    System.out.println(m);
    Scanner scan = new Scanner (System.in);
    return scan.nextInt();
  }
  }
                                                 
                                               
                                           
    

