package controlstatement;

import java.util.Scanner;

public class DiscountFinal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the purchase amount:");
		double amount=scan.nextDouble();
		double discount=0;
		
		if(amount<500) {
			discount=0;
		}else if(amount>=500 && amount<=1000) {
			discount=amount*0.10;
		}else {
			discount=amount*0.20;
			double finalAmount=amount-discount;
			
			System.out.println("Discount applied:"+discount);
			System.out.println("Final payable amount:"+finalAmount);
			scan.close();
		}
	}

}
