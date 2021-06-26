package astavie.coppertools;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {

    public static final ToolMaterial INSTANCE = new CopperToolMaterial();

    private CopperToolMaterial() {}

    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.STONE;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
    
}
