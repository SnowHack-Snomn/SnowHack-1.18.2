package net.snomn.testmod.hack;

import net.minecraft.client.MinecraftClient;

public class Hack {

    private String name;
    private String description;
    private Category category;
    private int key;
    private boolean enabled;

    protected MinecraftClient mc = MinecraftClient.getInstance();

    public Hack(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public void toggle() {
        this.enabled = !this.enabled;

        if (enabled) onEnable();
        else onDisable();
    }

    public void onEnable() {

    }

    public void onDisable() {

    }

    public void onTick() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;

        if (enabled) onEnable();
        else onDisable();
    }

    public enum Category {
        COMBAT,
        MOVEMENT,
        RENDER,
        MISC
    }
}
