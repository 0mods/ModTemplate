package example.examplemod.config;

import liquid.config.ExtendableConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ServerConfig extends ExtendableConfig {
    public final ForgeConfigSpec.BooleanValue enable_example_feature;

    public ServerConfig(ForgeConfigSpec.Builder b) {
        super(b);
        enable_example_feature = b.define("enable_example_feature", true);
    }

    @Override
    public void reloadContext(ModConfigEvent modConfigEvent) {

    }
}
