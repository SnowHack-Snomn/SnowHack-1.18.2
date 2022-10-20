package net.snomn.snowhack.hack;

import net.snomn.snowhack.hack.misc.AutoFish;
import net.snomn.snowhack.hack.misc.BoatFly;
import net.snomn.snowhack.hack.movement.*;

import java.util.ArrayList;
import java.util.List;

public class HackManager {

    public static final HackManager INSTANCE = new HackManager();
    private List<Hack> hacks = new ArrayList<>();

    public HackManager() {
        addHacks();
    }

    public List<Hack> getHacks() {
        return hacks;
    }

    public List<Hack> getEnabledHacks() {
        List<Hack> enabled = new ArrayList<>();
        for (Hack hack : hacks) {
            if(hack.isEnabled()) enabled.add(hack);
        }

        return enabled;
    }

    private void addHacks() {
        hacks.add(new Flight());
        hacks.add(new AutoFish());
        hacks.add(new Sprint());
        hacks.add(new BoatFly());
    }
}
