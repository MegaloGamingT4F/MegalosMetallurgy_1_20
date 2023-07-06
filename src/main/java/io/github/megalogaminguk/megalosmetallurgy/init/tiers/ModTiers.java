package io.github.megalogaminguk.megalosmetallurgy.init.tiers;

import io.github.megalogaminguk.megalosmetallurgy.init.ModItems;
import io.github.megalogaminguk.megalosmetallurgy.init.ModTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ALUMINIUM = new ForgeTier(
            2,150,1.5f,7,20, ModTags.NEEDS_ALUMINIUM_TOOL,()-> Ingredient.of(ModItems.ALUMINIUM_INGOT::get)
    );
    public static final ForgeTier SILVER = new ForgeTier(
            3,150,1.5f,7,20, ModTags.NEEDS_SILVER_TOOL,()-> Ingredient.of(ModItems.SILVER_INGOT::get)
    );
    public static final ForgeTier TITANIUM = new ForgeTier(
            4,150,1.5f,7,20, ModTags.NEEDS_TITANIUM_TOOL,()-> Ingredient.of(ModItems.TITANIUM_INGOT::get)
    );
}
