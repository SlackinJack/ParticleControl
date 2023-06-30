package ca.slackinjack.ParticleControl.config;

import java.util.ArrayList;
import java.util.List;
import ca.slackinjack.ParticleControl.Particle;
import ca.slackinjack.ParticleControl.ParticleControl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigLoader {

    public static Configuration config;
    public static boolean enabled;
    public static boolean e0;
    public static boolean e1;
    public static boolean e2;
    public static boolean e3;
    public static boolean e4;
    public static boolean e5;
    public static boolean e6;
    public static boolean e7;
    public static boolean e8;
    public static boolean e9;
    public static boolean e10;
    public static boolean e11;
    public static boolean e12;
    public static boolean e13;
    public static boolean e14;
    public static boolean e15;
    public static boolean e16;
    public static boolean e17;
    public static boolean e18;
    public static boolean e19;
    public static boolean e20;
    public static boolean e21;
    public static boolean e22;
    public static boolean e23;
    public static boolean e24;
    public static boolean e25;
    public static boolean e26;
    public static boolean e27;
    public static boolean e28;
    public static boolean e29;
    public static boolean e30;
    public static boolean e31;
    public static boolean e32;
    public static boolean e33;
    public static boolean e34;
    public static boolean e35;
    public static boolean e36;
    public static boolean e37;
    public static boolean e38;
    public static boolean e39;
    public static boolean e40;
    public static boolean e41;
    public static Particle p0;
    public static Particle p1;
    public static Particle p2;
    public static Particle p3;
    public static Particle p4;
    public static Particle p5;
    public static Particle p6;
    public static Particle p7;
    public static Particle p8;
    public static Particle p9;
    public static Particle p10;
    public static Particle p11;
    public static Particle p12;
    public static Particle p13;
    public static Particle p14;
    public static Particle p15;
    public static Particle p16;
    public static Particle p17;
    public static Particle p18;
    public static Particle p19;
    public static Particle p20;
    public static Particle p21;
    public static Particle p22;
    public static Particle p23;
    public static Particle p24;
    public static Particle p25;
    public static Particle p26;
    public static Particle p27;
    public static Particle p28;
    public static Particle p29;
    public static Particle p30;
    public static Particle p31;
    public static Particle p32;
    public static Particle p33;
    public static Particle p34;
    public static Particle p35;
    public static Particle p36;
    public static Particle p37;
    public static Particle p38;
    public static Particle p39;
    public static Particle p40;
    public static Particle p41;
    public static List<Particle> particles = new ArrayList<>();

    public static void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();
        initParticleList();
        MinecraftForge.EVENT_BUS.register(new ConfigLoader());
    }

    public static void init(FMLInitializationEvent event) {
        ParticleControl pc = new ParticleControl();
        pc.toggleParticles();
    }

    public static void syncConfig() {
        try {
            config.save();
            config.load();

            Property enabledProp = config.get(Configuration.CATEGORY_GENERAL, "Enable ParticleControl", false, "Enable or disable the mod");
            Property e0Prop = config.get(Configuration.CATEGORY_GENERAL, "Explosion - Normal", true, "Enable or disable this particle");
            Property e1Prop = config.get(Configuration.CATEGORY_GENERAL, "Explosion - Large", true, "Toggle to turn it on or off");
            Property e2Prop = config.get(Configuration.CATEGORY_GENERAL, "Explosion - Huge", true, "Toggle to turn it on or off");
            Property e3Prop = config.get(Configuration.CATEGORY_GENERAL, "Fireworks Spark", true, "Toggle to turn it on or off");
            Property e4Prop = config.get(Configuration.CATEGORY_GENERAL, "Water Bubble", true, "Toggle to turn it on or off");
            Property e5Prop = config.get(Configuration.CATEGORY_GENERAL, "Water Splash", true, "Toggle to turn it on or off");
            Property e6Prop = config.get(Configuration.CATEGORY_GENERAL, "Swimming Fish (Water Wake)", true, "Toggle to turn it on or off");
            Property e7Prop = config.get(Configuration.CATEGORY_GENERAL, "Underwater (Suspended)", true, "Toggle to turn it on or off");
            Property e8Prop = config.get(Configuration.CATEGORY_GENERAL, "Underground (Suspended Depth)", true, "Toggle to turn it on or off");
            Property e9Prop = config.get(Configuration.CATEGORY_GENERAL, "Critical", true, "Toggle to turn it on or off");
            Property e10Prop = config.get(Configuration.CATEGORY_GENERAL, "Critical - Enchanted (Magic)", true, "Toggle to turn it on or off");
            Property e11Prop = config.get(Configuration.CATEGORY_GENERAL, "Smoke - Normal", true, "Toggle to turn it on or off");
            Property e12Prop = config.get(Configuration.CATEGORY_GENERAL, "Smoke - Large", true, "Toggle to turn it on or off");
            Property e13Prop = config.get(Configuration.CATEGORY_GENERAL, "Splash/Lingering Potion (Spell)", true, "Toggle to turn it on or off");
            Property e14Prop = config.get(Configuration.CATEGORY_GENERAL, "Splash Potion (Spell - Instant)", true, "Toggle to turn it on or off");
            Property e15Prop = config.get(Configuration.CATEGORY_GENERAL, "Potion Status (Spell - Mob)", true, "Toggle to turn it on or off");
            Property e16Prop = config.get(Configuration.CATEGORY_GENERAL, "Beacon Status (Spell - Mob Ambient)", true, "Toggle to turn it on or off");
            Property e17Prop = config.get(Configuration.CATEGORY_GENERAL, "Witch Potion (Spell - Witch)", true, "Toggle to turn it on or off");
            Property e18Prop = config.get(Configuration.CATEGORY_GENERAL, "Drip - Water", true, "Toggle to turn it on or off");
            Property e19Prop = config.get(Configuration.CATEGORY_GENERAL, "Drip - Lava", true, "Toggle to turn it on or off");
            Property e20Prop = config.get(Configuration.CATEGORY_GENERAL, "Villager - Angry", true, "Toggle to turn it on or off");
            Property e21Prop = config.get(Configuration.CATEGORY_GENERAL, "Villager - Happy", true, "Toggle to turn it on or off");
            Property e22Prop = config.get(Configuration.CATEGORY_GENERAL, "Mycelium (Town Aura)", true, "Toggle to turn it on or off");
            Property e23Prop = config.get(Configuration.CATEGORY_GENERAL, "Note", true, "Toggle to turn it on or off");
            Property e24Prop = config.get(Configuration.CATEGORY_GENERAL, "Portal", true, "Toggle to turn it on or off");
            Property e25Prop = config.get(Configuration.CATEGORY_GENERAL, "Enchantment Table Letters", true, "Toggle to turn it on or off");
            Property e26Prop = config.get(Configuration.CATEGORY_GENERAL, "Flame", true, "Toggle to turn it on or off");
            Property e27Prop = config.get(Configuration.CATEGORY_GENERAL, "Lava", true, "Toggle to turn it on or off");
            Property e28Prop = config.get(Configuration.CATEGORY_GENERAL, "Footsteps", true, "Toggle to turn it on or off");
            Property e29Prop = config.get(Configuration.CATEGORY_GENERAL, "Cloud", true, "Toggle to turn it on or off");
            Property e30Prop = config.get(Configuration.CATEGORY_GENERAL, "Redstone", true, "Toggle to turn it on or off");
            Property e31Prop = config.get(Configuration.CATEGORY_GENERAL, "Snowball", true, "Toggle to turn it on or off");
            Property e32Prop = config.get(Configuration.CATEGORY_GENERAL, "Snow Shovel", true, "Toggle to turn it on or off");
            Property e33Prop = config.get(Configuration.CATEGORY_GENERAL, "Slime", true, "Toggle to turn it on or off");
            Property e34Prop = config.get(Configuration.CATEGORY_GENERAL, "Heart", true, "Toggle to turn it on or off");
            Property e35Prop = config.get(Configuration.CATEGORY_GENERAL, "Barrier", true, "Toggle to turn it on or off");
            Property e36Prop = config.get(Configuration.CATEGORY_GENERAL, "Breaking Tool (Item Crack)", true, "Toggle to turn it on or off");
            Property e37Prop = config.get(Configuration.CATEGORY_GENERAL, "Breaking Block (Block Crack)", true, "Toggle to turn it on or off");
            Property e38Prop = config.get(Configuration.CATEGORY_GENERAL, "Hard Fall (Block Dust)", true, "Toggle to turn it on or off");
            Property e39Prop = config.get(Configuration.CATEGORY_GENERAL, "Rain Splash (Water Drop)", true, "Toggle to turn it on or off");
            Property e40Prop = config.get(Configuration.CATEGORY_GENERAL, "Item Pickup Animation (Item Take)", true, "Toggle to turn it on or off");
            Property e41Prop = config.get(Configuration.CATEGORY_GENERAL, "Elder Guardian Status (Mob Appearance)", true, "Toggle to turn it on or off");

            enabled = enabledProp.getBoolean();
            e0 = e0Prop.getBoolean();
            e1 = e1Prop.getBoolean();
            e2 = e2Prop.getBoolean();
            e3 = e3Prop.getBoolean();
            e4 = e4Prop.getBoolean();
            e5 = e5Prop.getBoolean();
            e6 = e6Prop.getBoolean();
            e7 = e7Prop.getBoolean();
            e8 = e8Prop.getBoolean();
            e9 = e9Prop.getBoolean();
            e10 = e10Prop.getBoolean();
            e11 = e11Prop.getBoolean();
            e12 = e12Prop.getBoolean();
            e13 = e13Prop.getBoolean();
            e14 = e14Prop.getBoolean();
            e15 = e15Prop.getBoolean();
            e16 = e16Prop.getBoolean();
            e17 = e17Prop.getBoolean();
            e18 = e18Prop.getBoolean();
            e19 = e19Prop.getBoolean();
            e20 = e20Prop.getBoolean();
            e21 = e21Prop.getBoolean();
            e22 = e22Prop.getBoolean();
            e23 = e23Prop.getBoolean();
            e24 = e24Prop.getBoolean();
            e25 = e25Prop.getBoolean();
            e26 = e26Prop.getBoolean();
            e27 = e27Prop.getBoolean();
            e28 = e28Prop.getBoolean();
            e29 = e29Prop.getBoolean();
            e30 = e30Prop.getBoolean();
            e31 = e31Prop.getBoolean();
            e32 = e32Prop.getBoolean();
            e33 = e33Prop.getBoolean();
            e34 = e34Prop.getBoolean();
            e35 = e35Prop.getBoolean();
            e36 = e36Prop.getBoolean();
            e37 = e37Prop.getBoolean();
            e38 = e38Prop.getBoolean();
            e39 = e39Prop.getBoolean();
            e40 = e40Prop.getBoolean();
            e41 = e41Prop.getBoolean();
        } catch (Exception e) {
        }
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equals(ParticleControl.MODID)) {
            if (config.hasChanged()) {
                ParticleControl pc = new ParticleControl();
                syncConfig(); //wtF??
                updateParticleList();
                pc.toggleParticles();
            }
        }
    }

    public static void initParticleList() {
        setParticles();

        particles.add(0, p0);
        particles.add(1, p1);
        particles.add(2, p2);
        particles.add(3, p3);
        particles.add(4, p4);
        particles.add(5, p5);
        particles.add(6, p6);
        particles.add(7, p7);
        particles.add(8, p8);
        particles.add(9, p9);
        particles.add(10, p10);
        particles.add(11, p11);
        particles.add(12, p12);
        particles.add(13, p13);
        particles.add(14, p14);
        particles.add(15, p15);
        particles.add(16, p16);
        particles.add(17, p17);
        particles.add(18, p18);
        particles.add(19, p19);
        particles.add(20, p20);
        particles.add(21, p21);
        particles.add(22, p22);
        particles.add(23, p23);
        particles.add(24, p24);
        particles.add(25, p25);
        particles.add(26, p26);
        particles.add(27, p27);
        particles.add(28, p28);
        particles.add(29, p29);
        particles.add(30, p30);
        particles.add(31, p31);
        particles.add(32, p32);
        particles.add(33, p33);
        particles.add(34, p34);
        particles.add(35, p35);
        particles.add(36, p36);
        particles.add(37, p37);
        particles.add(38, p38);
        particles.add(39, p39);
        particles.add(40, p40);
        particles.add(41, p41);
    }

    public static void updateParticleList() {
        setParticles();

        particles.set(0, p0);
        particles.set(1, p1);
        particles.set(2, p2);
        particles.set(3, p3);
        particles.set(4, p4);
        particles.set(5, p5);
        particles.set(6, p6);
        particles.set(7, p7);
        particles.set(8, p8);
        particles.set(9, p9);
        particles.set(10, p10);
        particles.set(11, p11);
        particles.set(12, p12);
        particles.set(13, p13);
        particles.set(14, p14);
        particles.set(15, p15);
        particles.set(16, p16);
        particles.set(17, p17);
        particles.set(18, p18);
        particles.set(19, p19);
        particles.set(20, p20);
        particles.set(21, p21);
        particles.set(22, p22);
        particles.set(23, p23);
        particles.set(24, p24);
        particles.set(25, p25);
        particles.set(26, p26);
        particles.set(27, p27);
        particles.set(28, p28);
        particles.set(29, p29);
        particles.set(30, p30);
        particles.set(31, p31);
        particles.set(32, p32);
        particles.set(33, p33);
        particles.set(34, p34);
        particles.set(35, p35);
        particles.set(36, p36);
        particles.set(37, p37);
        particles.set(38, p38);
        particles.set(39, p39);
        particles.set(40, p40);
        particles.set(41, p41);
    }

    public static void setParticles() {
        p0 = new Particle(0, e0);
        p1 = new Particle(1, e1);
        p2 = new Particle(2, e2);
        p3 = new Particle(3, e3);
        p4 = new Particle(4, e4);
        p5 = new Particle(5, e5);
        p6 = new Particle(6, e6);
        p7 = new Particle(7, e7);
        p8 = new Particle(8, e8);
        p9 = new Particle(9, e9);
        p10 = new Particle(10, e10);
        p11 = new Particle(11, e11);
        p12 = new Particle(12, e12);
        p13 = new Particle(13, e13);
        p14 = new Particle(14, e14);
        p15 = new Particle(15, e15);
        p16 = new Particle(16, e16);
        p17 = new Particle(17, e17);
        p18 = new Particle(18, e18);
        p19 = new Particle(19, e19);
        p20 = new Particle(20, e20);
        p21 = new Particle(21, e21);
        p22 = new Particle(22, e22);
        p23 = new Particle(23, e23);
        p24 = new Particle(24, e24);
        p25 = new Particle(25, e25);
        p26 = new Particle(26, e26);
        p27 = new Particle(27, e27);
        p28 = new Particle(28, e28);
        p29 = new Particle(29, e29);
        p30 = new Particle(30, e30);
        p31 = new Particle(31, e31);
        p32 = new Particle(32, e32);
        p33 = new Particle(33, e33);
        p34 = new Particle(34, e34);
        p35 = new Particle(35, e35);
        p36 = new Particle(36, e36);
        p37 = new Particle(37, e37);
        p38 = new Particle(38, e38);
        p39 = new Particle(39, e39);
        p40 = new Particle(40, e40);
        p41 = new Particle(41, e41);
    }
}
