package com.calc.to;

import java.math.BigDecimal;

public class CalculatorRequest {
	private String operator;
	private BigDecimal operand1, operand2;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public BigDecimal getOperand1() {
		return operand1;
	}
	public void setOperand1(BigDecimal operand1) {
		this.operand1 = operand1;
	}
	public BigDecimal getOperand2() {
		return operand2;
	}
	public void setOperand2(BigDecimal operand2) {
		this.operand2 = operand2;
	}
	
	
}
