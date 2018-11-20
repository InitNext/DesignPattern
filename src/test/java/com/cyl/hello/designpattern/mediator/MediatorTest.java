package com.cyl.hello.designpattern.mediator;

import org.junit.Test;

public class MediatorTest {

    //@Test
    //public void mediatorTest() {
    //    School singletonSchool = new SingletonSchool();
    //    School commandSchool = new CommandSchool();
    //    School mediatorSchool = new MediatorSchool();
    //
    //    singletonSchool.attack(mediatorSchool);
    //    commandSchool.attack(mediatorSchool);
    //
    //    mediatorSchool.defense();
    //}

    @Test
    public void mediatorTest() {
        IPatternAlliance patternAlliance = new PatternAlliance();

        School singletonSchool = new SingletonSchool(patternAlliance);
        School commandSchool = new CommandSchool(patternAlliance);
        School mediatorSchool = new MediatorSchool(patternAlliance);

        School strategySchool = new StrategySchool(patternAlliance);

        //策略宫没有被联盟收留
        patternAlliance.add(mediatorSchool);
        patternAlliance.add(commandSchool);
        patternAlliance.add(singletonSchool);

        singletonSchool.attackByPatternAlliance(mediatorSchool);
        commandSchool.attackByPatternAlliance(mediatorSchool);
        System.out.println("------------------------------------------------------");
        mediatorSchool.attackByPatternAlliance(strategySchool);
        System.out.println("------------------------------------------------------");
        strategySchool.attackByPatternAlliance(mediatorSchool);
        mediatorSchool.defenseByPatternAlliance();
        System.out.println("------------------------------------------------------");
    }
}
