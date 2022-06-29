package example.examplemod;

import com.mojang.logging.LogUtils;
import example.examplemod.config.ClientConfig;
import example.examplemod.config.CommonConfig;
import example.examplemod.config.ServerConfig;
import liquid.config.ExtendableConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(Examplemod.ModId)
public class Examplemod {
    public static final String ModId = "examplemod";

    public static final Logger Log = LogUtils.getLogger();

    public static ClientConfig CONFIG;
    public static CommonConfig CONFIG0;
    public static ServerConfig CONFIG1;

    public Examplemod() {
        CONFIG = ExtendableConfig.of(ModConfig.Type.CLIENT, ClientConfig.class);
        CONFIG0 = ExtendableConfig.of(ModConfig.Type.COMMON, CommonConfig.class);
        CONFIG1 = ExtendableConfig.of(ModConfig.Type.SERVER, ServerConfig.class);
    }

}
