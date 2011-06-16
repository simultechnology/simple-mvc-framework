package command;

import java.io.IOException;

import javax.servlet.ServletException;

public class IndexCommand extends FrontCommand {

	@Override
	public void process() throws ServletException, IOException {
		forward("index.jsp");
	}

}
