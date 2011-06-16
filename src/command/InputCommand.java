package command;

import java.io.IOException;
import javax.servlet.ServletException;

public class InputCommand extends FrontCommand {

	@Override
	public void process() throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		request.setAttribute("name", request.getParameter("name"));
		forward("result.jsp");
	}

}
