package org.example.demoexam;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<Partner> partners = FXCollections.observableArrayList(
                new Partner("OOO", "Ромашка", 11, "г.Москва, ул.Пушкина, д.16, строение 5", "Грибнякова М.В.", "+79999999999", "romachka@ya.ru"),
                new Partner("OAO", "Магнит", 5, "г.Санкт-Петербург, ул.Ломоносова, д.122, строение 11", "Грибняков В.В.", "+79111111111", "magnit@gmail.com"),
                new Partner("ИП", "Руденко Роман Вачеславович", 5, "г.Рязань, ул.Кокурева, д.33, строение 1", "Губков Н.С.", "+79222222222", "gubka22@gmail.com")
        );
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 500);

        HelloController helloController = fxmlLoader.getController();
        helloController.updateData(partners);

        stage.setTitle("Список партнеров");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}