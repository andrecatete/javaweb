package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javadb.jdbc.ConnectionFactory;
import modelo.Cliente;

public final class ClienteDao {
	private Connection con;
	
	public ClienteDao() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Cliente cliente) {
		String sql = "insert into clientes(nome, email, endereco) values (?, ?, ?)";		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Cliente> getClientes(){
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.con.prepareStatement("select * from clientes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setEndereco(rs.getString("endereco"));
				
				clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void editar(Cliente cliente) {
		String sql = "update clientes set nome=?, email=?, endereco=? where Id=?";
				
		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			stmt.setLong(4, cliente.getId());
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}		
	}
	
	public void excluir(Cliente cliente) {
		try {
			PreparedStatement stmt = con.prepareStatement("delete from clientes where Id=?");
			stmt.setLong(1, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
		
}
