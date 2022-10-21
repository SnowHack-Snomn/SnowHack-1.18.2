package net.snomn.snowhack.ui.screens.clickgui.setting;

import net.minecraft.client.util.math.MatrixStack;
import net.snomn.snowhack.hack.settings.NumberSetting;
import net.snomn.snowhack.hack.settings.Setting;
import net.snomn.snowhack.ui.screens.clickgui.HackButton;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Slider extends Component {

    public NumberSetting numSet = (NumberSetting)setting;

    public Slider(Setting setting, HackButton parent, int offset) {
        super(setting, parent, offset);
        this.numSet = (NumberSetting)setting;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {

    }

    private double roundToPlace(double value, int place) {
        if (place < 0) {
            return value;
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(place, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}