package mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.regrasdenegocio.Regra;

@SuppressWarnings("serial")
@WebServlet("/mvc")
public class Controller extends HttpServlet{ //substituindo o RNServlet2
	@Override	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramview = request.getParameter("regra");
		String nomeDaAction = "mvc.regrasdenegocio."+paramview;
	
		try {
			Class<?> classe = Class.forName(nomeDaAction);
			Regra logica = (Regra) classe.newInstance();
			String page = logica.execute(request,response);
			request.getRequestDispatcher(page).forward(request, response);
		} catch (Exception e) {
			throw new ServletException();
		}
	}
}