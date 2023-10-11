package controller;

import java.util.HashMap;

import handlers.HandlerSystemUsers;

public class LoginLogic {

	public static boolean checkLogin(String enterLogin, String enterPass) {
		HashMap<String, String> logsAndPasswds = new HashMap<String, String>();
		/*
		 * HandlerSystemUsers hsu = new HandlerSystemUsers(); HashMap<String, String>
		 * logsAndPasswds = hsu.getHashMapLoginAndPasswd();
		 */
		logsAndPasswds.put("admin", "Qwe123");
		logsAndPasswds.put("user", "1");

		System.out.print(logsAndPasswds.get(enterLogin));
		System.out.print(logsAndPasswds.get(enterLogin).equals(enterPass));

		return logsAndPasswds.containsKey(enterLogin) && logsAndPasswds.get(enterLogin).equals(enterPass);
	}

}
