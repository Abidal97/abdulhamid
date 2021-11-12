import java.util.Scanner;
public class wordGame{
	public static void main(String[] args){
		Scanner abidal = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = abidal.nextLine();
		System.out.println("Enter your age : ");
		int age = abidal.nextInt();
		System.out.println("Enter your  City");
		String city = abidal.nextLine();
		System.out.println("Enter Your College : ");
		String college = abidal.nextLine();
		System.out.println("Enter Your profession : ");
		String profession = abidal.nextLine();
		System.out.println("Enter type OF your Animal : ");
		String type = abidal.nextLine();
		System.out.println("Enter Pet's name : ");
		String animal = abidal.nextLine();
 System.out.println("There once was a person named "+name+" who lived in "
 	+city+" At the age of "+age+"," +name+
  " went to college at "+college+"." +name+
  " graduated and went to work as a "+profession+
  ". Then,"+name+ " adopted a(n)"
  +type+ " named "+animal+
  " They both lived happily ever after!");
	}
}