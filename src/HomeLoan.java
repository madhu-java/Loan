//home loan uses same formula as loan to calculate emi
public class HomeLoan extends Loan {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		HomeLoan hLoan = new HomeLoan();
		hLoan.setName();
		System.out.println("Enter the City where you are buying a house:");
		hLoan.setCity(hLoan.scanner.next());
		
		hLoan.setPrincpalAmount();
		hLoan.setTime();
		double emi = hLoan.calculateEmi();
		System.out.println("Dear "+hLoan.getName()+" your EMI would be = "+ emi);
	}

}
