package poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cliente extends Pessoa{

	public String numCartao;
	private List<Endereco> enderecos;

	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new RuntimeException("Endere�o n�o pode ser nulo");
		}
		if(endereco.cep == null) {
			throw new RuntimeException("Cep n�o pode ser nulo");
		}
		
		getEndereco().add(endereco);
		
	}

	private List<Endereco> getEndereco() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
}
