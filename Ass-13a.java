import java.util.Scanner ;
class Ass13a {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int i = sc.nextInt();
	int j = sc.nextInt();
	int k = sc.nextInt();

	String s =(i > j && i > k)? "i is greater": j>k ? "J is greater" : "K is greater";
System.out.println(s);
	}




}