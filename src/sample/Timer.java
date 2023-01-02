package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.text.Text;
import javafx.util.Duration;

import javax.security.auth.kerberos.KerberosTicket;

public class Timer {
    private int seconds;
    private boolean timerOn;

    // Constructor
    public Timer(){
        this.seconds = 60;
        this.timerOn = false;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void increaseSeconds(){
        this.seconds += 1;
    }

    public void decreaseSeconds(){
        this.seconds -= 1;
    }

    public boolean getTimerOn(){
        return this.getTimerOn();
    }


    public void setTimerOn(boolean value){
        this.timerOn = value;
    }

    // Start Timer Function
    public void start(){
        if(getSeconds() <= 0){
            return;
        } else {
            decreaseSeconds();
        }
    }

    // Reset Timer
    public void resetSeconds() {
        this.seconds = 60;
    }
}
