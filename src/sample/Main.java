package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Root Node - Layout der Szene
        HBox root = new HBox();
        root.setPrefSize( 340.0, 70.0 ); // Szenen-Größe
        root.setSpacing( 10.0 ); // Spacing zwischen Elementen
        root.setAlignment(Pos.CENTER );

        // Elemente erstellen (Buttons,...)
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();

        // Button Size
        button1.setPrefSize( 64.0,64.0 );
        button2.setPrefSize( 64.0,64.0 );
        button3.setPrefSize( 64.0,64.0 );
        button4.setPrefSize( 64.0,64.0 );
        button5.setPrefSize( 64.0,64.0 );

        // Elemente zum root Node hinzufügen
        root.getChildren().add( button1 );
        root.getChildren().add( button2 );
        root.getChildren().add( button3 );
        root.getChildren().add( button4 );
        root.getChildren().add( button5 );

        Parent parentScene = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene( root, 400, 400 );

        primaryStage.setTitle("WidgetShortCut");
        primaryStage.setScene( scene );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
