package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.configs.Config;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.block.BarrelBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.LimitedBarrelBlock;
import org.jetbrains.annotations.Nullable;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);
    public static final RegistryObject<ChestBlock> COPPER_CHEST = BLOCKS.register("copper_chest", () -> new ExtraSophisticatedChestBlock(Config.SERVER.copperChest.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount));
    public static final RegistryObject<BarrelBlock> COPPER_BARREL = BLOCKS.register("copper_barrel", () -> new ExtraSophisticatedBarrelBlock(Config.SERVER.copperBarrel.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<BarrelBlock> LIMITED_COPPER_BARREL_1 = BLOCKS.register("limited_copper_barrel_1", () -> new LimitedBarrelBlock(1, Config.SERVER.copperLimitedBarrel1.baseSlotLimitMultiplier, Config.SERVER.copperLimitedBarrel1.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<BarrelBlock> LIMITED_COPPER_BARREL_2 = BLOCKS.register("limited_copper_barrel_2", () -> new LimitedBarrelBlock(2, Config.SERVER.copperLimitedBarrel2.baseSlotLimitMultiplier, Config.SERVER.copperLimitedBarrel2.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<BarrelBlock> LIMITED_COPPER_BARREL_3 = BLOCKS.register("limited_copper_barrel_3", () -> new LimitedBarrelBlock(3, Config.SERVER.copperLimitedBarrel3.baseSlotLimitMultiplier, Config.SERVER.copperLimitedBarrel3.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<BarrelBlock> LIMITED_COPPER_BARREL_4 = BLOCKS.register("limited_copper_barrel_4", () -> new LimitedBarrelBlock(4, Config.SERVER.copperLimitedBarrel4.baseSlotLimitMultiplier, Config.SERVER.copperLimitedBarrel4.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
}
