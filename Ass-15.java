import java.util.Scanner ;
class Ass15 {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character = ");
	char y = sc.next().charAt(0);
	int age = sc.nextInt();

	if(y == 'M' && age > 22)
	
		System.out.println("Eligible");

	else if (y == 'F' && age > 19)

		System.out.println("Eligible");

	else
		System.out.println("Not Eligible");
	}

}

	 

	
	
	
	

