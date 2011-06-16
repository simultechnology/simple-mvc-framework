package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class FrontCommand {
	protected  HttpServletRequest request;
	protected HttpServletResponse response;
	
	public void init(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	protected void forward(String target) throws ServletException, IOException {
		request.getRequestDispatcher(target).forward(request, response);
	}
	
	abstract public void process() throws ServletException, IOException;
}
