package com.nnd.quizapp;

import com.nnd.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;


public class PrimaryController {
    public void HandleQuestionManager(ActionEvent event) throws IOException {
        MyStage.getInstance().show("QuestionManager");
    }
    
    public void HandlePraticeMode(ActionEvent event) {
        
    }
    
    public void HandleExamMode(ActionEvent event) {
        
    }
}
