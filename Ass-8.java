import java.util.Scanner;

class Ass8{
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the principle = ");
	float principle = sc.nextFloat();
	
	System.out.print("Enter the rate = ");
	float rate = sc.nextFloat();

	System.out.print("Enter the time = ");
	float time = sc.nextFloat();

	float SimpleInterest = (principle*rate*time)/100;
	System.out.println("S.I. = " +SimpleInterest);
	


	}

}