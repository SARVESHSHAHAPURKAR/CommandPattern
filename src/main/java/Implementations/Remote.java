package Implementations;

import Interfaces.ICommand;

import java.util.Stack;

public class Remote {

    public ICommand command;
    Stack<ICommand> history;


    public Remote(Stack<ICommand> history) {
        //this.command = command;
        this.history = history;
    }

    public void pressButton(){
        command.execute();
        history.push(command);
    }

    public void undo(){
        if(!history.isEmpty()){
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }


}
