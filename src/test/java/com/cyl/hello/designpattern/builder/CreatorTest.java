package com.cyl.hello.designpattern.builder;

import org.junit.Test;

public class CreatorTest {

    @Test
    public void creatorV1() {
        SoulV1 soulV1 = new SoulV1();
        //制造一个瘦小的看守所的人员
        soulV1.createDoppelganger("看守所人员1");
        soulV1.createBody("瘦瘦的身体");
        soulV1.createHead("小小的头");
        soulV1.createLeftArm("瘦瘦的左胳膊");
        soulV1.createLeftHand("瘦瘦的左手");
        soulV1.createRightArm("瘦瘦的右胳膊");
        soulV1.createRightHand("瘦瘦的右手");
        soulV1.createLeftLeg("瘦瘦的左腿");
        soulV1.createLeftFoot("小小的左脚");
        soulV1.createRightLeg("瘦瘦的右腿");
        soulV1.createRightFoot("小小的右脚");
        System.out.println("获得了" + soulV1.getDoppelganger());

        System.out.println("----------------------------------------");

        //制造一个胖胖的看守所的人员
        soulV1.createDoppelganger("看守所人员2");
        soulV1.createBody("胖胖的身体");
        soulV1.createHead("大大的头");
        soulV1.createLeftArm("胖胖的左胳膊");
        soulV1.createLeftHand("胖胖的左手");
        soulV1.createRightArm("胖胖的右胳膊");
        soulV1.createRightHand("胖胖的右手");
        soulV1.createLeftLeg("胖胖的左腿");
        soulV1.createLeftFoot("大大的左脚");
        soulV1.createRightLeg("胖胖的右腿");
        soulV1.createRightFoot("大大的右脚");
        System.out.println("获得了" + soulV1.getDoppelganger());
    }

    @Test
    public void creatorV2() {
        SoulV2 soul = new SoulV2();
        //制造一个瘦小的看守所的人员
        System.out.println("获得了" + soul.createDoppelganger(new ThinBuilder(),"看守所人员1"));
        System.out.println("----------------------------------------");

        //制造一个胖胖的看守所的人员
        System.out.println("获得了" + soul.createDoppelganger(new FatBuilder(),"看守所人员2"));
    }
}