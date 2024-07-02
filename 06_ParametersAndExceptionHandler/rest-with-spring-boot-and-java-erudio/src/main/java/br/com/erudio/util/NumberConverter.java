package br.com.erudio.util;

public class NumberConverter {
	
	public static Double toDouble(String strNumber) {
		if (strNumber == null) 	return 2D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))	return Double.parseDouble(number);
		return 3D;

	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null)	return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
