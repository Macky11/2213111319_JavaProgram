import java.util.*;
public class Lap203 {

	public static void main(String[] args) {
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input two integers(a b) :");
		int oneInteger = scan.nextInt();
		int twoInteger = scan.nextInt();
		int sum = oneInteger + twoInteger;
		System.out.println("Sum of two integers:"+sum);	
		while (sum != 0) {
			sum/=10;
			i++;
		}
		System.out.println("Digit number of sum of said two integer:"+i);
		
	}

}
