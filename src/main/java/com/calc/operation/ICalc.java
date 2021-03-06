package com.calc.operation;

import com.calc.exception.CalException;
import com.calc.to.CalculatorRequest;
import com.calc.to.CalculatorResponse;

public interface ICalc {
	public CalculatorResponse compute(CalculatorRequest request) throws CalException;
}
