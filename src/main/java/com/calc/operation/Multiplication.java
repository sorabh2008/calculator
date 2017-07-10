package com.calc.operation;

import java.math.BigDecimal;

import com.calc.to.CalculatorRequest;
import com.calc.to.CalculatorResponse;

public class Multiplication implements ICalc{

	@Override
	public CalculatorResponse compute(CalculatorRequest request) {
		BigDecimal result = request.getOperand1().multiply(request.getOperand2());
		CalculatorResponse resp = new CalculatorResponse(result);
		return resp;
	}

}
