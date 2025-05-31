package net.raglr.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raglr.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItem(){
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);
    }

    ItemGroupEvents.ModifyEntries(ItemGroups.INGREDIENTS).register(entries -> { entries.add(RUBY);


}

