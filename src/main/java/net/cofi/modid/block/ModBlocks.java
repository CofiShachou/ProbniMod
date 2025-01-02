package net.cofi.modid.block;

import net.cofi.modid.ProbniMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block ROSE_QUARTZ_BLOCK=registerBLock("rose_quartz_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    private static Block registerBLock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,Identifier.of(ProbniMod.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ProbniMod.MOD_ID,name),new BlockItem(block,
                new Item.Settings()));
    }

    public static void registerModBlocks(){
        ProbniMod.LOGGER.info("Registering Mod Blocks for "+ProbniMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
        });
    }
}
