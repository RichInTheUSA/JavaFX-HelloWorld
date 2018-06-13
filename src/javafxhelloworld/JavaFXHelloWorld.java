/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *  https://docs.oracle.com/javafx/2/get_started/css.htm
 *
 */
package javafxhelloworld;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author RichInTheUSA <Rich.Verjinski1@verizon.net>
 */

/* Note that FX apps extend Application. The start method is the main entry point*/

public class JavaFXHelloWorld extends Application {
    
    /* The Stage class is the top level containier, followed by a scene which 
     * holds all the content.
     */
    
    @Override
    public void start(Stage primaryStage) {
        
        /* Create the UI.  StackPane is the root of the scene */
        StackPane root = new StackPane();
        
        /* Add the button to the scene. */
        // root.getChildren().add(btn);
        
        /* Give the Stage (frame) a title, add the scene, and show it */
        primaryStage.setTitle("JavaFX Welcome");
        
        
        /* Create a GridPane 
        */
        GridPane grid = new GridPane();
        grid.setAlignment (Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        // grid.setPadding(new Insets(25,25,25,25));
        
        /* Create the scene, and size it */
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        
        // Initialize the stylesheet 
        scene.getStylesheets().add(JavaFXHelloWorld.class.getResource("Login.css").toExternalForm());
        
        // Add a title label above the fields.
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // Add the username label
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        // Add the text field for the Username
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        // Add the text field for the Password
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        // Password field.  Hides the text.
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        /* Create a button and set the text */
        Button btn = new Button();
        btn.setText("Sign in");
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1,6);
        
        /* Bind the button to an event handler */
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scenetitle.setFill(Color.GREEN);
                System.out.println("Hello World!");
            }
        });
        // Add the submit button
        grid.add(btn, 0,3);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * Main is not required for JavaFX applications, as the FX packager tool
     * embeds it with the jar file.  However, including it allows you to 
     * run from an IDE.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
