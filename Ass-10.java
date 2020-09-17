import java.util.Scanner ;
class Ass10 {
	public static void main( String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temperature = ");
	float F = sc.nextFloat();
	float C= (float) (5*(F-32)/9);
	System.out.printf("Temperature in Celsius = %.03f " ,C); 
	}
	
}