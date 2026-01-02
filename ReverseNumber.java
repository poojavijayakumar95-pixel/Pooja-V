package controlstatement;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int num=876, rev=0, lastDigit;
		
		while(num>0) {
			lastDigit=num%10;
			rev=rev*10+lastDigit;
			num=num/10;
		}
		System.out.println(rev);
		
		
		}
	}


