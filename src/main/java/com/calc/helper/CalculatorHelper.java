package com.calc.helper;

import java.math.BigDecimal;

import com.calc.to.CalculatorRequest;

public class CalculatorHelper {
	public static CalculatorRequest constructRequest(String args[]) {
		BigDecimal op1 = BigDecimal.valueOf(Double.parseDouble(args[0]));
		BigDecimal op2 = BigDecimal.valueOf(Double.parseDouble(args[2]));
		String operator = args[1];
		CalculatorRequest request = new CalculatorRequest();
		request.setOperand1(op1);
		request.setOperand2(op2);
		request.setOperator(operator);
		return request;
	}
}
