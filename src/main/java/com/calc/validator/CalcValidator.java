package com.calc.validator;

import com.calc.constants.CalcConstants;
import com.calc.constants.ErrorConstants;
import com.calc.exception.CalException;

public class CalcValidator {
	public static boolean isValidInput(String args[]) throws CalException {

		if (args.length < CalcConstants.MAXLEN_ARGUMENTS) {
			throw new CalException(ErrorConstants.ERRMSG_INSUFFICIENT_ARGUMENTS,
					ErrorConstants.ERR_INSUFFICIENT_ARGUMENTS);
		} else if (args.length > CalcConstants.MAXLEN_ARGUMENTS) {
			for (String string : args) {
				if (string.equalsIgnoreCase(CalcConstants.APPNAME)
						|| string.equalsIgnoreCase(CalcConstants.STR_CLASSPATH)) {
					throw new CalException(ErrorConstants.ERRMSG_ASTERISK_WILDCARD,
							ErrorConstants.ERR_ASTERISK_WILDCARD);
				}
			}
			throw new CalException(ErrorConstants.ERRMSG_EXTRA_ARGUMENTS, ErrorConstants.ERR_EXTRA_ARGUMENTS);
		}

		try {
			Double.parseDouble(args[0]);
			Double.parseDouble(args[2]);
			String operator = args[1];

			if (operator.equalsIgnoreCase(CalcConstants.ADD) && operator.equalsIgnoreCase(CalcConstants.SUBTRACT)
					&& operator.equalsIgnoreCase(CalcConstants.MULTIPLY)
					&& operator.equalsIgnoreCase(CalcConstants.DIVIDE)) {
				throw new CalException(ErrorConstants.ERRMSG_INVALID_OPERATOR, ErrorConstants.ERR_INVALID_OPERATOR);
			} else if (args[0].length() > CalcConstants.MAXLEN_OPERANDS
					|| args[2].length() > CalcConstants.MAXLEN_OPERANDS) {
				throw new CalException(ErrorConstants.ERRMSG_EXCESS_OPERANDS_LENGTH,
						ErrorConstants.ERR_EXCESS_OPERANDS_LENGTH);
			}
			return true;
		} catch (NumberFormatException nfe) {
			throw new CalException(ErrorConstants.ERRMSG_INVALID_OPERANDS, ErrorConstants.ERR_INVALID_OPERANDS);
		}

	}
}
