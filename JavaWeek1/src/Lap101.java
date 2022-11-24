import java.text.DecimalFormat;
import java.util.*;
public class Lap101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");		
		float pricePerUnit= scan.nextFloat();
		System.out.println("-----------------------------------------");	
		float totalPrice = pricePerUnit*productUnit;
		System.out.println("Total price is : "+frm.format(totalPrice));
		System.out.println("-----------------------------------------");
		System.out.print("How many discount (%) : ");		
		int discount= scan.nextInt();
		System.out.println("-----------------------------------------");
		float pricewithDiscount= totalPrice-(totalPrice*discount/100);
		float discountPrice = totalPrice - pricewithDiscount;
		System.out.println("Discount from "+discount+"%\t"+frm.format(discountPrice)+" baht");
		float lastPrice = totalPrice - discountPrice;
		System.out.println("Amount to be paid\t"+frm.format(lastPrice)+" baht");

	}

}
