package com.calc.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.calc.constants.CalcConstants;
import com.calc.constants.ErrorConstants;
import com.calc.exception.CalException;
import com.calc.to.CalculatorRequest;
import com.calc.to.CalculatorResponse;

public class Division implements ICalc{

	@Override
	public CalculatorResponse compute(CalculatorRequest request) throws CalException {
		BigDecimal divisor=request.getOperand2(), dividend = request.getOperand1();
		BigDecimal result=BigDecimal.valueOf(new Double(CalcConstants.ZERO));
		if(divisor.doubleValue() != CalcConstants.ZERO){
            result = dividend.divide(divisor, CalcConstants.MAXLEN_DECIMAL, RoundingMode.UP);
        }else{
            throw new CalException(ErrorConstants.ERRMSG_DIVIDE_BY_ZERO, ErrorConstants.ERR_DIVIDE_BY_ZERO);
        }
		CalculatorResponse resp = new CalculatorResponse(result);
		return resp;
	}

}
