package com.calc.operation;

import java.math.BigDecimal;

import com.calc.to.CalculatorRequest;
import com.calc.to.CalculatorResponse;

public class Addition implements ICalc {

	@Override
	public CalculatorResponse compute(CalculatorRequest request) {
		BigDecimal result = request.getOperand1().add(request.getOperand2());
		CalculatorResponse resp = new CalculatorResponse(result);
		return resp;
	}

}
