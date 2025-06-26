/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnd.utils;
import javafx.scene.control.Alert;
/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alert = new Alert(Alert.AlertType.INFORMATION);
    
    private MyAlert() {
        alert.setTitle("loading");
        alert.show();
    }
    
    public static MyAlert getInstance() {
        if (instance == null) {
            instance = new MyAlert();
        }
        return instance;
    }
    
}
