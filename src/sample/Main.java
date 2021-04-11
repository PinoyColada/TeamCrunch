package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.File;

public class Main extends Application {

    Button button;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene rootScene = new Scene(root);

        // Added burger gif and making it move

        Image image = new Image(new File("C:\\Users\\Ryan Hatamosa\\IdeaProjects\\TeamCrunch\\" +
                "src\\sample\\resources\\assets\\BurgerZoneBurger.gif").toURI().toString());

        ImageView burger = new ImageView(image);
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(burger);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(350);
        translate.setAutoReverse(true);
        translate.play();

        // First Scene - Welcomes user to BurgerZone

        Label text1 = new Label("Welcome to BurgerZone!");
        Button button1 = new Button("Click to enter");
        text1.setTextFill(Color.RED);
        text1.setStyle("-fx-font: 25 arial;");

        button1.setOnAction(e -> {
            primaryStage.setScene(rootScene);
        });

        StackPane layout1 = new StackPane();
        layout1.setStyle("-fx-background-color: beige");
        StackPane.setAlignment(text1, Pos.TOP_CENTER);
        StackPane.setAlignment(button1,Pos.BOTTOM_CENTER);
        StackPane.setAlignment(burger,Pos.CENTER_LEFT);
        layout1.getChildren().addAll(text1,button1,burger); //adding multiple items
        Scene scene = new Scene(layout1, 800,600); //creates window

        /*
        Second Scene - Allows a user to order, and to leave the store if he/she doesn't find
        anything appealing
        */

        Button exitButton = new Button("Leave BurgerZone Store");
        exitButton.setOnAction(e -> {
            ConfirmBox.display("Exiting the store", "Are you sure you want to leave?");
        });

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(exitButton); //adds button for user to exit
        scene2 = new Scene(layout2, 600,300); //creates window

        //----------------------------------------------------------------

        primaryStage.setTitle("Enter the BurgerZone"); // title
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        /*Restaurant res1 = new Restaurant();*/
    }
}
