import java.util.*;
public class LapExample603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int [5];
		for(int i =0; i<number.length; i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Summation of positive number is "+sumOfPos(number));
		

	}
public static int sumOfPos(int[] num) {
	int sum =0;
	for(int _num:num) {
		sum+=_num;
	}
	return sum;
}
}
