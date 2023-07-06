package io.github.megalogaminguk.megalosmetallurgy.init;

import io.github.megalogaminguk.megalosmetallurgy.init.tiers.ModArmourMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmourMaterialInit {
    public static final ModArmourMaterial ALUMINIUM = new ModArmourMaterial(
            new int[]{500, 1200, 600, 400},
            new int[]{11, 16, 15, 13},
            20,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.ALUMINIUM_INGOT::get),
            "aluminium",
            0.25f,
            0.15f
            );
    public static final ModArmourMaterial SILVER = new ModArmourMaterial(
            new int[]{500, 1200, 600, 400},
            new int[]{11, 16, 15, 13},
            20,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.SILVER_INGOT::get),
            "silver",
            0.25f,
            0.15f
    );
    public static final ModArmourMaterial TITANIUM = new ModArmourMaterial(
            new int[]{500, 1200, 600, 400},
            new int[]{11, 16, 15, 13},
            20,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ModItems.TITANIUM_INGOT::get),
            "titanium",
            0.25f,
            0.15f
    );
}
