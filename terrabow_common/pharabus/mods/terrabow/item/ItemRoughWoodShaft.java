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

public class ItemRoughWoodShaft extends ItemTerraBowBase{
	
	public Icon[] icons;
	public String[] MetaNames;
	
	public ItemRoughWoodShaft( int id ){
		super(id, EnumSize.MEDIUM, EnumWeight.LIGHT);
		setCreativeTab(TFCTabs.TFCUnfinished);
		setMaxDamage( 0 );
		MetaNames = new String[] { "Oak", "Aspen", "Birch", "Chestnut", "Douglas Fir", "Hickory", "Maple", "Ash", "Pine",
				"Sequoia", "Spruce", "Sycamore", "White Cedar", "White Elm", "Willow", "Kapok" };
		icons = new Icon[this.MetaNames.length];
	}
	
	@Override
	public int getMetadata( int i ){
		return i;
	}
	@Override
	public void getSubItems( int index, CreativeTabs creativeTabs, List list ){
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
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "roughwoodshafts/RoughWoodShaft" + this.MetaNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + this.MetaNames[itemStack.getItemDamage()];
	}
  
}
