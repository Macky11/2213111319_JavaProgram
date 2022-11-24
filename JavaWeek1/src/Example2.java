import javax.swing.JOptionPane;
import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final float BUFFETPRICE = 299;
		int numberofCustomer = 5;
		float totlePrice = BUFFETPRICE*numberofCustomer;
		System.out.println("Buffet of "+numberofCustomer+" Customer is "+
		frm.format(totlePrice));
		float serviceCharge = totlePrice+(totlePrice*3/100);
		System.out.println("Add Service Charg 3% is "
		+frm.format(serviceCharge));
	
		JOptionPane.showMessageDialog(null, 
				"Buffet of "+numberofCustomer+
				"Customer is "+totlePrice+
				"\nAdd Service Charg 3% is "+serviceCharge);

	}

}
