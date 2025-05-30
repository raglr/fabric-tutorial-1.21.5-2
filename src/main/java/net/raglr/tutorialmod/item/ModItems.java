package net.raglr.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raglr.tutorialmod.TutorialMod;

public class ModItems {

    private static Item registerItem (String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),item);
    }

    public static void registerModItem(){
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);
    }
}
