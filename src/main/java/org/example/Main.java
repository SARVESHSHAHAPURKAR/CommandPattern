package org.example;

import Implementations.AirConditioner;
import Implementations.Remote;
import Implementations.TurnOffCommand;
import Implementations.TurnOnCommand;
import Interfaces.ICommand;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Remote remote = new Remote(new Stack<>());

        AirConditioner ac = new AirConditioner();

        remote.command = new TurnOnCommand(ac);

        remote.pressButton();
        remote.command = new TurnOffCommand(ac);
        remote.pressButton();
        remote.undo();
        remote.undo();


    }
}