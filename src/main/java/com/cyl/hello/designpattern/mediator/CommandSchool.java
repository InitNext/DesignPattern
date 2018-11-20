package com.cyl.hello.designpattern.mediator;

public class CommandSchool extends School {

    public CommandSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "命令门";
    }
}
