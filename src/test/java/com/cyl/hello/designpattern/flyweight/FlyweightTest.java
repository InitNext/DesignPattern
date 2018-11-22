package com.cyl.hello.designpattern.flyweight;

import org.junit.Test;

public class FlyweightTest {

    @Test
    public void v1() {
        //假设有四个solo局，则需要创建四个lion和四个sf
        LionV1 lion1 =new LionV1();
        SFV1 sf1 = new SFV1();

        LionV1 lion2 =new LionV1();
        SFV1 sf2 = new SFV1();

        LionV1 lion3 =new LionV1();
        SFV1 sf3 = new SFV1();

        LionV1 lion4 =new LionV1();
        SFV1 sf4 = new SFV1();

        /* 以下为释放技能，物理攻击等的打架过程  */
    }

    @Test
    public void v2() {
        //假设有四个solo局，则使用了享元模式的情况下，其实恶魔巫师和影魔的实例各自只有一个
        HeroManager heroManager = HeroManager.getInstance();
        Role role1 = new Role(heroManager.getHero("恶魔巫师"));
        Role role2 = new Role(heroManager.getHero("影魔"));

        Role role3 = new Role(heroManager.getHero("恶魔巫师"));
        Role role4 = new Role(heroManager.getHero("影魔"));

        Role role5 = new Role(heroManager.getHero("恶魔巫师"));
        Role role6 = new Role(heroManager.getHero("影魔"));

        Role role7 = new Role(heroManager.getHero("恶魔巫师"));
        Role role8 = new Role(heroManager.getHero("影魔"));

        /* 以下为释放技能，物理攻击等的打架过程  */
    }

}