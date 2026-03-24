package com.cscode.gui;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;

public class CscodeFxApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void init(){

    }

    @Override
    public void stop(){
        applicationContext.close();
    }
}
