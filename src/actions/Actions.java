package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Actions {
	public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}