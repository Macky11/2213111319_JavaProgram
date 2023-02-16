
public class ATMData extends {

	private String accoutNumber;
	private String password;
	
	public void ATMData(String accoutNumber,String password) {
		this.accoutNumber = accoutNumber;
		this.password = password;
		
	}
	public String getID() {
		return accoutNumber;
	}
	public String getPass() {
		return password;
	}
}
