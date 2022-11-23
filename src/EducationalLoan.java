//Education loan uses diffrent formula than Loan to caluculate emi, 
//so we need to override the calculateemi and write diffrent formula and also
//it give seducation discount beased on the principle amount
import java.util.Scanner;
public class EducationalLoan extends Loan {
	
	private String education;
	final private double RATEOFINTEREST= 0.1;
	private double loanDiscount;

    
		public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	//specialised method
	private double calculateLoanDiscount() {
		return loanDiscount = princpalAmount/4;
	}
	//overridden method
	@Override
	public double calculateEmi() {
		calculateLoanDiscount();
		return( princpalAmount-loanDiscount+((princpalAmount*time*RATEOFINTEREST)/100))/time;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EducationalLoan eLoan = new EducationalLoan();
		eLoan.setName();
		
		System.out.println("Enter your education:");
		eLoan.setEducation(scanner.nextLine());
		
		eLoan.setPrincpalAmount();
		eLoan.setTime();
		
		double Emi = eLoan.calculateEmi();
		System.out.println("Dear "+eLoan.getName()+" your EMI would be = "+ Emi);
	}

}
