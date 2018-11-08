package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Parent root = FXMLLoader.load(getClass().getResource("/view/CadastroCliente.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("/view/CadastroDeFilmeT1.fxml"));
		
		
		Scene scene = new Scene(root, 800, 600);
		
		primaryStage.setTitle("CRUD de Clientes");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
