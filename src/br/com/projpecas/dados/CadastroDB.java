package br.com.projpecas.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.projpecas.entidade.Cadastro;
import br.com.projpecas.util.Conexao;

public class CadastroDB {

	private Connection connection;
	
	public CadastroDB () {
		connection = Conexao.getConnection();
	}
	
	public boolean inserir(Cadastro cadastro) throws SQLException {
		
		boolean status = false;
		
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO cadastro (id, nome, peso, tipo, data_de_cadastro, valor) values (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, cadastro.getNome());
			stmt.setDouble(2, cadastro.getPeso());
			stmt.setString(3, cadastro.getTipo());
			stmt.setInt(4, cadastro.getData_de_cadastro());
			stmt.setFloat(5, cadastro.getValor());
			
			stmt.execute();
			status = true;
			
		}catch (SQLException e) {
			System.err.println(e.toString());
			status = false;
		} finally{
			connection.close();
		}
		return status;
	}
}
