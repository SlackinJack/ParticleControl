package ca.slackinjack.ParticleControl.config;

import ca.slackinjack.ParticleControl.ParticleControl;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ConfigGUI extends GuiConfig {

    public ConfigGUI(GuiScreen parent) {
        super(parent, new ConfigElement(ConfigLoader.config.getCategory(ConfigLoader.config.CATEGORY_GENERAL)).getChildElements(), ParticleControl.MODID, false, false, "ParticleControl Config");
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        super.actionPerformed(button);
    }
}
