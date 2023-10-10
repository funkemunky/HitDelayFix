package dev.funkemunky;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class HitDelayFixAddon extends LabyAddon<HitDelayFixConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.logger().info("Enabled HitDelayFix");
  }

  @Override
  protected Class<HitDelayFixConfiguration> configurationClass() {
    return HitDelayFixConfiguration.class;
  }
}
