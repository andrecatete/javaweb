package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestePrimeiraRegraFake implements Regra{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("executando a regra de negocio fake");

		System.out.println("retornando para a view de response");
			return "testeprimeiraregrafake.jsp";
	}
}