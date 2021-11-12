import java.util.Scanner;
public class revenue{
	public static void main(String[] args){
	Scanner me = new Scanner(System.in);
	int cost = 2500;
	System.out.println("Enter number of Participant");
	int part = me.nextInt();
	int rev = cost * part;
	System.out.println("The revenue of the company will genarate for the tour is "+rev);

	}
}