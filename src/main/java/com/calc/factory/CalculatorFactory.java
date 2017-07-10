package com.calc.factory;

import com.calc.constants.CalcConstants;
import com.calc.constants.ErrorConstants;
import com.calc.exception.CalException;
import com.calc.operation.Addition;
import com.calc.operation.Division;
import com.calc.operation.ICalc;
import com.calc.operation.Multiplication;
import com.calc.operation.Subtraction;

public class CalculatorFactory {
	public static ICalc getCalculator(String operator) throws CalException {
		switch (operator) {
		case CalcConstants.ADD:
			return new Addition();
		case CalcConstants.SUBTRACT:
			return new Subtraction();
		case CalcConstants.MULTIPLY:
			return new Multiplication();
		case CalcConstants.DIVIDE:
			return new Division();
		default:
			throw new CalException(ErrorConstants.ERRMSG_INVALID_OPERATOR, ErrorConstants.ERR_INVALID_OPERATOR);
		}
	}
}
