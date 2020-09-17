import java.util.Scanner;

class Ass12 {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Basic Salary");
	int BS = sc.nextInt();
	double HRA ;
	double DA ;
	if(BS < 10000) {
		 	HRA = 0.1*BS;
		 	DA = 0.9*BS;
			}
	else {
	      HRA = 2000;
	      DA = .98*BS;
	     }

	double GS = BS+DA+HRA;
	System.out.println(GS);
	}



}