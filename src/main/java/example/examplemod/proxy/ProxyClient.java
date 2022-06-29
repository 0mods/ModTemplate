package example.examplemod.proxy;

import liquid.network.Direction;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ProxyClient implements Direction {
    @Override
    public void init() {

    }

    @Override
    public boolean clientSide() {
        return true;
    }

    @Override
    public Level clientLevel() {
        return Minecraft.getInstance().level;
    }

    @Override
    public Player clientPlayer() {
        return Minecraft.getInstance().player;
    }
}
