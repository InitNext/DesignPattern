package com.cyl.hello.designpattern.mediator;

public class MediatorSchool extends School {

    public MediatorSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }


    @Override
    public String getName() {
        return "中介者神阁";
    }
}
