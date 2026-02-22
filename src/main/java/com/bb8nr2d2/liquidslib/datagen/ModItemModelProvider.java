package com.bb8nr2d2.liquidslib.datagen;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LiquidsLib.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ROCK.get());
        basicItem(ModItems.HOT_ROCK.get());
        basicItem(ModItems.HOTTER_ROCK.get());
        basicItem(ModItems.HOTTEST_ROCK.get());
        basicItem(ModItems.MAGMA_ROCK.get());

        basicItem(ModItems.WHITE_CHOCOLATE_BAR.get());
        basicItem(ModItems.MILK_CHOCOLATE_BAR.get());
        basicItem(ModItems.DARK_CHOCOLATE_BAR.get());

        basicItem(ModItems.FLINT_CHISEL.get());
        basicItem(ModItems.COPPER_CHISEL.get());
        basicItem(ModItems.IRON_CHISEL.get());
        basicItem(ModItems.GOLD_CHISEL.get());
        basicItem(ModItems.DIAMOND_CHISEL.get());
        basicItem(ModItems.NETHERITE_CHISEL.get());
    }

}
