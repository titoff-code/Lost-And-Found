package datalayer;
import datalayer.SystemUserDAO;

public abstract class DAOFactory {
	public static DAOFactory getInstance(DBType dbType) {
		DAOFactory result = dbType.getDAOFactory();
		System.out.print("ÔÔÔÔÔÔ1");
		return result;
	}

	public abstract SystemUserDAO getSystemUserDAO();


	public abstract void closeConnection();
}
