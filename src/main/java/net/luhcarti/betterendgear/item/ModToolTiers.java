package net.luhcarti.betterendgear.item;

import net.luhcarti.betterendgear.BetterEndGear;
import net.luhcarti.betterendgear.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ENDER_RELIC_TOOLS = TierSortingRegistry.registerTier(
            new ForgeTier(5, 700, 8f, 0f, 25,
                    ModTags.Blocks.NEEDS_ENDER_TOOL, () -> Ingredient.of(ModItems.ENDER_RELICS.get())),
            new ResourceLocation(BetterEndGear.MOD_ID, "ender_relic"), List.of(Tiers.NETHERITE), List.of());
}
