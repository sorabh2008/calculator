package com.calc.impl;

import com.calc.exception.CalException;
import com.calc.helper.CalculatorHelper;
import com.calc.manager.CalculatorManager;
import com.calc.to.CalculatorRequest;
import com.calc.to.CalculatorResponse;
import com.calc.validator.CalcValidator;

public class CalculatorImpl implements Calculator {
	private CalculatorManager manager;

	public CalculatorImpl() {
		manager = new CalculatorManager();
	}

	@Override
	public CalculatorResponse calculate(String args[]) {
		CalculatorResponse response = null;
		try {
			if (CalcValidator.isValidInput(args)) {
				CalculatorRequest request = CalculatorHelper.constructRequest(args);
				response = this.manager.calculate(request);
			}
		} catch (CalException e) {
			response = new CalculatorResponse();
			response.setErrCode(e.getErrorCode());
			response.setErrMsg(e.getMessage());
		}
		return response;
	}
}
