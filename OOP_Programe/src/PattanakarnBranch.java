
public class PattanakarnBranch extends Product1 {

	public int payUnit() {
		return super.getUnit()/2;
	}
	private int freeUnit() {
		return super.getUnit()-this.payUnit();
	}
	
	
	@Override
	public String toString() {
		return "You buy "+this.payUnit()+" units, get free "+this.freeUnit()+
		" unit ("+this.getTotalprice()+")";
	}
}
