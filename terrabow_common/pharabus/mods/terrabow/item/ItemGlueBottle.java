package pharabus.mods.terrabow.item;

import pharabus.mods.terrabow.TerraBowSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemGlueBottle extends Item implements ISize{

	public ItemGlueBottle(int id) {
		super( id );
		setCreativeTab(TFCTabs.TFCMisc);
	}
	@Override
	public EnumSize getSize(){
		return EnumSize.SMALL;
	}
	@Override
	public EnumWeight getWeight(){
		return EnumWeight.LIGHT;
	}
	@Override
	public boolean canStack(){
		return false;
	}
	
   @Override
    public int getItemStackLimit(){
        if (canStack()) {
            return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
          }
          return 1;
    }
	   
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons( IconRegister iconRegister ){
        this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":GlueBottle");
    }
	
}
