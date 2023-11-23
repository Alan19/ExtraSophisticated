package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import com.alan19.extrasophisticated.blocks.StorageTier;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.Tags;
import net.p3pp3rf1y.sophisticatedcore.crafting.ShapeBasedRecipeBuilder;
import net.p3pp3rf1y.sophisticatedcore.util.RegistryHelper;
import net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks;
import net.p3pp3rf1y.sophisticatedstorage.item.WoodStorageBlockItem;
import org.apache.commons.lang3.tuple.Pair;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ExtraSophisticatedRecipeProvider extends RecipeProvider {
    private static final String HAS_UPGRADE_BASE_CRITERION_NAME = "has_upgrade_base";
    private static final String HAS_REDSTONE_TORCH_CRITERION_NAME = "has_redstone_torch";
    private static final String HAS_SMELTING_UPGRADE = "has_smelting_upgrade";
    private static final String PLANK_SUFFIX = "_plank";
    public static final SophisticatedStorageTierRecord WOOD = new SophisticatedStorageTierRecord(ModBlocks.CHEST.get(), ModBlocks.BARREL.get(), ModBlocks.LIMITED_BARREL_1.get(), ModBlocks.LIMITED_BARREL_2.get(), ModBlocks.LIMITED_BARREL_3.get(), ModBlocks.LIMITED_BARREL_4.get(), ModBlocks.SHULKER_BOX.get());
    public ExtraSophisticatedRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        addStorageTierUpgradeRecipesForTierUsing6Ingredients(pFinishedRecipeConsumer, ExtraSophisticatedBlocks.COPPER, WOOD);
        // TODO Add recipe to upgrade copper to iron
        addTierUpgradeItemRecipeUsing6Ingredients(pFinishedRecipeConsumer, ExtraSophisticatedBlocks.BASIC_TO_COPPER_TIER_UPGRADE.get(), ExtraSophisticatedBlocks.COPPER.getIngredient().get());
        addTierUpgradeItemRecipeUsing2Ingredients(pFinishedRecipeConsumer, ExtraSophisticatedBlocks.COPPER_TO_IRON_TIER_UPGRADE.get(), Ingredient.of(Tags.Items.INGOTS_IRON));
//        addTierUpgradeItemRecipe8(pFinishedRecipeConsumer, ExtraSophisticatedBlocks.COPPER_TO_GOLD_TIER_UPGRADE.get(), Ingredient.of(Tags.Items.INGOTS_GOLD));
    }

    private void addTierUpgradeItemRecipeUsing4Ingredients(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike result, Ingredient ingredient) {
        ShapeBasedRecipeBuilder.shaped(result)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .define('R', Items.REDSTONE_TORCH)
                .define('S', ingredient)
                .unlockedBy(HAS_REDSTONE_TORCH_CRITERION_NAME, has(Items.REDSTONE_TORCH))
                .save(pFinishedRecipeConsumer);
    }

    private void addTierUpgradeItemRecipeUsing2Ingredients(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike result, Ingredient ingredient) {
        ShapeBasedRecipeBuilder.shaped(result)
                .pattern("   ")
                .pattern("SRS")
                .pattern("   ")
                .define('R', Items.REDSTONE_TORCH)
                .define('S', ingredient)
                .unlockedBy(HAS_REDSTONE_TORCH_CRITERION_NAME, has(Items.REDSTONE_TORCH))
                .save(pFinishedRecipeConsumer);
    }

    private void addTierUpgradeItemRecipeUsing6Ingredients(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike result, Ingredient ingredient) {
        ShapeBasedRecipeBuilder.shaped(result)
                .pattern("S S")
                .pattern("SRS")
                .pattern("S S")
                .define('R', Items.REDSTONE_TORCH)
                .define('S', ingredient)
                .unlockedBy(HAS_REDSTONE_TORCH_CRITERION_NAME, has(Items.REDSTONE_TORCH))
                .save(pFinishedRecipeConsumer);
    }

    private void addTierUpgradeItemRecipeUsing8Ingredients(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike result, Ingredient ingredient) {
        ShapeBasedRecipeBuilder.shaped(result)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .define('R', Items.REDSTONE_TORCH)
                .define('S', ingredient)
                .unlockedBy(HAS_REDSTONE_TORCH_CRITERION_NAME, has(Items.REDSTONE_TORCH))
                .save(pFinishedRecipeConsumer);
    }

    public void addStorageTierUpgradeRecipesForTierUsing6Ingredients(Consumer<FinishedRecipe> consumer, StorageTier tier, IStorageTier baseTier) {
        IntStream.range(0, tier.getBlocksInTier().length)
                .mapToObj(value -> Pair.of(tier.getBlocksInTier()[value], baseTier.getBlocksInTier()[value]))
                .toList()
                .forEach(blockPair -> ShapeBasedRecipeBuilder.shaped(blockPair.getKey(), ModBlocks.STORAGE_TIER_UPGRADE_RECIPE_SERIALIZER.get())
                .pattern("I I")
                .pattern("ISI")
                .pattern("I I")
                .define('I', tier.getIngredient().get())
                .define('S', blockPair.getValue())
                .unlockedBy("has_" + RegistryHelper.getItemKey(blockPair.getRight().asItem()).getPath(), has(blockPair.getRight().asItem()))
                .save(consumer));
    }

    public void addStorageTierUpgradeRecipesForTierUsing2Ingredients(Consumer<FinishedRecipe> consumer, StorageTier tier, IStorageTier baseTier) {
        IntStream.range(0, tier.getBlocksInTier().length)
                .mapToObj(value -> Pair.of(tier.getBlocksInTier()[value], baseTier.getBlocksInTier()[value]))
                .toList()
                .forEach(blockPair -> ShapeBasedRecipeBuilder.shaped(blockPair.getKey(), ModBlocks.STORAGE_TIER_UPGRADE_RECIPE_SERIALIZER.get())
                        .pattern("   ")
                        .pattern("ISI")
                        .pattern("   ")
                        .define('I', tier.getIngredient().get())
                        .define('S', blockPair.getValue())
                        .unlockedBy("has_" + RegistryHelper.getItemKey(blockPair.getRight().asItem()).getPath(), has(blockPair.getRight().asItem()))
                        .save(consumer));
    }


    private void limitedWoodBarrelRecipe(Consumer<FinishedRecipe> consumer, WoodType woodType, Block planks, Block slab, Consumer<ShapeBasedRecipeBuilder> addPattern, BlockItem item) {
        ShapeBasedRecipeBuilder builder = ShapeBasedRecipeBuilder.shaped(WoodStorageBlockItem.setWoodType(new ItemStack(item), woodType))
                .define('P', planks)
                .define('S', slab)
                .define('R', Blocks.REDSTONE_TORCH)
                .unlockedBy("has_" + woodType.name() + PLANK_SUFFIX, has(planks));
        addPattern.accept(builder);
        builder.save(consumer, new ResourceLocation(ExtraSophisticated.MODID, woodType.name() + "_" + RegistryHelper.getItemKey(item).getPath()));
    }
}
