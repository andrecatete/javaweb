package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javadb.jdbc.ConnectionFactory;

public class TesteInsertDados {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		String sql = "insert into clientes(nome, email, endereco) values (?, ?, ?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setString(1,"Andre");
		stmt.setString(2,"andre.o.alvarez@hotmail.com");
		stmt.setString(3,"Rua Pedro Americo 501");
		
		stmt.execute();
		stmt.close();
		
		System.out.println("Gravado com sucesso!!");
				
	}

}
