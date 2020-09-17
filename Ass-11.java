import java.util.Scanner ;

class Ass11{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number");
		int i = sc.nextInt();
		System.out.print("Enter the first number");
		int j = sc.nextInt();
		
		
		i = i + j;
		j = i - j;
		i = i - j;
		
		System.out.println("After Swapping =" +i);
		System.out.println("After Swapping =" +j);
		



		}
}