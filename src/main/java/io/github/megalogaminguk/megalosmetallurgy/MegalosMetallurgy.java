package io.github.megalogaminguk.megalosmetallurgy;

import io.github.megalogaminguk.megalosmetallurgy.init.ModBlocks;
import io.github.megalogaminguk.megalosmetallurgy.init.ModItems;
import io.github.megalogaminguk.megalosmetallurgy.init.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MegalosMetallurgy.MODID)
public class MegalosMetallurgy {
    public static final String MODID = "megalosmetallurgy";

    public MegalosMetallurgy(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModTabs.TABS.register(bus);
    }
}
