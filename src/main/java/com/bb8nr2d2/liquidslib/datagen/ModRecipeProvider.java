package com.bb8nr2d2.liquidslib.datagen;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import com.bb8nr2d2.liquidslib.block.ModBlocks;
import com.bb8nr2d2.liquidslib.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> HOT_ROCK_SMELTABLES = List.of(ModItems.ROCK);
        List<ItemLike> HOT_COBBLESTONE_SMELTABLES = List.of(ModBlocks.COBBLED_COBBLESTONE);

        //shaped crafting
        //cobbled cobblestone
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_COBBLESTONE.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROCK.get())
                .unlockedBy("has_rock", has(ModItems.ROCK)).save(recipeOutput);
        //hot cobblestone
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOT_COBBLESTONE.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.HOT_ROCK.get())
                .unlockedBy("has_hot_rock", has(ModItems.HOT_ROCK)).save(recipeOutput);
        //hotter cobblestone
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOTTER_COBBLESTONE.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.HOTTER_ROCK.get())
                .unlockedBy("has_hotter_rock", has(ModItems.HOTTER_ROCK)).save(recipeOutput);
        //hottest cobblestone
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOTTEST_COBBLESTONE.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.HOTTEST_ROCK.get())
                .unlockedBy("has_hottest_rock", has(ModItems.HOTTEST_ROCK)).save(recipeOutput);
        //hot block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOT_BLOCK.get())
                .pattern("IWI")
                .pattern("GMG")
                .pattern("IGI")
                .define('M', Items.MAGMA_BLOCK)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('W', ItemTags.WOOL)
                .define('G', Items.TINTED_GLASS)
                .unlockedBy("has_hot_rock", has(ModItems.HOT_ROCK)).save(recipeOutput);

        //chisels
        //flint chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_CHISEL.get())
                .pattern(" CC")
                .pattern(" HC")
                .pattern("S  ")
                .define('H', Items.STRING)
                .define('C', Items.FLINT)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_flint", has(Items.FLINT)).save(recipeOutput);
        //copper chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_CHISEL.get())
                .pattern(" AC")
                .pattern("IHA")
                .pattern("SI ")
                .define('H', ModItems.HOT_ROCK)
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('A', Tags.Items.GEMS_AMETHYST)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_hot_rock", has(ModItems.HOT_ROCK)).save(recipeOutput);
        //iron chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.IRON_CHISEL.get())
                .pattern(" AI")
                .pattern("IHA")
                .pattern("SI ")
                .define('H', ModItems.HOTTER_ROCK)
                .define('A', Tags.Items.GEMS_AMETHYST)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_hotter_rock", has(ModItems.HOTTER_ROCK)).save(recipeOutput);
        //gold chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.GOLD_CHISEL.get())
                .pattern(" AC")
                .pattern("IHA")
                .pattern("SI ")
                .define('H', ModItems.HOTTER_ROCK)
                .define('C', Tags.Items.INGOTS_GOLD)
                .define('A', Tags.Items.GEMS_AMETHYST)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_hotter_rock", has(ModItems.HOTTER_ROCK)).save(recipeOutput);
        //diamond chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_CHISEL.get())
                .pattern(" AC")
                .pattern("IHA")
                .pattern("SI ")
                .define('H', ModItems.HOTTEST_ROCK)
                .define('C', Tags.Items.GEMS_DIAMOND)
                .define('A', Tags.Items.GEMS_AMETHYST)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_flint_chisel", has(ModItems.FLINT_CHISEL)).save(recipeOutput);

        //shapeless crafting
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROCK.get(), 9)
                .requires(ModBlocks.COBBLED_COBBLESTONE)
                .unlockedBy("has_cobbled_cobblestone", has(ModBlocks.COBBLED_COBBLESTONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HOT_ROCK.get(), 9)
                .requires(ModBlocks.HOT_COBBLESTONE)
                .unlockedBy("has_hot_cobblestone", has(ModBlocks.HOT_COBBLESTONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HOTTER_ROCK.get(), 9)
                .requires(ModBlocks.HOTTER_COBBLESTONE)
                .unlockedBy("has_hotter_cobblestone", has(ModBlocks.HOTTER_COBBLESTONE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HOTTEST_ROCK.get(), 9)
                .requires(ModBlocks.HOTTEST_COBBLESTONE)
                .unlockedBy("has_hottest_cobblestone", has(ModBlocks.HOTTEST_COBBLESTONE)).save(recipeOutput);

        //smelting
        oreSmelting(recipeOutput, HOT_ROCK_SMELTABLES, RecipeCategory.MISC, ModItems.HOT_ROCK.get(), 0.25f, 400, "hot_rock");
        oreSmelting(recipeOutput, HOT_COBBLESTONE_SMELTABLES, RecipeCategory.MISC, ModBlocks.HOT_COBBLESTONE.get(), 2.5f, 1600, "hot_rock");

        //blasting
        oreBlasting(recipeOutput, HOT_ROCK_SMELTABLES, RecipeCategory.MISC, ModItems.HOT_ROCK.get(), 0.25f, 200, "hot_rock");
        oreBlasting(recipeOutput, HOT_COBBLESTONE_SMELTABLES, RecipeCategory.MISC, ModBlocks.HOT_COBBLESTONE.get(), 2.5f, 800, "hot_rock");

        //smithing
        netheriteSmithing(recipeOutput, ModItems.DIAMOND_CHISEL.get(), RecipeCategory.TOOLS, ModItems.NETHERITE_CHISEL.get());
    }

    //custom cooking helpers
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, LiquidsLib.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}