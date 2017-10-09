import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Authentication extends Application{
	@Override
	public void start(Stage primaryStage){
		TextInputDialog dialog1 = new TextInputDialog();
		dialog1.setHeaderText("Enter your username!");
		Optional<String> username = dialog1.showAndWait();
		TextInputDialog dialog2 = new TextInputDialog();
		dialog2.setHeaderText("Enter your password!");
		Optional<String> password = dialog2.showAndWait();
		
		if((username.get().equals("Phung")) && (password.get().equals("Ngo"))){
			System.out.println("Welcome Phung");
		}else{
			System.out.println("Wrong username or password");
		}
		
	}
}
