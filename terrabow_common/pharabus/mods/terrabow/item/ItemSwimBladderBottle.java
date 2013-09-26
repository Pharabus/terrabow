package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSwimBladderBottle extends ItemTerraBowBase{

	public ItemSwimBladderBottle( int id ) {
		super(id, EnumSize.SMALL, EnumWeight.LIGHT);
		setCreativeTab(TFCTabs.TFCMisc);
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons( IconRegister iconRegister ){
        this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":SwimBladderBottle");
    }
}
