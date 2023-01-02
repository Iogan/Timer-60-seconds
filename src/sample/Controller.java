package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Text timer;
    private Timer timerClass;

    public Controller(){
        timer = new Text();
        timerClass = new Timer();
    }

    @FXML
    void decreaseSeconds(ActionEvent event) {
        timerClass.decreaseSeconds();
        timer.setText(String.valueOf(timerClass.getSeconds()));
    }

    @FXML
    void increaseSeconds(ActionEvent event) {
        timerClass.increaseSeconds();
        timer.setText(String.valueOf(timerClass.getSeconds()));
    }

    @FXML
    void resetSeconds(ActionEvent event) {
        timerClass.resetSeconds();
        timer.setText(String.valueOf(timerClass.getSeconds()));
    }

    @FXML
    void start(ActionEvent event) {

        timer.setText(String.valueOf(timerClass.getSeconds()));
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timerClass.start();
            timer.setText(String.valueOf(timerClass.getSeconds()));
        }));

        timeline.setCycleCount(timerClass.getSeconds());
        timeline.play();

        timerClass.setTimerOn(true);

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timer.setText(String.valueOf(timerClass.getSeconds()));
    }
}
