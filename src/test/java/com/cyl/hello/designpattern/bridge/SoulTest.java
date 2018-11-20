package com.cyl.hello.designpattern.bridge;

import com.cyl.hello.designpattern.bridge.v1.InvisibleLoser;
import com.cyl.hello.designpattern.bridge.v1.InvisibleTRH;
import com.cyl.hello.designpattern.bridge.v1.ReadMindTRH;
import org.junit.Test;

public class SoulTest {

    @Test
    public void v1() {
        InvisibleLoser invisibleLoser = new InvisibleLoser();
        invisibleLoser.releaseSkills();
        System.out.println("------------------------------------");
        ReadMindTRH readMindTRH = new ReadMindTRH();
        readMindTRH.releaseSkills();
        System.out.println("------------------------------------");
        InvisibleTRH invisibleTRH = new InvisibleTRH();
        invisibleTRH.releaseSkills();
    }

    @Test
    public void v2() {
        Soul soul = new Doppelganger();
        soul.setAppearance(new TRH());//设置分身外貌为高富帅
        soul.setSkills(new Invisible());//设置隐身技能
        soul.doAllLikePeople();
        System.out.println("----------------------------");
        soul.show();
        soul.releaseSkills();
        System.out.println("----------------------------");
        //切换技能
        soul.setSkills(new ReadMind());
        soul.releaseSkills();
        System.out.println("----------------------------");
        //切换外貌
        soul.setAppearance(new Loser());
        soul.show();
        System.out.println("----------------------------");
        //切换技能
        soul.setSkills(new Volant());
        soul.releaseSkills();
    }
}
