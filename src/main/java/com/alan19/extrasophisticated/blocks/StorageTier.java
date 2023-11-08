package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.configs.StorageTierConfig;
import com.alan19.extrasophisticated.items.ExtraSophisticatedChestItem;
import com.alan19.extrasophisticated.items.ExtraSophisticatedShulkerBoxItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.item.BarrelBlockItem;

public class StorageTier {
    public static final BlockBehaviour.Properties STORAGE_PROPERTIES = BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD);
    private final RegistryObject<ExtraSophisticatedChestBlock> chestBlock;
    private final RegistryObject<ExtraSophisticatedBarrelBlock> barrelBlock;
    private final RegistryObject<ExtraSophisticatedLimitedBarrelBlock> limitedBarrel1Block;
    private final RegistryObject<ExtraSophisticatedLimitedBarrelBlock> limitedBarrel2Block;
    private final RegistryObject<ExtraSophisticatedLimitedBarrelBlock> limitedBarrel3Block;
    private final RegistryObject<ExtraSophisticatedLimitedBarrelBlock> limitedBarrel4Block;
    private final RegistryObject<ExtraSophisticatedShulkerBox> shulkerBoxBlock;
    private final RegistryObject<ExtraSophisticatedChestItem> chestItem;
    private final RegistryObject<BarrelBlockItem> barrelitem;
    private final RegistryObject<BarrelBlockItem> limitedBarrel1Item;
    private final RegistryObject<BarrelBlockItem> limitedBarrel2Item;
    private final RegistryObject<BarrelBlockItem> limitedBarrel3Item;
    private final RegistryObject<BarrelBlockItem> limitedBarrel4Item;
    private final RegistryObject<ExtraSophisticatedShulkerBoxItem> shulkerBoxItem;
    private final String name;

    public StorageTier(String name,
                       StorageTierConfig config,
                       DeferredRegister<Block> blockDeferredRegister,
                       DeferredRegister<Item> itemDeferredRegister) {
        this.name = name;
        chestBlock = blockDeferredRegister.register(name + "_chest", () -> new ExtraSophisticatedChestBlock(config.getBarrel().inventorySlotCount, config.getChest().upgradeSlotCount));
        shulkerBoxBlock = blockDeferredRegister.register(name + "_shulker_box", () -> new ExtraSophisticatedShulkerBox(config.getShulkerBox().inventorySlotCount, config.getShulkerBox().upgradeSlotCount));
        barrelBlock = blockDeferredRegister.register(name + "_barrel", () -> new ExtraSophisticatedBarrelBlock(config.getBarrel().inventorySlotCount, config.getBarrel().upgradeSlotCount, STORAGE_PROPERTIES));
        limitedBarrel1Block = blockDeferredRegister.register("limited_" + name + "_barrel_1", () -> new ExtraSophisticatedLimitedBarrelBlock(1, config.getLimitedBarrel1().baseSlotLimitMultiplier, config.getLimitedBarrel1().upgradeSlotCount, STORAGE_PROPERTIES));
        limitedBarrel2Block = blockDeferredRegister.register("limited_" + name + "_barrel_2", () -> new ExtraSophisticatedLimitedBarrelBlock(2, config.getLimitedBarrel2().baseSlotLimitMultiplier, config.getLimitedBarrel2().upgradeSlotCount, STORAGE_PROPERTIES));
        limitedBarrel3Block = blockDeferredRegister.register("limited_" + name + "_barrel_3", () -> new ExtraSophisticatedLimitedBarrelBlock(3, config.getLimitedBarrel3().baseSlotLimitMultiplier, config.getLimitedBarrel3().upgradeSlotCount, STORAGE_PROPERTIES));
        limitedBarrel4Block = blockDeferredRegister.register("limited_" + name + "_barrel_4", () -> new ExtraSophisticatedLimitedBarrelBlock(4, config.getLimitedBarrel4().baseSlotLimitMultiplier, config.getLimitedBarrel4().upgradeSlotCount, STORAGE_PROPERTIES));

        chestItem = itemDeferredRegister.register(name + "_chest", () -> new ExtraSophisticatedChestItem(getChestBlock().get()));
        barrelitem = itemDeferredRegister.register(name + "_barrel", () -> new BarrelBlockItem(getBarrelBlock().get()));
        limitedBarrel1Item = itemDeferredRegister.register("limited_" + name + "_barrel_1", () -> new BarrelBlockItem(getLimitedBarrel1Block().get()));
        limitedBarrel2Item = itemDeferredRegister.register("limited_" + name + "_barrel_2", () -> new BarrelBlockItem(getLimitedBarrel2Block().get()));
        limitedBarrel3Item = itemDeferredRegister.register("limited_" + name + "_barrel_3", () -> new BarrelBlockItem(getLimitedBarrel3Block().get()));
        limitedBarrel4Item = itemDeferredRegister.register("limited_" + name + "_barrel_4", () -> new BarrelBlockItem(getLimitedBarrel4Block().get()));
        shulkerBoxItem = itemDeferredRegister.register(name + "_shulker_box", () -> new ExtraSophisticatedShulkerBoxItem(getShulkerBoxBlock().get()));
    }

    public RegistryObject<ExtraSophisticatedChestBlock> getChestBlock() {
        return chestBlock;
    }

    public RegistryObject<ExtraSophisticatedBarrelBlock> getBarrelBlock() {
        return barrelBlock;
    }

    public RegistryObject<ExtraSophisticatedLimitedBarrelBlock> getLimitedBarrel1Block() {
        return limitedBarrel1Block;
    }

    public RegistryObject<ExtraSophisticatedLimitedBarrelBlock> getLimitedBarrel2Block() {
        return limitedBarrel2Block;
    }

    public RegistryObject<ExtraSophisticatedLimitedBarrelBlock> getLimitedBarrel3Block() {
        return limitedBarrel3Block;
    }

    public RegistryObject<ExtraSophisticatedLimitedBarrelBlock> getLimitedBarrel4Block() {
        return limitedBarrel4Block;
    }

    public RegistryObject<ExtraSophisticatedShulkerBox> getShulkerBoxBlock() {
        return shulkerBoxBlock;
    }

    public RegistryObject<ExtraSophisticatedChestItem> getChestItem() {
        return chestItem;
    }

    public RegistryObject<BarrelBlockItem> getBarrelitem() {
        return barrelitem;
    }

    public RegistryObject<BarrelBlockItem> getLimitedBarrel1Item() {
        return limitedBarrel1Item;
    }

    public RegistryObject<BarrelBlockItem> getLimitedBarrel2Item() {
        return limitedBarrel2Item;
    }

    public RegistryObject<BarrelBlockItem> getLimitedBarrel3Item() {
        return limitedBarrel3Item;
    }

    public RegistryObject<BarrelBlockItem> getLimitedBarrel4Item() {
        return limitedBarrel4Item;
    }

    public RegistryObject<ExtraSophisticatedShulkerBoxItem> getShulkerBoxItem() {
        return shulkerBoxItem;
    }

    public Block[] getBlocksInTier() {
        return new Block[]{chestBlock.get(), barrelBlock.get(), limitedBarrel1Block.get(), limitedBarrel2Block.get(), limitedBarrel3Block.get(), limitedBarrel4Block.get(), shulkerBoxBlock.get()};
    }

    public Block[] getBarrelsInTier() {
        return new Block[]{barrelBlock.get(), limitedBarrel1Block.get(), limitedBarrel2Block.get(), limitedBarrel3Block.get(), limitedBarrel4Block.get()};
    }

    public Block[] getLimitedBarrelBlocks() {
        return new Block[]{limitedBarrel1Block.get(), limitedBarrel2Block.get(), limitedBarrel3Block.get(), limitedBarrel4Block.get()};
    }

    public String getName() {
        return name;
    }
}
