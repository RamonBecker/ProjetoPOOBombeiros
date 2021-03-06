package Entidades;

import java.util.ArrayList;

public class Strings {

	// Title
	public static final String titleLogin = "Login";
	public static final String titleMenu = "Menu";
	public static final String titleVoltar = "Voltar";
	public static final String titleSair = "Sair";

	// Botoes
	public static final String btnLogin = "Entrar";
	public static final String btnCadastroEmpresas = "Cadastrar Empresas";
	public static final String btnCadastroVistorias = "Vistorias";
	public static final String btnLogout = "Sair";
	public static final String btnCadastrar = "Cadastrar";
	public static final String btnSelecionar = "Selecionar";
	public static final String btnBuscarEmpresa = "Buscar Empresa";
	public static final String btnEnviar = "Enviar";
	public static final String btnCadastrarVistoria = "Cadastrar Vistoria";
	public static final String btnPagar = "Pagar";

	// Erros
	
	public static final String aviso = "Aviso";
	public static final String erro = "Erro";
	public static final String erroImagem = "Imagem n�o encontrada";
	public static final String erroTela = "N�o foi poss�vel abrir esta tela";
	public static final String senhaIncorreta = "Senha Incorreta";
	public static final String usuarioIncorreto = "Usu�rio Incorreto";
	public static final String cpfInvalido = "CPF inv�lido";
	public static final String cnpjInvalido = "CNPJ inv�lido";
	public static final String empresaNaoEncontrada = "Empresa n�o encontrada";
	public static final String empresaNaoCadastrada = "Porque n�o existe nenhuma empresa cadastrada";
	public static final String ruaVazio = "A rua n�o pode ser vazio !";
	public static final String bairroVazio = "O bairro n�o pode ser vazio !";
	public static final String cidadeVazio = "A cidade n�o pode ser vazio !";
	public static final String estadoVazio = "O Estado n�o pode ser vazio !";
	public static final String cepVazio = "O CEP n�o pode ser vazio !";
	public static final String numeroVazio = "O numero n�o pode ser vazio !";
	public static final String nomeVazio = "O nome n�o pode ser vazio";
	public static final String enderecoVazio = "O endere�o n�o pode ser vazio";
	public static final String sobrenomeVazio = "O sobrenome n�o pode ser vazio";
	public static final String dataNascimentoVazio = "A data de nascimento n�o pode ser vazio !";
	public static final String nomeFantasiaVazio = "O nome fantasia n�o pode ser vazio";
	public static final String selecioneEmpresa = "Selecione a empresa para voltar";
	public static final String empresaVazio = "A empresa n�o pode ser vazio";
	public static final String vistoriadorVazio = "O vistoriador n�o pode ser vazio";
	public static final String telefoneVazio = "O numero do telefone n�o pode ser negativo";
	public static final String erroCadastro = "N�o foi poss�vel cadastrar";
	public static final String erroAreaTotalEdificacao = "A area total da edificao nao pode ser negativo";
	public static final String erroAreaVistoria = "A area vistoriada nao pode ser negativo";
	public static final String erroStatus = "O status n�o pode ser vazio";
	public static final String erroMotivo = "O motivo n�o pode ser vazio;";
	public static final String erroDataVazio = "A data n�o pode ser vazio";

	// Arquivos Imagens
	public static final String urlImagem = "src/main/java/Imagem/";
	public static final String urlLogoUsuario = "LogoUsuario.png";
	public static final String urlLogoSenha = "LogoSenha.png";
	public static final String urlLogoLogin = "Login.png";
	public static final String urlLogoCadastroEmpresa = "LogoCadastroEmpresa.png";
	public static final String urlLogoCadastroVistoria = "LogoCadastroVistoria.png";
	public static final String urlLogoSair = "LogoSair.png";
	public static final String urlLogoTaxa = "LogoTaxa.png";

	// LABELS
	public static final String lbNome = "Nome";
	public static final String lbCnpj = "CNPJ";
	public static final String lbNomefantasia = "Nome fantasia";
	public static final String lbTelefone = "Telefone";
	public static final String lbRua = "Rua";
	public static final String lbBairro = "Bairro";
	public static final String lbCidade = "Cidade";
	public static final String lbCep = "Cep";
	public static final String lbEstado = "Estado";
	public static final String lblUsuario = "Usu�rio";
	public static final String lblSenha = "Senha";
	public static final String lbNumero = "N�mero";
	public static final String lbEmpresa = "Cadastrar Empresa";
	public static final String lbAreaTotalEdificacao = "�rea total da edificacao";
	public static final String lbAreaVistoriada = "�rea vistoriada";
	public static final String lbMotivo = "Motivo do Indeferimento";
	public static final String lbTaxa = "Taxas";
	public static final String lbstatus = "Status";
	
	// Mensagens
	public static final String mensagemEmpresa = "Empresa Cadastrada com sucesso";
	public static final String mensagemCPF = "CPF v�lido";
	public static final String mensagemCNPJ = "CNPJ v�lido";
	public static final String mensagemSair = "Saindo do programa";
	public static final String mensagemVoltarTelaPrincipal = "Voltando para a tela principal";
	public static final String tituloPesquisaEmpresa = "Empresas Cadastradas";
	public static final String mensagemItemSelecionado = "Item selecionado";
	public static final String mensagemMotivoIndeferimento = "Descreva o motivo do indeferimento";
	public static final String mensagemTaxaMinima = "Taxa m�nima";
	public static final String funcionamento = "Funcionamento";
	public static final String habitese = "Habite-se";
	public static final String de = "de";
	public static final String mensagemVistoriaCadastrada = "Vistoria cadastrada com sucesso";
	public static final String mensagemSelecioneVistoriador = "Selecione o vistoriador";
	public static final String mensagemTaxaGerada = "Taxa gerada";
	public static final String mensagemVistoriaPaga = "Vistoria Paga";
	
	// RADIO BUTTONS
	public static final String rdIndeferido = "Indeferido";
	public static final String rdDeferido = "Deferido";

	// Styles button
	public static final String txfTexfieldJFXColor = "-jfx-focus-color: red;";
	public static final String txfTexfieldFonte = "-fx-font: 16px Arial;";
	public static final String btnStyle = "-fx-padding: 0.7em 0.57em; -fx-font-size: 14px;-jfx-button-type: RAISED;-fx-background-color: rgb(155, 10, 7);-fx-pref-width: 150;-fx-text-fill: WHITE;";
	public static final String lbStyle = "-fx-font-size: 14px;";

	// COMBO BOX NOMES
	public static final ArrayList<String> bmVistoriador = new ArrayList<String>() {
		{
			add("BM Willian");
			add("BM Carlos");
		}
	};

	// DATE PICKER
	public static final String dataSelecionada = "Selecione a data da vistoria";
	
	public static final String taxaHabitese = "taxaHabitese";
	public static final String taxaFuncionamento = "taxaFuncionamento";

}
