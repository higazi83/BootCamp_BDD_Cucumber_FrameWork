package com.bdd.qa.utilities;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", ":").replace(":", "_");
		return "ahmad" + timeStamp + "@gmail.com";
}
}
