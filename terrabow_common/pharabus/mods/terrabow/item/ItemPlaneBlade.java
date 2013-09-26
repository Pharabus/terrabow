package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemPlaneBlade extends ItemTerraBowBase{

	public ItemPlaneBlade( int id ){
		super(id,EnumSize.SMALL,EnumWeight.MEDIUM );
		setCreativeTab(TFCTabs.TFCMisc);
		//ToDo why?
		setMaxDamage( 100 );
	}

	@Override
	public void registerIcons( IconRegister iconRegister ){
		this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "planeblades/PlaneBlade" + this.getUnlocalizedName().replace( "PlaneBlade", "" ).replace( "item.", "" ) );
	}  
}
