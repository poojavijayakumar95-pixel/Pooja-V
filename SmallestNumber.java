package controlstatement;

public class SmallestNumber {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=25;
		
		if(a<=b && a<=c ) {
			System.out.println("The smallest number is:"+a);
		}
		if(b<=c && b<=a) {
			System.out.println("The smallest number is:"+b);
		}else {
			System.out.println("The smallest number is:]]"+c);
		}
	}

}
