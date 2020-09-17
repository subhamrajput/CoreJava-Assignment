import java.util.Scanner;
class downcast{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enetr 2  byte value");
	byte x = sc.nextByte();
	byte y = sc.nextByte();
	int z=x+y; //Range was larger than byte
	byte a=(byte)z;
	System.out.println("downcasting="+a);
	}
}
