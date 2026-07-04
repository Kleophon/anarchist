package neo.kleophon.anarchist.item;

import neo.kleophon.anarchist.Anarchist;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Properties;

public class ModItems {
 public  static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Anarchist.MODID);
 public static final DeferredItem<Item> fycj  = ITEMS.registerItem("anarchistsword", Item::new );
 public  static void register(IEventBus eventBus){
     ITEMS.register(eventBus);
 }
}
    