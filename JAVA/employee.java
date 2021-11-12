import java.util.Scanner;
public class employee{
	public static void main(String[] args){
	Scanner abidal = new Scanner(System.in);
	System.out.println("Enter Performance Level : ");
	double perfomance = abidal.nextDouble();
	System.out.println("Enter Base Salary : ");
	double base = abidal.nextDouble();
	double bonus = 0.03 * base;
	double salary = bonus + base;
	if (perfomance >= 90){
		System.out.println("Salary is "+salary);
	}
	else{
		System.out.println("Salary is "+base);
	}
	}
}