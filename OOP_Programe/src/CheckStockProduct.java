import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int product = scan.nextInt();
		Product[] pd = new Product[product];
		
		for(int i=0; i<pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());			
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------");
		
		for(Product _pd : pd) {
			if(_pd.setStatus(_pd.getUnit())=="LOW") {
				System.out.println(">>"+_pd.getId()+" has "+_pd.getUnit()+" unit");
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------");
		
		for(Product _pd : pd) {
			if(_pd.setStatus(_pd.getUnit())=="NORMAL") {
				System.out.println(">>"+_pd.getId()+" has "+_pd.getUnit()+" unit");
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------");
		
		for(Product _pd : pd) {
			if(_pd.setStatus(_pd.getUnit())=="HIGH") {
				System.out.println(">>"+_pd.getId()+" has "+_pd.getUnit()+" unit");
			}
		}




	}

}
