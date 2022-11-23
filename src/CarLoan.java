//car loan uses same formula as loan but it gives 10% disount on emi everymonth
public class CarLoan extends Loan {
	private String carModel;
	private double emiDiscount;

	public double getEmiDiscount() {
		return emiDiscount;
	}

	public void setEmiDiscount() {
		this.emiDiscount = this.princpalAmount/10;
		//System.out.println(emiDiscount);
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public static void main(String[] args) {
		CarLoan cLoan = new CarLoan();
		cLoan.setName();

		System.out.println("Enter the model of the car:");
		cLoan.setCarModel(cLoan.scanner.next());

		cLoan.setPrincpalAmount();
		cLoan.setTime();
		cLoan.setEmiDiscount();
		
		double emi = cLoan.calculateEmi()-cLoan.getEmiDiscount();

		System.out.println("Dear " + cLoan.getName() + " your EMI would be = " + emi);
	}

}
