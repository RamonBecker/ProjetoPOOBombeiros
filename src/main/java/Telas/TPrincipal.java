package Telas;

import com.jfoenix.controls.JFXButton;

import Alert.MessageAlert;
import Controladores.ControladorImagem;
import Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TPrincipal extends Application {
	private String usuario;
	private JFXButton btnCadastroEmpresa;
	private JFXButton btnCadastroVistoria;
	private JFXButton btnTaxa;
	private Label labelCadastroEmpresa;
	private Label labelCadastroVistoria;
	private Label labelTaxa;
	private Menu menu;
	private MenuItem menuItemSair;
	private MenuBar menuBar;
	private VBox vBox;

	public TPrincipal(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane pane = new AnchorPane();
		Scene scene = new Scene(pane);
		pane.setPrefSize(700, 500);

		// CRIANDO BUTTON CADASTRO DE EMPRESAS
		btnCadastroEmpresa = new JFXButton();
		btnCadastroEmpresa.setPrefSize(30, 30);
		// CARREGANDO IMAGEM

		ImageView imgCadastroEmpresa = new ImageView(
				ControladorImagem.carregarImagem(Strings.urlImagem, Strings.urlLogoCadastroEmpresa));
		imgCadastroEmpresa.setFitHeight(70);
		imgCadastroEmpresa.setFitWidth(70);
		btnCadastroEmpresa.setGraphic(imgCadastroEmpresa);
		btnCadastroEmpresa.setLayoutX(83);
		btnCadastroEmpresa.setLayoutY(150);

		// CRIANDO LABEL Cadastro empresa
		labelCadastroEmpresa = new Label(Strings.btnCadastroEmpresas);
		labelCadastroEmpresa.setLayoutX(76);
		labelCadastroEmpresa.setLayoutY(235);

		// CRIANDO BUTTON CADASTRO VISTORIA
		btnCadastroVistoria = new JFXButton();

		// CARREGANDO IMAGEM
		ImageView imgCadastroVistoria = new ImageView(
				ControladorImagem.carregarImagem(Strings.urlImagem, Strings.urlLogoCadastroVistoria));
		imgCadastroVistoria.setFitHeight(70);
		imgCadastroVistoria.setFitWidth(70);
		btnCadastroVistoria.setGraphic(imgCadastroVistoria);
		btnCadastroVistoria.setLayoutX(220);
		btnCadastroVistoria.setLayoutY(150);

		// CRIANDO LABEL Cadastro Vistoria
		labelCadastroVistoria = new Label(Strings.btnCadastroVistorias);
		labelCadastroVistoria.setLayoutX(230);
		labelCadastroVistoria.setLayoutY(235);

		// CRIANDO BUTTON TAXA
		btnTaxa = new JFXButton();
		ImageView imgLogoTaxa = new ImageView(ControladorImagem.carregarImagem(Strings.urlImagem, Strings.urlLogoTaxa));
		imgLogoTaxa.setFitHeight(70);
		imgLogoTaxa.setFitWidth(70);
		btnTaxa.setGraphic(imgLogoTaxa);
		btnTaxa.setLayoutX(357);
		btnTaxa.setLayoutY(150);

		// CRIANDO LABEL Taxa
		labelTaxa = new Label(Strings.lbTaxa);
		labelTaxa.setLayoutX(367);
		labelTaxa.setLayoutY(235);

		// ADICIONANDO MENU
		menu = new Menu(Strings.titleMenu);
		menuItemSair = new MenuItem(Strings.titleSair);

		menu.getItems().add(menuItemSair);
		menuBar = new MenuBar();

		menuBar.getMenus().add(menu);
		vBox = new VBox(1, menuBar);
		vBox.setPrefSize(700, 40);

		// ADICIONANDO COMPONENTES NO PANE

		pane.getChildren().add(btnCadastroEmpresa);
		pane.getChildren().add(btnCadastroVistoria);
		pane.getChildren().add(labelCadastroEmpresa);
		pane.getChildren().add(labelCadastroVistoria);
		pane.getChildren().add(vBox);
		pane.getChildren().add(btnTaxa);
		pane.getChildren().add(labelTaxa);

		// A��ES DOS BOT�ES

		// A��O DO BOT�O EMPRESA
		acaoBotaoEmpresa(btnCadastroEmpresa, stage);

		// A��O DO MENU SAIR
		menuItemSair.setOnAction(e -> sair(stage));

		// A�A� BOTAO VISTORIA
		acaoBotaoVistoria(btnCadastroVistoria, stage);
		
		// A�A� BOTAO Taxa
		acaoBotaoTaxa(btnTaxa, stage);
		
		stage.setScene(scene);
		stage.show();
	}

	private void acaoBotaoEmpresa(JFXButton btnCadastroEmpresa, Stage stage) {

		btnCadastroEmpresa.setDefaultButton(false);
		btnCadastroEmpresa.setOnKeyPressed((KeyEvent t) -> {
			if (t.getCode() == KeyCode.ENTER) {
				telaEmpresa(stage);
			}
		});

		btnCadastroEmpresa.setOnAction(e -> telaEmpresa(stage));

	}

	private void acaoBotaoVistoria(JFXButton btnCadastroVistoria, Stage stage) {

		btnCadastroVistoria.setDefaultButton(false);
		btnCadastroVistoria.setOnKeyPressed((KeyEvent t) -> {
			if (t.getCode() == KeyCode.ENTER) {
				telaVistoria(stage);
			}
		});
		btnCadastroVistoria.setOnAction(e -> telaVistoria(stage));

	}

	private void acaoBotaoTaxa(JFXButton btnTaxa, Stage stage) {
		
		btnTaxa.setDefaultButton(false);
		btnTaxa.setOnKeyPressed((KeyEvent t) -> {
			if (t.getCode() == KeyCode.ENTER) {
				telaTaxa(stage);
			}
		});
		btnTaxa.setOnAction(e -> telaTaxa(stage));
	}

	private void telaEmpresa(Stage stage) {
		try {
			new TEmpresa(usuario).start(new Stage());
			stage.close();
		} catch (Exception e) {
			MessageAlert.mensagemErro(Strings.erroTela);
			e.printStackTrace();
		}
	}

	private void telaVistoria(Stage stage) {

		try {

			new TVistoria(usuario).start(new Stage());
			stage.close();
		} catch (Exception e) {
			MessageAlert.mensagemErro(Strings.erroTela);
			e.printStackTrace();
		}
		;
	}

	private void sair(Stage stage) {
		stage.close();
		MessageAlert.mensagemRealizadoSucesso(Strings.mensagemSair);
	}

	private void telaTaxa(Stage stage) {

		try {
			new TTaxa(usuario).start(new Stage());
			stage.close();
		} catch (Exception e) {
			MessageAlert.mensagemErro(Strings.erroTela);
			e.printStackTrace();
		}
	}
}
