package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Block fsf =  new Block(FabricBlockSettings.of(Material.METAL));
		Registry.register(Registry.BLOCK, new Identifier("tutorial:four_sided_furnace"), fsf);
		Registry.register(Registry.ITEM, new Identifier("tutorial:four_sided_furnace"), new BlockItem(fsf, new Item.Settings().group(ItemGroup.MISC)));
		System.out.println("Hello Fabric world!");
	}
}
