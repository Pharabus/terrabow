package pharabus.mods.terrabow.item;

import pharabus.mods.terrabow.TerraBowSettings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemPlaneBlade extends Item implements ISize{

	public ItemPlaneBlade( int id ){
		super( id);
		setCreativeTab(TFCTabs.TFCMisc);
		setMaxDamage( 100 );
	}
	@Override
	public EnumSize getSize(){
		return EnumSize.SMALL;
	}
	@Override
	public EnumWeight getWeight(){
		return EnumWeight.MEDIUM;
	}

	@Override
	public void registerIcons( IconRegister iconRegister ){
		this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "planeblades/PlaneBlade" + this.getUnlocalizedName().replace( "PlaneBlade", "" ).replace( "item.", "" ) );
	}
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public int getItemStackLimit(){
        if (canStack()) {
            return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
          }
          return 1;
    }
}
