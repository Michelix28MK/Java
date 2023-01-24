package minecraft.plugin;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * plug java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("plug");

  public void onEnable() //esegui quando attivo
  {
    LOGGER.info("plug enabled");
  }

  public void onDisable() //esegui quando spento
  {
    LOGGER.info("plug disabled");
  }
}
