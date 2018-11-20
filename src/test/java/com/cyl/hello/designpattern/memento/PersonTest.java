package com.cyl.hello.designpattern.memento;

import org.junit.Test;

public class PersonTest {

    @Test
    public void v1() {
        Person personA = new Person("看守所人员A");
        Person personB = new Person("看守所人员B");
        //看守所人员A的记忆
        personA.addStory("小时候偷换男女厕所的牌子");
        personA.addStory("用裤衩上的猴皮筋做成弹弓打别人家玻璃，结果被弹了小JJ");

        //看守所人员B的记忆
        personB.addStory("小时候比谁尿的更高更远，我得了第一，只是不小心方向变成了直上直下，尿到了自己脸上");
        personB.addStory("有一次正上课，不小心放了个屁，结果带出了点杂物，满教室都是臭味熏天");

        //两个看守所人员一起经历的事
        personA.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");
        personB.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");

        System.out.println(personA);
        System.out.println(personB);
    }

    @Test
    public void v2() {
        SoulV1 soulV1A = new SoulV1();
        SoulV1 soulV1B = new SoulV1();
        PersonV2 personA = new PersonV2("看守所人员A");
        PersonV2 personB = new PersonV2("看守所人员B");
        //看守所人员A的记忆
        personA.addStory("小时候偷换男女厕所的牌子");
        personA.addStory("用裤衩上的猴皮筋做成弹弓打别人家玻璃，结果被弹了小JJ");

        //看守所人员B的记忆
        personB.addStory("小时候比谁尿的更高更远，我得了第一，只是不小心方向变成了直上直下，尿到了自己脸上");
        personB.addStory("有一次正上课，不小心放了个屁，结果带出了点杂物，满教室都是臭味熏天");

        System.out.println(personA);
        System.out.println(personB);
        //两个灵魂（管理者）抽离两个人之前的记忆
        soulV1A.pullAwayMemory(personA);
        soulV1B.pullAwayMemory(personB);
        //两个人看到了小左的技能和面貌
        personA.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");
        personB.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");

        System.out.println(personA);
        System.out.println(personB);
        //强行恢复记忆
        soulV1A.forceFixMemory(personA);
        soulV1B.forceFixMemory(personB);

        System.out.println(personA);
        System.out.println(personB);
    }

    @Test
    public void v3() {
        SoulV2 soul = new SoulV2();
        PersonV2 personA = new PersonV2("看守所人员A");
        PersonV2 personB = new PersonV2("看守所人员B");
        //看守所人员A的记忆
        personA.addStory("小时候偷换男女厕所的牌子");
        personA.addStory("用裤衩上的猴皮筋做成弹弓打别人家玻璃，结果被弹了小JJ");

        //看守所人员B的记忆
        personB.addStory("小时候比谁尿的更高更远，我得了第一，只是不小心方向变成了直上直下，尿到了自己脸上");
        personB.addStory("有一次正上课，不小心放了个屁，结果带出了点杂物，满教室都是臭味熏天");

        System.out.println(personA);
        System.out.println(personB);
        //灵魂（管理者）抽离两个人之前的记忆
        soul.pullAwayMemory(personA);
        soul.pullAwayMemory(personB);
        //两个人看到了小左的技能和面貌
        personA.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");
        personB.addStory("有一个人竟然可以飞行，记忆中还记得他的样貌");

        System.out.println(personA);
        System.out.println(personB);
        //强行恢复记忆
        soul.forceFixMemory(personA);
        soul.forceFixMemory(personB);

        System.out.println(personA);
        System.out.println(personB);
    }
}