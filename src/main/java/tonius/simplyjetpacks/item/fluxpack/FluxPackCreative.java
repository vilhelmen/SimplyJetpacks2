package tonius.simplyjetpacks.item.fluxpack;

import net.minecraft.item.EnumRarity;

public class FluxPackCreative extends FluxPackArmored {
    
    public FluxPackCreative(int energyPerTickOut, boolean enchantable, int enchantability, int armorReduction) {
        super(9001, EnumRarity.epic, 9001, Integer.MAX_VALUE, energyPerTickOut, enchantable, enchantability, armorReduction, 0);
    }
    
    @Override
    public String getBaseName() {
        return "fluxpack.creative";
    }
    
    @Override
    public boolean hasEmptyItem() {
        return false;
    }
    
    @Override
    public boolean hasDamageBar() {
        return false;
    }
    
    @Override
    public boolean consumesEnergy() {
        return false;
    }
    
}
