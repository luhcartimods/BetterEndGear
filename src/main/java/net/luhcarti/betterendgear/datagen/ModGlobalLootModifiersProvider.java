package net.luhcarti.betterendgear.datagen;

import net.luhcarti.betterendgear.BetterEndGear;
import net.luhcarti.betterendgear.item.ModItems;
import net.luhcarti.betterendgear.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, BetterEndGear.MOD_ID);
    }

    @Override
    protected void start() {

        add("dragon_fang_from_ender_dragon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(),
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, ModItems.DRAGON_FANG.get()));

        add("ender_relics_from_enderman", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/enderman")).build(),
                LootItemRandomChanceCondition.randomChance(0.10f).build()}, ModItems.ENDER_RELICS.get()));

        add("ender_blaze_scale_from_ender_blaze", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_blaze")).build(),
                LootItemRandomChanceCondition.randomChance(0.10f).build()}, ModItems.ENDER_RELICS.get()));}




    }


