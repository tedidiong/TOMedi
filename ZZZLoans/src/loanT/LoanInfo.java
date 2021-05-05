package loanT;

public class LoanInfo {

	 private double Loan;
	   private double Mortgages;
	   		private double Income;
	   
   public double getLoanIncomePercent()
	   {
	      return (Income / Loan) * 100;
	   }
	   
	   public double getMortgageIncomePercent()
	   {
	      return (Income / Mortgages) * 100;
	   }

	public double getLoan() {
		return Loan;
	}

	public void setLoan(double loan) {
		Loan = loan;
	}  

	public double getMortgages() {
		return Mortgages;
	}

	public void setMortgages(double mortgages) {
		Mortgages = mortgages;
	}

	public double getIncome() {
		return Income;
	}

	public void setIncome(double income) {
		Income = income;
	}
}
