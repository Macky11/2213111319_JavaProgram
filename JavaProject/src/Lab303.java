import javax.swing.*;
import java.text.*;
public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		double balance = Math.random()*1000000;
		int withDraw = Integer.parseInt
				(JOptionPane.showInputDialog("Your balance:"
		+frm.format(balance)+"\nInput money to withdraw:"));
		if (withDraw > 20000) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more than 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withDraw > balance) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withDraw%100 !=0) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw "+withDraw%100+"baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
		int bank1000 = withDraw/1000;
		int baLance1 = withDraw%1000;
		int bank500 = baLance1/500;
		int baLance2 = baLance1%500;
		int bank100 = baLance2/100;
		int baLance3 = baLance2%100;
		
		JOptionPane.showMessageDialog(null,"You withdraw"+withDraw+
				"baht."+"\n1,000="+bank1000+"\n500="+bank500+"\n100="+bank100);
		}
	
	}

}
