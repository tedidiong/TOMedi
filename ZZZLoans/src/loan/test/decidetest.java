package loan.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loanT.LoanInfo;
import loanT.LoanStat;

class decidetest {

	LoanInfo l;
	LoanStat check;
	
	@BeforeEach
	void setUp() throws Exception {
	l = new LoanInfo();

	}
	@Test
	void test() {
		
		assertequals(l.getMortgageIncomePercent(), l.getLoanIncomePercent());
		
	}
	private void assertequals(double mortgageIncomePercent, double loanIncomePercent) {
		// TODO Auto-generated method stub
		
	}

}
