package application;
import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControlRocket {
	@FXML
	JFXTextField user;
	
	@FXML
	JFXTextField passwd;
	
	@FXML
	JFXButton login;
	
	@FXML
	ImageView img1;
	
	@FXML
	ImageView img2;
//	Main main;
//	Stage stage;
//
//	public void main(Stage stage, Main main) {
//		this.main = main;
//		this.stage = stage;
//	}
	
	public void showHome() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainRocket.class.getResource("Urano.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage homeStage = new Stage();
			homeStage.setTitle("Main Menu");
			Scene scene = new Scene(page);
			homeStage.setScene(scene);
			homeStage.setMaximized(true);
			homeStage.show();
			System.out.println("second stage ok");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("second stage ko");
		}
	}
	/**
	 * hacerLogin Es para indicar que, en el caso de que se introduzca el usuario y la contrase�a correcta se proceder� a pasar a 
	 * la siguiente p�gina.
	 */
	@FXML
	public void hacerLogin() {
		if (user.getText().equals("admin") && passwd.getText().equals("1234")) {
			Stage cerrarvent = (Stage) passwd.getScene().getWindow();
			cerrarvent.close();
			try {
				toUrano();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Es para indicar a qu� fxml ir�.
	 * @throws IOException
	 */
	private void toUrano() throws IOException {
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
		AnchorPane pane = (AnchorPane) loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Home page");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
