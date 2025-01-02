package net.cofi.modid.item;

import net.cofi.modid.ProbniMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ZLATNA_KAJLA = registerItem("zlatna_kajla",new Item((new Item.Settings())));
    public static final Item KATANA = registerItem("katana",new Item((new Item.Settings())));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz",new Item((new Item.Settings())));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ProbniMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        ProbniMod.LOGGER.info("Registering mod items for "+ProbniMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ZLATNA_KAJLA);
            fabricItemGroupEntries.add(KATANA);
            fabricItemGroupEntries.add(ROSE_QUARTZ);
        });
    }
}
