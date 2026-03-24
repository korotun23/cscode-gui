package com.cscode.gui.config;

public enum FxmlView {

    GENERATOR {

        @Override
        public String getFxmlPath(){
            return "fxml/generator.fxml";
        }

    };

    public abstract String getFxmlPath();
}
