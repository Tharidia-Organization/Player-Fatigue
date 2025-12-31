package com.THproject.tharidia_things;

import com.THproject.tharidia_things.config.FatigueConfig;
import com.THproject.tharidia_things.fatigue.FatigueAttachments;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(TharidiaThings.MODID)
public class TharidiaThings {
    public static final String MODID = "tharidiathings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TharidiaThings(IEventBus modEventBus, ModContainer modContainer) {
        // Register attachments
        FatigueAttachments.ATTACHMENT_TYPES.register(modEventBus);
        // Register config
        modContainer.registerConfig(ModConfig.Type.COMMON, FatigueConfig.SPEC);
        
        LOGGER.info("Tharidia Things - Fatigue System Loaded");
    }

}
