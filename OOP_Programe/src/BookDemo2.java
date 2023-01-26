import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int ConfirmPage = JOptionPane.showConfirmDialog(null,"is hte page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		Book1 Book1 = new Book1(title,new Author1(name,email),page);
		if(ConfirmPage == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
			Book1.setPage(page);
		}
		JOptionPane.showMessageDialog(null,"BookTitle"+page+"\nAuthor name :"+Book1.getAuthor().getName()+"\n Author e-mail:"+Book1.getAuthor().getEmail());
		
		
		
		

		
	}

}
