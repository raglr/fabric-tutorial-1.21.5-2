package net.raglr.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.raglr.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item RAW_CAMEL_MEAT = registerItem("raw_camel_meat",
            new Item(new Item.Settings().registryKey(
                    RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "raw_camel_meat"))
            ))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItem() {
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(RAW_CAMEL_MEAT);
        });
    }
}
