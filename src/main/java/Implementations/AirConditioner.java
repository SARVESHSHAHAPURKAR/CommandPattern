package Implementations;

public class AirConditioner {

    boolean isOn;

    void turnOn(){
        isOn=true;
        System.out.println("AC turned on");
    }

    void turnOff(){
        isOn= false;
        System.out.println("AC turned off");
    }
}
