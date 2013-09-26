package pharabus.mods.terrabow.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHandPlane extends ItemTool implements ISize{
	

	public ItemHandPlane( int id, EnumToolMaterial enumToolMaterial ){
		super( id, 1, enumToolMaterial, new Block[] {} );
		setMaxDamage( enumToolMaterial.getMaxUses() );
		setCreativeTab(TFCTabs.TFCTools);
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
	public boolean canStack() {
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
		this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "handplanes/" + this.getUnlocalizedName().replace( "item.", "" ) );
	}
}
