package net.luhcarti.betterendgear.datagen;

import net.luhcarti.betterendgear.BetterEndGear;
import net.luhcarti.betterendgear.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, BetterEndGear.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLAZE_SCALE_BOOTS.get(),
                        ModItems.BLAZE_SCALE_LEGGINGS.get(),
                        ModItems.BLAZE_SCALE_CHESTPLATE.get(),
                        ModItems.BLAZE_SCALE_HELMET.get());
    }
}