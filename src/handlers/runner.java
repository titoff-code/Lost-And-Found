package handlers;

import java.util.HashMap;

import datalayer.DAOFactory;
import datalayer.DBType;
import datalayer.SystemUserDAO;

public class runner {

	public static void main(String[] args) {
		HandlerSystemUsers hsu = new HandlerSystemUsers();
		HashMap<String, String> logsAndPasswds = hsu.getHashMapLoginAndPasswd();

	}

}
