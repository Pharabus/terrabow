package pharabus.mods.terrabow.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemLongbowBody extends ItemTerraBowBase{
	
	public Icon[] icons;
    public String[] MetaNames;
	
	public ItemLongbowBody( int id ) {
		super(id,EnumSize.LARGE,EnumWeight.MEDIUM );
        setCreativeTab(TFCTabs.TFCMisc);
		MetaNames =  new String[] { "Oak", "Aspen", "Birch", "Chestnut", "Douglas Fir", "Hickory", "Maple", "Ash", "Pine",
				"Sequoia", "Spruce", "Sycamore", "White Cedar", "White Elm", "Willow", "Kapok" };
		icons = new Icon[this.MetaNames.length];
	}
	
	@Override
	public void getSubItems( int par1, CreativeTabs creativeTabs, List list ){
		for( int i = 0; i < this.icons.length; i++ ){
			list.add( new ItemStack( this, 1, i ) );
		}
	}
	@Override
	public Icon getIconFromDamage( int meta ){
		return this.icons[meta];
	}
	@Override
	public void registerIcons( IconRegister iconRegister ){
		for( int i = 0; i < this.icons.length; i++ ){
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "longbowbodies/LongbowBody" + this.MetaNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + this.MetaNames[itemStack.getItemDamage()];
	}	  
}
