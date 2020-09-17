import java.util.Scanner;
    class Ass9{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Days : ");
            int d = sc.nextInt();
            int year = d/365;       // 740/365 =2
                int rem = d%365;    // 740%365 = 10
                int month = rem/30;	// 10/30 = 0
                int days = rem%30;	//10%30 = 10
            
            System.out.println(year +" year "+month+" month "+days+" days ");
        }
    }
