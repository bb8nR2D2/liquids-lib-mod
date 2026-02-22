package com.bb8nr2d2.liquidslib.datagen;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LiquidsLib.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.COBBLED_COBBLESTONE);
        blockWithItem(ModBlocks.HOT_COBBLESTONE);
        blockWithItem(ModBlocks.HOTTER_COBBLESTONE);
        blockWithItem(ModBlocks.HOTTEST_COBBLESTONE);
        blockWithItem(ModBlocks.HOT_ROCK_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
