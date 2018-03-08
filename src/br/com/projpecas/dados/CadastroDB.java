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
			
			PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO cadastro ()
					
		}
	}
}
