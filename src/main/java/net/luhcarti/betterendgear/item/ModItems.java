package net.luhcarti.betterendgear.item;

import net.luhcarti.betterendgear.BetterEndGear;
import net.luhcarti.betterendgear.entity.ModEntities;
import net.luhcarti.betterendgear.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterEndGear.MOD_ID);
    public static final RegistryObject<Item> ENDER_RELICS = ITEMS.register("ender_relics",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_FANG = ITEMS.register("dragon_fang",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_BLAZE_SCALE = ITEMS.register("ender_blaze_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_SCALE_HELMET = ITEMS.register("blaze_scale_helmet",
            () -> new ModArmorItem(ModArmorMaterials.BLAZE_SCALE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_SCALE_CHESTPLATE = ITEMS.register("blaze_scale_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLAZE_SCALE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_SCALE_LEGGINGS = ITEMS.register("blaze_scale_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLAZE_SCALE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_SCALE_BOOTS = ITEMS.register("blaze_scale_boots",
            () -> new ArmorItem(ModArmorMaterials.BLAZE_SCALE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DRAGON_FANGED_KARAMBIT = ITEMS.register("dragon_fanged_karambit",
            () -> new SwordItem(ModToolTiers.ENDER_RELIC_TOOLS, 8, -2.5f, new  Item.Properties()));
    public static final RegistryObject<Item> ENDER_PICKAXE = ITEMS.register("ender_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDER_RELIC_TOOLS, 4, -2.9f, new  Item.Properties()));
    public static final RegistryObject<Item> ENDER_AXE = ITEMS.register("ender_axe",
            () -> new AxeItem(ModToolTiers.ENDER_RELIC_TOOLS, 10, -3.1f, new  Item.Properties()));
    public static final RegistryObject<Item> ENDER_SHOVEL = ITEMS.register("ender_shovel",
            () -> new ShovelItem(ModToolTiers.ENDER_RELIC_TOOLS, 6, -3.1f, new  Item.Properties()));
    public static final RegistryObject<Item> ENDER_HOE = ITEMS.register("ender_hoe",
            () -> new HoeItem(ModToolTiers.ENDER_RELIC_TOOLS, 1, -1f, new  Item.Properties()));

    public static final RegistryObject<Item> ENDER_BLAZE_SPAWN_EGG = ITEMS.register("ender_blaze_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ENDER_BLAZE, 0x000000, 0x8400BC,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
