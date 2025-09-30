package com.project.smartoffice.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private final List<Command> history = new ArrayList<>();

    // Use the name 'execute' to match your controller calls
    public void execute(Command command) {
        command.execute();
        history.add(command);
    }

    public List<Command> getHistory() {
        return history;
    }
}
