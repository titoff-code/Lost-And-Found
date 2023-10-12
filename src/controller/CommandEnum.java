package controller;

public enum CommandEnum {
	LOGIN {
		{
			this.command = new LoginCommand();
		}
	},
	LOGOUT {
		{
			this.command = new LogoutCommand();
		}
	},
	FINDINGS {
		{
			this.command = new FindingsCommand();
		}
	},
	GETUSERPROFILE{
		{
		this.command = new UserProfile();
	}
	};

	ActionCommand command;

	public ActionCommand getCurrentCommand() {
		return command;
	}
}
