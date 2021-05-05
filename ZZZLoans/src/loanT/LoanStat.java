package loanT;
import javax.swing.JOptionPane;

public class LoanStat {

   public static void main(String[] args)
   {
      double number;       // variable to hold numbers
      		double scores;    // this is to hold calculated statistics
      				String input;        // the user input is held here
      
      // This is where we create the loan information objects.
      LoanInfo check = new LoanInfo();
     
      
      // here is where we get and put requested loan amount.
      input = JOptionPane.showInputDialog("Enter requested Loan Amount?");
      	number = Double.parseDouble(input);
      		check.setLoan(number);
      
      // here is where we get and store the total remaining amount of all mortgages.		
      input = JOptionPane.showInputDialog("Enter current Amount of Mortgages?");
      	number = Double.parseDouble(input);
      		check.setMortgages(number);

      // here is where we get the total amount of all annual income.
      input = JOptionPane.showInputDialog("Enter Total Annual Income?");
      	number = Double.parseDouble(input);
      		check.setIncome(number);
      

    
      // this is where we sum up loanIncome percent and mortgageIncome percent
      scores = check.getLoanIncomePercent() + check.getMortgageIncomePercent();
      
      // statistics is where the score is compared against the criteria (35).
      if (scores > 40) {
    	  JOptionPane.showMessageDialog (null, "SORRY! Your loan request has not been denied");
    } else {
    	  JOptionPane.showMessageDialog (null, "CONGRATS! Your loan request has been approved");
    	  
   }  

      System.exit(0);
   }

}
