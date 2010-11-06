package it.rambow.fhb.junit;

public class ParserTools {
	public static boolean isEmail(String mailAddress) {
		return mailAddress.matches("[0-9a-z]{2,}@[0-9a-z]*\\.[a-z]{2,3}");
	}
}
