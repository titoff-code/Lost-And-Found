package controller;

import javax.servlet.http.HttpServletRequest;

public class FindingsCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.findings");
		return page;
	}

}
