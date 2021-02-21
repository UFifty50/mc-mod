package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

	public static final Block BLOCK1 = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	
	@Override
	public void onInitialize() {

		System.out.println("Hello Fabric world!");

		Registry.register(Registry.BLOCK, new Identifier("mc-mod", "block1"), BLOCK1);
		Registry.register(Registry.ITEM, new Identifier("mc-mod", "block1"), new BlockItem(BLOCK1, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
