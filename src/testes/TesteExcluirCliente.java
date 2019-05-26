package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javadb.jdbc.ConnectionFactory;

public class TesteExcluirCliente {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		String sql = "delete from clientes where Id=?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, 4);				
		stmt.execute();
		stmt.close();		
		System.out.println("Excluido com sucesso!!");
	}
}
