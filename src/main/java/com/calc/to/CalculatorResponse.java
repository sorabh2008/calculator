package com.calc.to;

import java.math.BigDecimal;

public class CalculatorResponse {
	private BigDecimal result;
	private String errCode;
	private String errMsg;
	
	public CalculatorResponse(BigDecimal result2){
		this.result = result2;
	}
	
	public CalculatorResponse() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getResult() {
		return result;
	}

	public void setResult(BigDecimal result) {
		this.result = result;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
}
