package pkgUT;


import org.apache.poi.ss.formula.functions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class TestLoan {

	@Test
	public void TestLoan() {
		
		double Loan;
		double r = 0.07 / 12;
		double n = 20 * 12;
		double p = 150000;
		double f = 0;
		boolean t = false;
		Loan = Math.abs(FinanceLib.loan(r, n, p, f, t));		
		double LoanExpected = 1162.95;		
		assertEquals(LoanExpected, Loan, 0.01);
	}

}

 

