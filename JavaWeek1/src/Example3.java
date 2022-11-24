import java.util.*;
import java.text.*;

public class Example3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
																																																																																																																																																																															int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");		
		float pricePerUnit= scan.nextFloat();
		System.out.println();
		float totalPrice = pricePerUnit*productUnit;
		System.out.println("Total price is : "+frm.format(totalPrice));
		float pricewithVat= totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(pricewithVat));	
	}
}