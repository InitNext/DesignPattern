package com.cyl.hello.designpattern.flyweight;

public class Role {

    private AbstractHeroV2 hero;//角色选择的英雄

    //我们把血量和魔法量这两个外部状态从英雄里剥离出来，放到外部的角色类中
    private long hp;

    private long mp;

    public Role(AbstractHeroV2 hero) {
        super();
        this.hero = hero;
    }

    //释放技能
    public void release(int index){
        hero.release(index);
    }

    //物理攻击
    public void commonAttack(){
        hero.commonAttack();
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getMp() {
        return mp;
    }

    public void setMp(long mp) {
        this.mp = mp;
    }
}
