package com.calc.tester;

import com.calc.impl.CalculatorImpl;
import com.calc.to.CalculatorResponse;

public class Tester {
	public static void main(String[] args) {
		CalculatorResponse response = new CalculatorImpl().calculate(args);
		if (response.getErrCode() == null) {
			System.out.println(response.getResult());
		} else {
			System.out.println(response.getErrCode() + ": " + response.getErrMsg());
		}
	}
}
