package astavie.coppertools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CopperTools implements ModInitializer {

	public static final ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS)) {};
	public static final ToolItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE, 7.0F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS)) {};
	public static final ToolItem COPPER_HOE = new HoeItem(CopperToolMaterial.INSTANCE, -1, -2.0F, new Item.Settings().group(ItemGroup.TOOLS)) {};

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("coppertools", "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("coppertools", "copper_sword"), COPPER_SWORD);
		Registry.register(Registry.ITEM, new Identifier("coppertools", "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("coppertools", "copper_axe"), COPPER_AXE);
		Registry.register(Registry.ITEM, new Identifier("coppertools", "copper_hoe"), COPPER_HOE);
	}

}
