import java.util.Scanner;
public class eggs{
	public static void main(String[] args) {
		Scanner mmanga = new Scanner(System.in);

		System.out.println(" How many eggs you have.. :");
		int eggs = mmanga.nextInt();

		int dozen = eggs / 12;
		int left = eggs % 12;
		int gross = eggs / 144;

		System.out.println("Your number of eggs is "+gross+" gross "+dozen+" dozens, and "+left+" left over");
	}
}