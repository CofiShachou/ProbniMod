package net.cofi.modid.item;

import net.cofi.modid.ProbniMod;
import net.cofi.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOJI_ITEMI= Registry.register(Registries.ITEM_GROUP, Identifier.of(ProbniMod.MOD_ID
            ,"moji_itemi"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.ROSE_QUARTZ_BLOCK)).displayName(Text.translatable("itemgroup.modid.svi_moji_ajtemi")).entries((displayContext, entries) -> {
                entries.add(ModItems.ROSE_QUARTZ);
                entries.add(ModItems.KATANA);
                entries.add(ModItems.ZLATNA_KAJLA);
                entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);

                    })
            .build());
    public static void rig(){
        ProbniMod.LOGGER.info("Prkaz za: ",ProbniMod.MOD_ID);

    }
}
