import java.util.Scanner;
 public class gallons{
    public static void main(String[] args) {
    	Scanner mmanga = new Scanner(System.in);
    	System.out.println("Enter number of gallons : ");
    	int gallon = mmanga.nextInt();
    	System.out.println("Enter number of miles : ");
    	double miles = mmanga.nextDouble();
    	System.out.println("Enter number of price : ");
    	double price = mmanga.nextDouble();
    	double far = gallon * miles;
    	double cost = price * 250;


    	System.out.println("The car can travel " +far+ " miles");
    	System.out.println("The cost of the car is " +cost+ " in 250 miles");
   	
   }
 }