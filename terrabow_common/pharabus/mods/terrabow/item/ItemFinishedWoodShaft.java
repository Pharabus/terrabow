package pharabus.mods.terrabow.item;

import java.util.List;

import pharabus.mods.terrabow.TerraBowSettings;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFinishedWoodShaft extends Item implements ISize{
	
	public Icon[] icons;

	public String[] MetaNames;
	public ItemFinishedWoodShaft( int id ){
		super(id);
		setCreativeTab(TFCTabs.TFCMisc);
		MetaNames =  new String[] { "Oak", "Aspen", "Birch", "Chestnut", "Douglas Fir", "Hickory", "Maple", "Ash", "Pine",
										"Sequoia", "Spruce", "Sycamore", "White Cedar", "White Elm", "Willow", "Kapok" };
		this.icons = new Icon[this.MetaNames.length];
	}
	@Override
	public EnumSize getSize(){
		return EnumSize.MEDIUM;
	}
	@Override
	public EnumWeight getWeight(){
		return EnumWeight.LIGHT;
	}
	@Override
	public void getSubItems( int par1, CreativeTabs creativeTabs, List list ){
		for( int i = 0; i < this.icons.length; i++ ){
			list.add( new ItemStack( this, 1, i ) );
		}
	}
	@Override
    public int getItemStackLimit(){
	      if (canStack()) {
	            return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
	          }
	          return 1;
    }
	@Override
	public Icon getIconFromDamage( int meta ){
		return this.icons[meta];
	}
	
	@SideOnly(Side.CLIENT)
    @Override
	public void registerIcons( IconRegister iconRegister ){
		for( int i = 0; i < this.icons.length; i++ ){
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "finishedwoodshafts/FinishedWoodShaft" + this.MetaNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + this.MetaNames[itemStack.getItemDamage()];
	}
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return false;
    }
}
