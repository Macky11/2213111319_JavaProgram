import java.text.DecimalFormat;
import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Product[] pd = new Product[4];
		
		for(int i=0; i<pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
			System.out.println();
		}
		double sum = 0;
		System.out.println("--------------------------------");
		for(Product _pd : pd) {
			System.out.println("Product ID : "+_pd.getId()+", Total price = "+frm.format(_pd.calculate())+" baht.");
			sum  += _pd.calculate();
		}
		System.out.println("--------------------------------");
		System.out.println("Total price of all product is "+frm.format(sum)+ " baht.");

	}

}
