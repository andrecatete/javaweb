package servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@WebServlet("/rnservletadiciona2")  //pegou do form do insertClient.jsp
@SuppressWarnings("serial")
public class RNServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		PrintWriter out = response.getWriter();

		String action = request.getParameter("regra");
		
		ClienteDao dao = new ClienteDao(); 
		
		if(action.equals("InsertCliente")){
			//implementação da regra de negocio;
			Cliente cliente = new Cliente();
			cliente.setNome(request.getParameter("nome"));
			cliente.setEndereco(request.getParameter("endereco"));
			cliente.setEmail(request.getParameter("email"));
			
			dao.inserir(cliente);
			
			RequestDispatcher rd = request.getRequestDispatcher("/insertclienteok.jsp");
			rd.forward(request, response);
			
		}else if(action.equals("GetClientes")) {
			//implementação para listagem de clientes;
		}else if(action.equals("DeleteCliente")) {
			//implementação para excluir clientes;
		}
	
		//codigo fazendo extract class
//		if(action.equals("InsertClient")) {
//			new InserClient().execute(request, response);
//		}else if(action.equals("GetClientes")) {
//			new GetClient().execute(request, response);		
//		}else if(action.equals("DeleteCliente")) {
//			new DeleteClient().execute(request, response);
//		}
		
		
//		String nome = request.getParameter("nome");
//		String endereco = request.getParameter("endereco");
//		String email = request.getParameter("email");
//		
//		Cliente cliente = new Cliente();
//		cliente.setNome(nome);
//		cliente.setEmail(email);
//		cliente.setEndereco(endereco);
//		
//		ClienteDao dao = new ClienteDao();
//		dao.inserir(cliente);
//
//		RequestDispatcher rd = request.getRequestDispatcher("insertclienteok.jsp");
//		rd.forward(request, response);
//		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("Cliente " + cliente.getNome() + " inserido no banco!");
//		out.println("</body>");
//		out.println("</html>");
//
	}
}
