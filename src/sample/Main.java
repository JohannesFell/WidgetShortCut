package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

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

        // Buttons den CSS_Style zuweisen
        button1.getStyleClass().add("button1");
        button2.getStyleClass().add("button2");
        button3.getStyleClass().add("button3");
        button4.getStyleClass().add("button4");
        button5.getStyleClass().add("button5");

        // Elemente klickbar machen - Eventhandling
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://www.youtube.com/");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://www.facebook.com/login/");
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://www.twitter.com/");
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getHostServices().showDocument("https://www.amazon.de/");
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        // Elemente zum root Node hinzufügen
        root.getChildren().add( button1 );
        root.getChildren().add( button2 );
        root.getChildren().add( button3 );
        root.getChildren().add( button4 );
        root.getChildren().add( button5 );

        // Szene erstellen
        Scene scene = new Scene( root );
        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add( getClass().getResource("application.css").toExternalForm() );
        primaryStage.setScene( scene );
        primaryStage.setX((screenSize.getWidth()/2)- 170);
        primaryStage.setY(20.0);
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
