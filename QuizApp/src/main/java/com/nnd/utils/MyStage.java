/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnd.utils;

import com.nnd.quizapp.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage instance;
    private final Stage stage = new Stage();
    
    private MyStage() {
    }
    
    public static MyStage getInstance() {
        if(instance == null) {
            instance = new MyStage();
        }
        return instance;
    }
    
    public void show(String name) throws IOException {
        if (!stage.isShowing()) {
            Scene scene = new Scene(new FXMLLoader(App.class.getResource(name+".fxml")).load());
            stage.setScene(scene);
            stage.setTitle("Question Manager");
            stage.show();
        }
    }
    
}
