package com.calc.constants;

public class ErrorConstants {
	public static final String ERR_DIVIDE_BY_ZERO = "CAL_E_001";
	public static final String ERRMSG_DIVIDE_BY_ZERO = "Cannot Divide by Zero";

	public static final String ERR_INVALID_OPERATOR = "CAL_E_002";
	public static final String ERRMSG_INVALID_OPERATOR = "Invalid operator. Allowed ( +, -, *, / )";

	public static final String ERR_INVALID_EXPRESSION = "CAL_E_003";
	public static final String ERRMSG_INVALID_EXPRESSION = "Invalid expression. Valid Eg. 4 + 4 (include space also)";

	public static final String ERR_INVALID_OPERANDS = "CAL_E_004";
	public static final String ERRMSG_INVALID_OPERANDS = "Please provide decimal/integer inputs only";

	public static final String ERR_INVALID_ARGUMENTS = "CAL_E_005";
	public static final String ERRMSG_INVALID_ARGUMENTS = "Invalid Arguments. Valid Eg. 4 + 4 (include space also)";

	public static final String ERR_INSUFFICIENT_ARGUMENTS = "CAL_E_006";
	public static final String ERRMSG_INSUFFICIENT_ARGUMENTS = "Please enter atleast 3 arguments";

	public static final String ERR_EXCESS_OPERANDS_LENGTH = "CAL_E_007";
	public static final String ERRMSG_EXCESS_OPERANDS_LENGTH = "Length of operands exceeded. Max allowed is 10 (with decimal).";

	public static final String ERR_EXTRA_ARGUMENTS = "CAL_E_008";
	public static final String ERRMSG_EXTRA_ARGUMENTS = "Please enter only 3 arguments";
	
	public static final String ERR_ASTERISK_WILDCARD = "CAL_E_009";
	public static final String ERRMSG_ASTERISK_WILDCARD = "Invalid arguments. Try using quotes with * for multiplication. Eg. 4 \"*\" 4";
}
