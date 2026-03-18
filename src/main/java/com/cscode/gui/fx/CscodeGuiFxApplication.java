package com.cscode.gui.fx;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class CscodeGuiFxApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(Main.class).run();
    }

    @Override
    public void start(Stage primaryStage){

    }

    @Override
    public void stop(){
        this.applicationContext.close();
    }
}
