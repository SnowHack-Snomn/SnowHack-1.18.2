package net.snomn.snowhack.ui.screens.clickgui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.snomn.snowhack.hack.Hack.Category;

import java.awt.*;

public class Frame {

    public int x, y, width, height;
    public Category category;

    public boolean dragging;

    private MinecraftClient mc = MinecraftClient.getInstance();

    public Frame(Category category, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dragging = false;
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        DrawableHelper.fill(matrices, x, y, x + width, y + height, -1);
        mc.textRenderer.drawWithShadow(matrices, category.name(), x + 2, y + 2, Color.BLACK.getRGB());
    }

    public void mouseClicked(double mouseX, double mouseY, int button) {

    }
}
