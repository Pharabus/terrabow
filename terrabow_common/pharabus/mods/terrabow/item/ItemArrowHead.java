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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArrowHead extends ItemTerraBowBase{
	
	public Icon[] icons;
	public ItemArrowHead( int id ){
		super(id,EnumSize.VERYSMALL,EnumWeight.LIGHT);
		setCreativeTab(TFCTabs.TFCUnfinished);
		icons = new Icon[TerraBowSettings.ArrowheadNames.length];
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
	
	@SideOnly(Side.CLIENT)
    @Override
	public void registerIcons( IconRegister iconRegister ){
		for( int i = 0; i < this.icons.length; i++ ){
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "arrowheads/ArrowHead" + TerraBowSettings.ArrowheadNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + TerraBowSettings.ArrowheadNames[itemStack.getItemDamage()];
	} 
}
