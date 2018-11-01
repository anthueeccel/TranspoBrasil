package br.com.cursojava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements RepositorioContato {

	@Override
	public List<Contato> buscarTodos() {
		String query = "select * from contatos";

		List<Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(query);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possivel ....");
		}
		return contatos;
	}

	private Contato carregarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatos = new ArrayList<>();
		if (nome != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where nome like ?");
				comando.setString(1, "%"+nome+"%");
				ResultSet cursor = comando.executeQuery();
				while (cursor.next()) {
					contatos.add(carregarContato(cursor));
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar o contato solicitado (ID)");
			}

		}
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		Contato contato = null;
		if (telefone != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where telefone like ?");
				comando.setString(1, "%"+telefone+"%");
				ResultSet cursor = comando.executeQuery();
				while (cursor.next()) {
					contato  = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar o contato solicitado (telefone)");
			}

		}
		return contato;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		if (id != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where id = ?");
				comando.setInt(1, id);
				ResultSet cursor = comando.executeQuery();
				if (cursor.next()) {
					contato = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar o contato solicitado (ID)");
			}

		}
		return contato;
	}

	@Override
	public void inserir(Contato contato) {
		if (contato != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement(
						"insert into contatos(nome, email, telefone) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if (cursor.next()) {
					Integer id = cursor.getInt("id");
					contato.setId(id);
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Não foi possível INSERIR os dados do Contato");
			}
		}

	}

	@Override
	public void atualizar(Contato contato) {
		if (contato != null && contato.getId() != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("update contatos set nome = ?, email = ?, telefone = ? where id = ?;");
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.setInt(4, contato.getId());
				comando.executeUpdate();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel ATUALIZAR os dados do contato");
			}
		}

	}

	@Override
	public void remover(Integer id) {
		if (id != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from contatos where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel REMOVER os dados do Contato");
			}
		}
		
	}

	@Override
	public int contar(int quantidade) {
		quantidade = 0;
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count(id) as quantidade from contatos; ");
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possivel CONTAR os contatos");
		}
		return quantidade;
	}

}
