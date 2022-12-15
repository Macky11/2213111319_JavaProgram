import javax.swing.*;
public class LapExample602_2 {
static String[] deptName = {"Accounting","HR","Sales","Innovation"};
static String name = "";
static boolean depWasFound = false;
	public static void main(String[] args) {
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i=0; i<deptName.length; i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				depWasFound = true;
			}
		}
		if(depWasFound) {
			JOptionPane.showMessageDialog(null, "was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, "was not found in the list");
		}

	}

}
