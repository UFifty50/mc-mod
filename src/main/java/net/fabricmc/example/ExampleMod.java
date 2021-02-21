package net.fabricmc.example;

import java.rmi.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {

	public static final Block BLOCK1 = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		System.out.println("Hello Fabric world!");
		Registry.register(Registry.BLOCK, new Identifier("tutorial", "block0"), BLOCK1);
	}
}
