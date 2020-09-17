import java.util.Scanner ;
	class Ass13 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the first number = ");
	int i = sc.nextInt();
	System.out.print("enter the second number = ");
	int j = sc.nextInt();
	System.out.print("enter the three number = ");
	int k = sc.nextInt();
	
	if(i > j && i > k) {
			
			System.out.println("i is greater");
			}

	else if (j>k){
		
			System.out.println("j is greater");
		     }
	
	else 
		System.out.println("k is greater"); 
	
	}
	
	

}