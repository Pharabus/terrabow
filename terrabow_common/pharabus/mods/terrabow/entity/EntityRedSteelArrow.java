package pharabus.mods.terrabow.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pharabus.mods.terrabow.TerraBowSettings;
import pharabus.mods.terrabow.manager.ItemManager;

public class EntityRedSteelArrow extends EntityTerraArrow{

	public EntityRedSteelArrow( World world ){
		super( world );
	}
	public EntityRedSteelArrow( World world, double par2, double par4, double par6 ){
		super( world, par2, par4, par6 );
	}
	public EntityRedSteelArrow( World world, EntityLivingBase shootingEntity, EntityLivingBase entityLiving2, float par4, float par5 ){
		super( world, shootingEntity, entityLiving2, par4, par5 );
	}
	public EntityRedSteelArrow( World world, EntityLivingBase entityLiving, float par3 ){
		super( world, entityLiving, par3 );
	}
	public EntityRedSteelArrow( World world, EntityLivingBase entityLiving, float par3, float accuracyModifier, float durabilityRatio ){
		super( world, entityLiving, par3, accuracyModifier, durabilityRatio );
	}
	@Override
	public ItemStack pickupItem(){
		return new ItemStack( ItemManager.Arrow, 1, 10 );
	}
	@Override
	public double getDamageFromConfiguration(){
		return TerraBowSettings.RedSteelArrowDamage;
	}
    //TerraBow method
	@Override
    public ItemStack arrowDrop(){
    	return this.pickupItem();
    }
    //TerraBow method
	@Override
    public ItemStack arrowheadDrop(){
    	return new ItemStack( ItemManager.Arrowhead, 1, 10 );
    }
}