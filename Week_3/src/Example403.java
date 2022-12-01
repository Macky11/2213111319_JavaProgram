import java.util.*;

import javax.swing.JOptionPane;
public class Example403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		/*String sentence = JOptionPane.showInputDialog("Input a sentence : ");*/
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again:");
			sentence = scan.nextLine();			
		}
		System.out.println();
		int spaceofword = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofword++;
			}
		}
		System.out.println("This sentence has "+spaceofword+" spacbar.");
		System.out.println("This sentence has "+(spaceofword+1)+" words.");

	}

}
