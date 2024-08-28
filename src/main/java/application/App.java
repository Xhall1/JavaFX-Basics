package application;

import utilities.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class App extends Application{

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {


        AnchorPane load = FXMLLoader.load(getClass().getResource(Paths.HOLA_MUNDO));
        Scene scene = new Scene(load);
        stage.setScene(scene); //From object Scene that i created at line 21.
        stage.show();
    }
}
