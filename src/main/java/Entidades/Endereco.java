package Entidades;

public class Endereco {

	private String rua, bairro, cidade, estado, cep;
	private String numero;

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String numero) {

		if (rua.isEmpty() || rua == null) {
			throw new IllegalArgumentException(Strings.ruaVazio);
		}

		if (bairro.isEmpty() || bairro == null) {
			throw new IllegalArgumentException(Strings.bairroVazio);
		}

		if (cidade.isEmpty() || cidade == null) {
			throw new IllegalArgumentException(Strings.cidadeVazio);
		}

		if (estado.isEmpty() || estado == null) {
			throw new IllegalArgumentException(Strings.estadoVazio);
		}

		if (cep.isEmpty() || cep == null) {
			throw new IllegalArgumentException(Strings.cepVazio);
		}

		if (numero.isEmpty() || numero == null) {
			throw new IllegalArgumentException(Strings.numeroVazio);
		}

		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {

		if (rua.isEmpty() || rua == null) {
			throw new IllegalArgumentException(Strings.ruaVazio);
		}
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (bairro.isEmpty() || bairro == null) {
			throw new IllegalArgumentException(Strings.bairroVazio);
		}
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.isEmpty() || cidade == null) {
			throw new IllegalArgumentException(Strings.cidadeVazio);
		}
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.isEmpty() || estado == null) {
			throw new IllegalArgumentException(Strings.estadoVazio);
		}
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.isEmpty() || cep == null) {
			throw new IllegalArgumentException(Strings.cepVazio);
		}
		this.cep = cep;

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {

		if (numero.isEmpty() || numero == null) {
			throw new IllegalArgumentException(Strings.numeroVazio);
		}
		this.numero = numero;
	}

}
