package me.colingrimes.nightclone.command.nightvision;

import me.colingrimes.midnight.command.Command;
import me.colingrimes.midnight.command.handler.util.ArgumentList;
import me.colingrimes.midnight.command.handler.util.CommandProperties;
import me.colingrimes.midnight.command.handler.util.Sender;
import me.colingrimes.nightclone.NightClone;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public class NightVision implements Command<NightClone> {

    private final Map<Player, Boolean> nightVision = new HashMap<>();

    @Override
    public void execute(@Nonnull NightClone plugin, @Nonnull Sender sender, @Nonnull ArgumentList args) {
        Player player = sender.player();
        if (nightVision.containsKey(player)) {
            nightVision.remove(player);
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        } else {
            nightVision.put(player, true);
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0));
        }
    }

    @Override
    public void configureProperties(@Nonnull CommandProperties properties) {
        properties.setAliases("nv");
        properties.setPlayerRequired(true);
    }
}
