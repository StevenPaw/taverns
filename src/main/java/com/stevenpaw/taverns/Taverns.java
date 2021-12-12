package com.stevenpaw.taverns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Taverns implements ModInitializer{

    public static final ItemGroup TAVERNS_ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier("taverns", "taverns"),
		() -> new ItemStack(Taverns.GOLDCOIN_ITEM));
    
    public static final Item GOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item HALFGOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item SILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item HALFSILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item COPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item HALFCOPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item NETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item HALFNETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));

    public static final Item MEAD_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    public static final Item SILVER_INGOT_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
    

    @Override 
    public void onInitialize(){
        Registry.register(Registry.ITEM, new Identifier("taverns", "goldcoin"), GOLDCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "halfgoldcoin"), HALFGOLDCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "silvercoin"), SILVERCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "halfsilvercoin"), HALFSILVERCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "coppercoin"), COPPERCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "halfcoppercoin"), HALFCOPPERCOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "netheritecoin"), NETHERITECOIN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "halfnetheritecoin"), HALFNETHERITECOIN_ITEM);

        Registry.register(Registry.ITEM, new Identifier("taverns", "mead"), MEAD_ITEM);
        Registry.register(Registry.ITEM, new Identifier("taverns", "silver_ingot"), SILVER_INGOT_ITEM);
    }
}
