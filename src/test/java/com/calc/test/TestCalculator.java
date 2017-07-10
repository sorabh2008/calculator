package com.calc.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.calc.constants.ErrorConstants;
import com.calc.impl.Calculator;
import com.calc.impl.CalculatorImpl;
import com.calc.to.CalculatorResponse;

public class TestCalculator {
	private Calculator impl;

	public TestCalculator() {
		impl = new CalculatorImpl();
	}

	@Test
	public void testAddition() {
		String args[] = { "10", "+", "20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(30)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testAddition1() {
		String args[] = { "-10.9", "+", "-20.05" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-30.95)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testAddition2() {
		String args[] = { "10", "+", "-20.9" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-10.9)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}

	@Test
	public void testSubtraction1() {
		String args[] = { "-10", "-", "10" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-20)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testSubtraction2() {
		String args[] = { "10", "-", "-10" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(20)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testSubtraction3() {
		String args[] = { "-10.5", "-", "10.12" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-20.62)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}

	@Test
	public void testSubtraction4() {
		String args[] = { "10.15", "-", "9.3" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0.85)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}

	@Test
	public void testMultiplication() {
		String args[] = { "10", "*", "20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(200)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testMultiplication1() {
		String args[] = { "10.01", "*", "200" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(2002)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testMultiplication2() {
		String args[] = { "-1.32", "*", "3.4" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-4.488)));
		CalculatorResponse actualOutput = impl.calculate(args);
		
		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}

	@Test
	public void testDivision() {
		String args[] = { "100", "/", "20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(5)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testDivision1() {
		String args[] = { "15", "/", "20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0.75)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testDivision2() {
		String args[] = { "15", "/", "-20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(-0.75)));
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}
	
	@Test
	public void testDivision3() {
		String args[] = { "22", "/", "7" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(3.142858)));
		CalculatorResponse actualOutput = impl.calculate(args);
		
		Assert.assertTrue(expectedOutput.getResult().doubleValue() == actualOutput.getResult().doubleValue());
	}

	@Test
	public void testDivisionException() {
		String args[] = { "100", "/", "0" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_DIVIDE_BY_ZERO);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}

	@Test
	public void testOperatorException() {
		String args[] = { "10", "=", "20" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_INVALID_OPERATOR);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}

	@Test
	public void testInvalidOperands() {
		String args[] = { "S", "+", "3" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_INVALID_OPERANDS);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}

	@Test
	public void testInsufficientArguments() {
		String args[] = { "10", "+" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_INSUFFICIENT_ARGUMENTS);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}

	@Test
	public void testExcessOperandsLength() {
		String args[] = { "19877266364", "+", "3" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_EXCESS_OPERANDS_LENGTH);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}
	
	@Test
	public void testExtraArguments() {
		String args[] = { "198", "+", "3", "77" };

		CalculatorResponse expectedOutput = new CalculatorResponse(BigDecimal.valueOf(new Double(0)));
		expectedOutput.setErrCode(ErrorConstants.ERR_EXTRA_ARGUMENTS);
		CalculatorResponse actualOutput = impl.calculate(args);

		Assert.assertEquals(expectedOutput.getErrCode(), actualOutput.getErrCode());
	}

}
