

import javax.swing.JOptionPane;

	public class LoanDecide {

	private double Loan;
	   private double Mortgage;
	   private double Income;
	   static double sum;
	  
	public double getLoan() {
		return Loan;
	}

	public void setLoan(double loan) {
		Loan = loan;
	}

	public double getMortgage() {
		return Mortgage;
	}

	public void setMortgage(double mortgage) {
		Mortgage = mortgage;
	}

	public double getIncome() {
		return Income;
	}

	public void setIncome(double income) {
		Income = income;
	}


	public double getLoanIncomePercent()	{
		return (Income / Loan) * 100;
	}

 
	public double getMortgageIncomePercent()	{
		return (Income / Mortgage) * 100;
	}
	
	public static void main(String[] args) {
 
	 	LoanDecide check = new LoanDecide();		
 
	 	double number;        // variable to hold numbers
	 	double scores;    // The total area 
	 	String input;        // To hold user input
 
 // Get and store the dimensions of the kitchen.
	 	input = JOptionPane.showInputDialog("What is the " + "Loan?");
	 		number = Double.parseDouble(input);
	 			check.setLoan(number);
 
	 	input = JOptionPane.showInputDialog("What is the " + "Mortgage?");
	 		number = Double.parseDouble(input);
	 			check.setMortgage(number);

 // Get and store the dimensions of the bedroom.
	 	input = JOptionPane.showInputDialog("What is the " + "Income?");
	 		number = Double.parseDouble(input);
	 			check.setIncome(number);
 
	 	sum = check.getLoanIncomePercent() + check.getMortgageIncomePercent();
	 		System.out.println(sum);
	
 
//Calculate the total area of the rooms.
	 	scores = check.getLoanIncomePercent() + check.getMortgageIncomePercent();
 
// Display the total area of the rooms.
	 	if (scores < 35) {
	  JOptionPane.showMessageDialog(null, 
			  "Your loan request has not been approved");
	 	} 
	 	else {
	  JOptionPane.showMessageDialog(null, 
			  "CONGRATS! Your loan request has been approved");
	 		}
 		}
	}
