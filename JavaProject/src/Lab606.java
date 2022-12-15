import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int index  =Integer.parseInt(JOptionPane.showInputDialog("Input index of array "));
		while (checkIndex(index, nums)){
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again"));
			
		}
		JOptionPane.showMessageDialog(null, "Current data, num["+ index +"] is " +currentData(index, nums)
		+"\n"+(((index-1) > 0)? "Previous data, nums["+(index-1)+prevData(index, nums):"No previous data")
		+"\n"+(((index+1) < nums.length)?"Next data, nums["+(index+1)+"] is "+nextData(index, nums):"No next data"));

	}
public static boolean checkIndex(int index, int[] num) {
	return (index < 0 || index > (num.length - 1))? true: false;
}
public static int currentData(int index, int[] num) {
	return num[index];
}
public static int prevData(int index, int[] num) {
	return num[index-1];
}
public static int nextData(int index, int[] num) {
	return num[index+1];
}
}
