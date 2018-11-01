package br.com.cursojava.colecoes;

public class Contato implements Comparable<Contato> {

	private String nome;
	private String email;

	public Contato() {
		super();
	}

	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	public Contato(String nome, String email) {
		
		this(nome);
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", email=" + email + "]";
	}

//	@Override
//	public int compareTo(Contato o) {
//		if (nome != null) {
//			if (o == null || o.nome == null) {
//				int compare = Integer.compare(nome.length(), o.nome.length());
//				if (compare == 0) {
//					compare = nome.compareTo(o.nome);
//				}
//				return compare;
//
//			} else {
//				return -1; // significa que nome é menor que null
//			}
//		} else if (o == null || o.nome == null) {
//
//			return 0;
//		} else {
//			return -1;
//		}
//	}
	
	@Override
	public int compareTo(Contato o) {
		if (nome != null) {
			if (o == null || o.nome == null) {				
//				int compare = Integer.compare(nome.length(), o.nome.length());
				
				if (compare == 0) {
					compare = nome.compareTo(o.nome);
				}
				return compare;

			} else {
				return -1; // significa que nome é menor que null
			}
		} else if (o == null || o.nome == null) {

			return 0;
		} else {
			return -1;
		}
	}

}
