package net.tenbris.iceskate.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tenbris.iceskate.IceSkates;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IceSkates.MOD_ID);

    public static final DeferredItem<Item> ICE_SKATE = ITEMS.register("ice_skate_item",
            ()->new Item(new Item.Properties()));

    public static void registerItem(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
