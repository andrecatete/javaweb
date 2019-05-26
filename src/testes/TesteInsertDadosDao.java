package testes;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteInsertDadosDao {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Joao");
		cliente.setEmail("Joao@joao.com");
		cliente.setEndereco("v Brasil 1000");
		
		ClienteDao dao = new ClienteDao();
		
		dao.inserir(cliente);
		
		System.out.println("Cliente gravado com sucesso!!");		

	}

}
