package ca.slackinjack.ParticleControl;

import ca.slackinjack.ParticleControl.config.ConfigLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

@Mod(modid = ParticleControl.MODID, guiFactory = "ca.slackinjack.particlecontrol.config.GUIConfigFactory", acceptedMinecraftVersions = "1.8.9")

public class ParticleControl {

    public static final String MODID = "particlecontrol";
    public Minecraft mc = Minecraft.getMinecraft();

    private static HashMap<Integer, IParticleFactory> particleFactories;
    private static Map<Integer, IParticleFactory> particleTypes;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigLoader.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        particleFactories = new HashMap<>();
        particleTypes = ReflectionHelper.getPrivateValue(EffectRenderer.class, mc.effectRenderer, 6);
        ConfigLoader.init(event);
    }

    public void toggleParticles() {
        for (Particle p : getParticleList()) {
            if (!p.enabled) {
                if (!particleFactories.containsKey(p.id)) {
                    particleFactories.put(p.id, particleTypes.get(p.id));
                    mc.effectRenderer.registerParticle(p.id, null);
                    System.out.println(p.id + " was added");
                }
            }
            if (p.enabled) {
                if (particleFactories.get(p.id) != null || particleFactories.get(p.id) == null && particleFactories.containsKey(p.id)) {
                    mc.effectRenderer.registerParticle(p.id, particleFactories.remove(p.id));
                    System.out.println(p.id + " was removed");
                }
            }
        }
    }

    public List<Particle> getParticleList() {
        return ConfigLoader.particles;
    }
}
