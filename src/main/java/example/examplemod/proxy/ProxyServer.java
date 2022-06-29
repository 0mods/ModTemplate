package example.examplemod.proxy;

import example.examplemod.Examplemod;
import liquid.network.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ProxyServer implements Direction {
    @Override
    public void init() {

    }

    @Override
    public boolean clientSide() {
        return false;
    }

    @Override
    public Level clientLevel() {
        Examplemod.Log.error("ProxyServer.clientLevel() s called on server side.");
        throw new IllegalStateException("This is a not server-side method!");
    }

    @Override
    public Player clientPlayer() {
        Examplemod.Log.error("ProxyServer.clientPlayer() is called on server side.");
        throw new IllegalStateException("Not on the client!");
    }
}
