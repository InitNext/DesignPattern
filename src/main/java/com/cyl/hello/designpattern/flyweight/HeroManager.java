package com.cyl.hello.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

//提供共享功能，单例
public class HeroManager {

    private static HeroManager heroManager = new HeroManager();

    private Map<String, AbstractHeroV2> heroMap;

    private HeroManager(){
        heroMap = new HashMap<String, AbstractHeroV2>();
    }

    public static HeroManager getInstance(){
        return heroManager;
    }

    //该方法提供共享功能
    public AbstractHeroV2 getHero(String name){
        AbstractHeroV2 hero = heroMap.get(name);
        if (hero == null) {
            if (name.equals("恶魔巫师")) {
                hero = new LionV2();
            }else if (name.equals("影魔")) {
                hero = new SFV2();
            }
            heroMap.put(name, hero);
        }
        return hero;
    }
}
