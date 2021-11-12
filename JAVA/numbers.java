import java.util.Scanner;
public class numbers{
	public static void main(String[] args){
	Scanner abidal = new Scanner(System.in);
	System.out.println("Please enter First number : ");
	int f_number = abidal.nextInt();
	System.out.println("Please enter Second number : ");
	int s_number = abidal.nextInt();
	int hcf,lcm, a , b, c;
	a = f_number;
	b = s_number;
	while(b != 0){
		c = b;
		b = a%b;
        a = c;
	}
	hcf = a;
	lcm = (f_number * s_number)/hcf;

	System.out.println("The HCF of input numbers is : "+hcf);
	System.out.println("The LCM of input numbers is : "+lcm);
	}
}