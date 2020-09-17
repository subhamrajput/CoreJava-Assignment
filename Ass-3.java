class Ass3{
	public static void main(String args[]){
	int x = 2;
	int y = x*x+3*x-7;	
	System.out.println("value of y =" +y);
	y = x++ + ++x; //(value after assignment(2+4))
	System.out.println("value of y =" +y);
	System.out.println("value of x =" +x);
	int z = x++ - --y - --x + x++ ;
	System.out.println("value of x =" +x);
	System.out.println("value of y =" +y);
	System.out.println("value of z =" +z);

	boolean b1 = true;
	boolean b2 = false;
	boolean z1 = b1 && b2 || !(b1 || b2);
	System.out.println(z1);
	}

}