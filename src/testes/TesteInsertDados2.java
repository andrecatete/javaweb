package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javadb.jdbc.ConnectionFactory;

public class TesteInsertDados2 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		
		try {
			con = new ConnectionFactory().getConnection();		
			String sql = "insert into clientes(nome, email, endereco) values (?, ?, ?)";
			PreparedStatement stmt;
			stmt = con.prepareStatement(sql);
			stmt.setString(1,"Andre");
			stmt.setString(2,"andre.o.alvarez@hotmail.com");
			stmt.setString(3,"Rua Pedro Americo 501");		
			stmt.execute();
			stmt.close();		
			System.out.println("Gravado com sucesso!!");						
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}				
}
