package io.github.megalogaminguk.megalosmetallurgy.init;

import io.github.megalogaminguk.megalosmetallurgy.MegalosMetallurgy;
import io.github.megalogaminguk.megalosmetallurgy.init.tiers.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MegalosMetallurgy.MODID);

//Ingots
public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ANTIMONY_INGOT = ITEMS.register("antimony_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARSENIC_INGOT = ITEMS.register("arsenic_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BARIUM_INGOT = ITEMS.register("barium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BERYLLIUM_INGOT = ITEMS.register("beryllium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CAESIUM_INGOT = ITEMS.register("caesium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CALCIUM_INGOT = ITEMS.register("calcium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CINNABAR_INGOT = ITEMS.register("cinnabar_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("coablt_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GERMANIUM_INGOT = ITEMS.register("germanium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GALLIUM_INGOT = ITEMS.register("gallium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> HAFNIUM_INGOT = ITEMS.register("hafnium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> INDIUM_INGOT = ITEMS.register("indium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MOLYBDENUM_INGOT = ITEMS.register("molybdenum_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NIOBIUM_INGOT = ITEMS.register("niobium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PHOSPHORUS_INGOT = ITEMS.register("phosphorus_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> POTASSIUM_INGOT = ITEMS.register("potassium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHENIUM_INGOT = ITEMS.register("rhenium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHODIUM_INGOT = ITEMS.register("rhodium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUBIDIUM_INGOT = ITEMS.register("rubidium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUTHENIUM_INGOT = ITEMS.register("ruthenium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SCANDIUM_INGOT = ITEMS.register("scandium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SELENIUM_INGOT = ITEMS.register("selenium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SODIUM_INGOT = ITEMS.register("sodium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> STRONTIUM_INGOT = ITEMS.register("strontium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TANTALUM_INGOT = ITEMS.register("tantalum_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TECHNETIUM_INGOT = ITEMS.register("technetium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TELLURIUM_INGOT = ITEMS.register("tellurium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> THALLIUM_INGOT = ITEMS.register("thallium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> YTTRIUM_INGOT = ITEMS.register("yttrium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZIRCONIUM_INGOT = ITEMS.register("zirconium_ingot",
            ()-> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

//Nugget
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
        ()-> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ANTIMONY_NUGGET = ITEMS.register("antimony_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARSENIC_NUGGET = ITEMS.register("arsenic_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BARIUM_NUGGET = ITEMS.register("barium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BERYLLIUM_NUGGET = ITEMS.register("beryllium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CADMIUM_NUGGET = ITEMS.register("cadmium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CAESIUM_NUGGET = ITEMS.register("caesium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CALCIUM_NUGGET = ITEMS.register("calcium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CINNABAR_NUGGET = ITEMS.register("cinnabar_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("coablt_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GERMANIUM_NUGGET = ITEMS.register("germanium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GALLIUM_NUGGET = ITEMS.register("gallium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> HAFNIUM_NUGGET = ITEMS.register("hafnium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> INDIUM_NUGGET = ITEMS.register("indium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LITHIUM_NUGGET = ITEMS.register("lithium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MANGANESE_NUGGET = ITEMS.register("manganese_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MOLYBDENUM_NUGGET = ITEMS.register("molybdenum_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NIOBIUM_NUGGET = ITEMS.register("niobium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PHOSPHORUS_NUGGET = ITEMS.register("phosphorus_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> POTASSIUM_NUGGET = ITEMS.register("potassium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHENIUM_NUGGET = ITEMS.register("rhenium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHODIUM_NUGGET = ITEMS.register("rhodium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUBIDIUM_NUGGET = ITEMS.register("rubidium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUTHENIUM_NUGGET = ITEMS.register("ruthenium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SCANDIUM_NUGGET = ITEMS.register("scandium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SELENIUM_NUGGET = ITEMS.register("selenium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SODIUM_NUGGET = ITEMS.register("sodium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> STRONTIUM_NUGGET = ITEMS.register("strontium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TANTALUM_NUGGET = ITEMS.register("tantalum_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TECHNETIUM_NUGGET = ITEMS.register("technetium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TELLURIUM_NUGGET = ITEMS.register("tellurium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> THALLIUM_NUGGET = ITEMS.register("thallium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> VANADIUM_NUGGET = ITEMS.register("vanadium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> YTTRIUM_NUGGET = ITEMS.register("yttrium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZIRCONIUM_NUGGET = ITEMS.register("zirconium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
// Dust
public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust",
        ()-> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ANTIMONY_DUST = ITEMS.register("antimony_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ARSENIC_DUST = ITEMS.register("arsenic_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BARIUM_DUST = ITEMS.register("barium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BERYLLIUM_DUST = ITEMS.register("beryllium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BISMUTH_DUST = ITEMS.register("bismuth_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CADMIUM_DUST = ITEMS.register("cadmium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CAESIUM_DUST = ITEMS.register("caesium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CALCIUM_DUST = ITEMS.register("calcium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("coablt_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GERMANIUM_DUST = ITEMS.register("germanium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GALLIUM_DUST = ITEMS.register("gallium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> HAFNIUM_DUST = ITEMS.register("hafnium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> INDIUM_DUST = ITEMS.register("indium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRIDIUM_DUST = ITEMS.register("iridium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> LITHIUM_DUST = ITEMS.register("lithium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MANGANESE_DUST = ITEMS.register("manganese_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MOLYBDENUM_DUST = ITEMS.register("molybdenum_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NIOBIUM_DUST = ITEMS.register("niobium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PALLADIUM_DUST = ITEMS.register("palladium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PHOSPHORUS_DUST = ITEMS.register("phosphorus_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> POTASSIUM_DUST = ITEMS.register("potassium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHENIUM_DUST = ITEMS.register("rhenium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RHODIUM_DUST = ITEMS.register("rhodium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUBIDIUM_DUST = ITEMS.register("rubidium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RUTHENIUM_DUST = ITEMS.register("ruthenium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SCANDIUM_DUST = ITEMS.register("scandium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SELENIUM_DUST = ITEMS.register("selenium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILICON_DUST = ITEMS.register("silicon_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SODIUM_DUST = ITEMS.register("sodium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> STRONTIUM_DUST = ITEMS.register("strontium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TANTALUM_DUST = ITEMS.register("tantalum_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TECHNETIUM_DUST = ITEMS.register("technetium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TELLURIUM_DUST = ITEMS.register("tellurium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> THALLIUM_DUST = ITEMS.register("thallium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> VANADIUM_DUST = ITEMS.register("vanadium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> YTTRIUM_DUST = ITEMS.register("yttrium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ZIRCONIUM_DUST = ITEMS.register("zirconium_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
//Raw
public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
        ()-> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_ANTIMONY = ITEMS.register("raw_antimony",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_ARSENIC = ITEMS.register("raw_arsenic",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_BARIUM = ITEMS.register("raw_barium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_BERYLLIUM = ITEMS.register("raw_beryllium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_CADMIUM = ITEMS.register("raw_cadmium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_CAESIUM = ITEMS.register("raw_caesium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_CALCIUM = ITEMS.register("raw_calcium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_coablt",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_GERMANIUM = ITEMS.register("raw_germanium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_GALLIUM = ITEMS.register("raw_gallium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_HAFNIUM = ITEMS.register("raw_hafnium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_INDIUM = ITEMS.register("raw_indium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_MOLYBDENUM = ITEMS.register("raw_molybdenum",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_NIOBIUM = ITEMS.register("raw_niobium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_PHOSPHORUS = ITEMS.register("raw_phosphorus",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_POTASSIUM = ITEMS.register("raw_potassium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_RHENIUM = ITEMS.register("raw_rhenium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_RHODIUM = ITEMS.register("raw_rhodium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_RUBIDIUM = ITEMS.register("raw_rubidium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_RUTHENIUM = ITEMS.register("raw_ruthenium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SCANDIUM = ITEMS.register("raw_scandium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SELENIUM = ITEMS.register("raw_selenium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SODIUM = ITEMS.register("raw_sodium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_STRONTIUM = ITEMS.register("raw_strontium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TANTALUM = ITEMS.register("raw_tantalum",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TECHNETIUM = ITEMS.register("raw_technetium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TELLURIUM = ITEMS.register("raw_tellurium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_THALLIUM = ITEMS.register("raw_thallium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_YTTRIUM = ITEMS.register("raw_yttrium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_ZIRCONIUM = ITEMS.register("raw_zirconium",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

//ItemBlocks
    public static final RegistryObject<BlockItem> ALUMINIUM_ORE_ITEM = ITEMS.register("aluminium_ore",() -> new BlockItem(ModBlocks.ALUMINIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_ANTIMONY_ORE_ITEM = ITEMS.register("antimony_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_ANTIMONY_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_ARSENIC_ORE_ITEM = ITEMS.register("arsenic_ore",() -> new BlockItem(ModBlocks.NETHERRACK_ARSENIC_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_BARIUM_ORE_ITEM = ITEMS.register("barium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_BARIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_BERYLLIUM_ORE_ITEM = ITEMS.register("beryllium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_BERYLLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_BISMUTH_ORE_ITEM = ITEMS.register("bismuth_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_BISMUTH_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_CADMIUM_ORE_ITEM = ITEMS.register("cadmium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_CADMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_CAESIUM_ORE_ITEM = ITEMS.register("caesium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_CAESIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CALCIUM_ORE_ITEM = ITEMS.register("calcium_ore",() -> new BlockItem(ModBlocks.CALCIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_CHROMIUM_ORE_ITEM = ITEMS.register("chromium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CINNABAR_ORE_ITEM = ITEMS.register("cinnabar_ore",() -> new BlockItem(ModBlocks.CINNABAR_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COBALT_ORE_ITEM = ITEMS.register("cobalt_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_COBALT_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_GERMANIUM_ORE_ITEM = ITEMS.register("germanium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_GERMANIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_GALLIUM_ORE_ITEM = ITEMS.register("gallium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_GALLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_HAFNIUM_ORE_ITEM = ITEMS.register("hafnium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_HAFNIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_INDIUM_ORE_ITEM = ITEMS.register("indium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_INDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_IRIDIUM_ORE_ITEM = ITEMS.register("iridium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore",() -> new BlockItem(ModBlocks.LEAD_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_LITHIUM_ORE_ITEM = ITEMS.register("lithium_ore",() -> new BlockItem(ModBlocks.END_LITHIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> MAGNESIUM_ORE_ITEM = ITEMS.register("magnesium_ore",() -> new BlockItem(ModBlocks.MAGNESIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MANGANESE_ORE_ITEM = ITEMS.register("manganese_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_MANGANESE_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MOLYBDENUM_ORE_ITEM = ITEMS.register("molybdenum_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore",() -> new BlockItem(ModBlocks.NICKEL_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_NIOBIUM_ORE_ITEM = ITEMS.register("niobium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_NIOBIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> OSMIUM_ORE_ITEM = ITEMS.register("osmium_ore",() -> new BlockItem(ModBlocks.OSMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_PALLADIUM_ORE_ITEM = ITEMS.register("palladium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_PALLADIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_PHOSPHORUS_ORE_ITEM = ITEMS.register("phosphorus_ore",() -> new BlockItem(ModBlocks.NETHERRACK_PHOSPHORUS_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore",() -> new BlockItem(ModBlocks.PLATINUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_POTASSIUM_ORE_ITEM = ITEMS.register("potassium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_POTASSIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_RHENIUM_ORE_ITEM = ITEMS.register("rhenium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_RHENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_RHODIUM_ORE_ITEM = ITEMS.register("rhodium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_RHODIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_RUBIDIUM_ORE_ITEM = ITEMS.register("rubidium_ore",() -> new BlockItem(ModBlocks.END_RUBIDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_RUTHENIUM_ORE_ITEM = ITEMS.register("ruthenium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_RUTHENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_SCANDIUM_ORE_ITEM = ITEMS.register("scandium_ore",() -> new BlockItem(ModBlocks.END_SCANDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_SELENIUM_ORE_ITEM = ITEMS.register("selenium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_SELENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILICON_ORE_ITEM = ITEMS.register("silicon_ore",() -> new BlockItem(ModBlocks.SILICON_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILVER_ORE_ITEM = ITEMS.register("silver_ore",() -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SODIUM_ORE_ITEM = ITEMS.register("sodium_ore",() -> new BlockItem(ModBlocks.SODIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STRONTIUM_ORE_ITEM = ITEMS.register("strontium_ore",() -> new BlockItem(ModBlocks.END_STRONTIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_TANTALUM_ORE_ITEM = ITEMS.register("tantalum_ore",() -> new BlockItem(ModBlocks.END_TANTALUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_TECHNETIUM_ORE_ITEM = ITEMS.register("technetium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_TECHNETIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_TELLURIUM_ORE_ITEM = ITEMS.register("tellurium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_TELLURIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_THALLIUM_ORE_ITEM = ITEMS.register("thallium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_THALLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore",() -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore",() -> new BlockItem(ModBlocks.TITANIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_VANADIUM_ORE_ITEM = ITEMS.register("vanadium_ore",() -> new BlockItem(ModBlocks.END_VANADIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_YTTRIUM_ORE_ITEM = ITEMS.register("yttrium_ore",() -> new BlockItem(ModBlocks.END_YTTRIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZINC_ORE_ITEM = ITEMS.register("zinc_ore",() -> new BlockItem(ModBlocks.ZINC_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZIRCONIUM_ORE_ITEM = ITEMS.register("zirconium_ore",() -> new BlockItem(ModBlocks.ZIRCONIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));

    //Tools
    public static final RegistryObject<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword", () -> new SwordItem(ModTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe", () -> new PickaxeItem(ModTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel", () -> new ShovelItem(ModTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe", () -> new AxeItem(ModTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe", () -> new HoeItem(ModTiers.ALUMINIUM,7,2.5f,new Item.Properties()));

    //Armour
    public static final RegistryObject<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet", () -> new ArmorItem(ArmourMaterialInit.ALUMINIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate", () -> new ArmorItem(ArmourMaterialInit.ALUMINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings", () -> new ArmorItem(ArmourMaterialInit.ALUMINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots", () -> new ArmorItem(ArmourMaterialInit.ALUMINIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
}
