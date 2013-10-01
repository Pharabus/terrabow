package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import pharabus.mods.terrabow.TerraBowSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemTerraPlan extends ItemTerraBowBase{

	public ItemTerraPlan( int id ){
		super(id, EnumSize.MEDIUM, EnumWeight.LIGHT );
		setCreativeTab(TFCTabs.TFCMisc);
	}
	
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons( IconRegister iconRegister ){
        this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":plan");
    }

}
