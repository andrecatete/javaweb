package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javadb.jdbc.ConnectionFactory;

public class TesteEditarCliente {

	public static void main(String[] args) {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "update clientes set nome=?, email=?, endereco=? where Id=?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "fernando");
			stmt.setString(2, "andre.alvarez@gmail.com");
			stmt.setString(3, "Rua Pedro Americo 501");
			stmt.setLong(4, 3);			
			stmt.execute();
			/*ResultSet rs = stmt.execute();
			if (rs.getRow()>0)
				System.out.println("Alterado com sucesso!!");*/
			stmt.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		

	}

}
