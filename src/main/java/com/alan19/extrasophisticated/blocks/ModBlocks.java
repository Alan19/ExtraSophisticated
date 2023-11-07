package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.ExtraSophisticatedChestBlockEntity;
import com.alan19.extrasophisticated.ModBlockEntity;
import com.alan19.extrasophisticated.configs.Config;
import net.minecraft.core.BlockPos;
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
import org.jetbrains.annotations.Nullable;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);
    public static final RegistryObject<ChestBlock> COPPER_CHEST = BLOCKS.register("copper_chest", () -> new ExtraSophisticatedChestBlock(Config.SERVER.copperChest.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount));
    public static final RegistryObject<BarrelBlock> COPPER_BARREL = BLOCKS.register("copper_barrel", () -> new BarrelBlock(Config.SERVER.copperBarrel.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount, BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
}
