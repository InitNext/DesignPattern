package com.cyl.hello.designpattern.builder;

//灵魂类，指挥者
public class SoulV2 {

    public Doppelganger createDoppelganger(DoppelgangerBuilder doppelgangerBuilder,String name){
        doppelgangerBuilder.createDoppelganger(name);
        doppelgangerBuilder.buildBody();
        doppelgangerBuilder.buildHead();
        doppelgangerBuilder.buildLeftArm();
        doppelgangerBuilder.buildLeftHand();
        doppelgangerBuilder.buildRightArm();
        doppelgangerBuilder.buildRightHand();
        doppelgangerBuilder.buildLeftLeg();
        doppelgangerBuilder.buildLeftFoot();
        doppelgangerBuilder.buildRightLeg();
        doppelgangerBuilder.buildRightFoot();
        return doppelgangerBuilder.getDoppelganger();
    }
}
