package controller;

import java.util.HashMap;

public class LoginLogic {

	public static boolean checkLogin(String enterLogin, String enterPass) {
		HashMap<String, String> logsAndPasswds = new HashMap<String, String>();


		logsAndPasswds.put("admin", "Qwe123");
		logsAndPasswds.put("us", "1");

		/*
		 * HandlerSystemUsers hsu = new HandlerSystemUsers(); HashMap<String, String>
		 * logsAndPasswds = hsu.getHashMapLoginAndPasswd();
		 */



		return logsAndPasswds.containsKey(enterLogin) && logsAndPasswds.get(enterLogin).equals(enterPass);
	}

}
