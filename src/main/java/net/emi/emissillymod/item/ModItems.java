package net.emi.emissillymod.item;

import net.emi.emissillymod.EmisSillyMod;
import net.emi.emissillymod.item.custom.WitheredPowderItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EmisSillyMod.MOD_ID);

    public static final DeferredItem<Item> WITHERED_POWDER = ITEMS.register("withered_powder",
            () -> new WitheredPowderItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
