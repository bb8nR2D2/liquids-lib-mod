package com.bb8nr2d2.liquidslib.item.custom;

import com.bb8nr2d2.liquidslib.block.ModBlocks;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                Blocks.STONE, Blocks.STONE_BRICKS,
                Blocks.STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS,
                Blocks.GRANITE, Blocks.POLISHED_GRANITE,
                Blocks.DIORITE, Blocks.POLISHED_DIORITE,
                Blocks.ANDESITE, Blocks.POLISHED_ANDESITE,
                Blocks.DEEPSLATE, Blocks.POLISHED_DEEPSLATE,
                Blocks.TUFF, Blocks.POLISHED_TUFF,
                Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS,
                Blocks.COBBLESTONE, ModBlocks.COBBLED_COBBLESTONE.get()
            );



    public ChiselItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedBlock)) {
            if (!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), CHISEL_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
            }
        }


        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip.liquidslib.chisel.shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip.liquidslib.chisel.tooltip"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
