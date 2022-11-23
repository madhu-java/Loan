//Personal loan uses different formula to caluculate emi than Loan ,
//so used a different logic in calculatedEmi


public class PersonalLoan extends Loan {

	private int age;
    @Override
    public double calculateEmi() {
    	return( princpalAmount+((princpalAmount*time*RATEOFINTEREST)/100))/time;
    }
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		PersonalLoan pLoan = new PersonalLoan();
		
		pLoan.setName();

		System.out.println("Enter your age:");
		pLoan.setAge(pLoan.scanner.nextInt());
		
		pLoan.setPrincpalAmount();
		pLoan.setTime();
		double Emi = pLoan.calculateEmi();
		System.out.println("Dear "+pLoan.getName()+" your EMI would be = "+ Emi);

	}

}
