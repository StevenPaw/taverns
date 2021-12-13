package com.stevenpaw.taverns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.GenerationStep;

public class Taverns implements ModInitializer{

  public static final String MOD_ID = "taverns";

  public static final ItemGroup TAVERNS_ITEM_GROUP = FabricItemGroupBuilder.build(
  new Identifier(MOD_ID, "taverns"),
  () -> new ItemStack(Taverns.GOLDCOIN_ITEM));

  public static final Item RAWGOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWHALFGOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWSILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWHALFSILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWCOPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWHALFCOPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWNETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAWHALFNETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  
  public static final Item GOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item HALFGOLDCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item SILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item HALFSILVERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item COPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item HALFCOPPERCOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item NETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item HALFNETHERITECOIN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));

  public static final Item DRINKINGHORN_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item SILVER_INGOT_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));
  public static final Item RAW_SILVER_ITEM = new Item(new Item.Settings().group(Taverns.TAVERNS_ITEM_GROUP));

  public static final Block SILVER_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
  
  private static ConfiguredFeature<?, ?> OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE = Feature.ORE
      .configure(new OreFeatureConfig(
          OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
          Taverns.SILVER_ORE_BLOCK.getDefaultState(),
          3)); // vein size

  public static PlacedFeature OVERWORLD_SILVER_ORE_PLACED_FEATURE = OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE.withPlacement(
      CountPlacementModifier.of(5), // number of veins per chunk
      SquarePlacementModifier.of(), // spreading horizontally
      HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(20))); // height

  @Override 
  public void onInitialize(){
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawgoldcoin"), RAWGOLDCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawhalfgoldcoin"), RAWHALFGOLDCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawsilvercoin"), RAWSILVERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawhalfsilvercoin"), RAWHALFSILVERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawcoppercoin"), RAWCOPPERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawhalfcoppercoin"), RAWHALFCOPPERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawnetheritecoin"), RAWNETHERITECOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawhalfnetheritecoin"), RAWHALFNETHERITECOIN_ITEM);

    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "goldcoin"), GOLDCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "halfgoldcoin"), HALFGOLDCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "silvercoin"), SILVERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "halfsilvercoin"), HALFSILVERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "coppercoin"), COPPERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "halfcoppercoin"), HALFCOPPERCOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netheritecoin"), NETHERITECOIN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "halfnetheritecoin"), HALFNETHERITECOIN_ITEM);

    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drinkinghorn"), DRINKINGHORN_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "silver_ingot"), SILVER_INGOT_ITEM);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_silver"), RAW_SILVER_ITEM);

    Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "silver_ore"), SILVER_ORE_BLOCK);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE_BLOCK, new FabricItemSettings().group(Taverns.TAVERNS_ITEM_GROUP)));


    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
      new Identifier(MOD_ID, "overworld_silver_ore"), OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE);
    Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(MOD_ID, "overworld_silver_ore"),
      OVERWORLD_SILVER_ORE_PLACED_FEATURE);
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
      RegistryKey.of(Registry.PLACED_FEATURE_KEY,
          new Identifier(MOD_ID, "overworld_silver_ore")));
  }
}
