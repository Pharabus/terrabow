package pharabus.mods.terrabow.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemTerraArrow extends Item implements ISize{
	
	public Icon[] icons;

	public ItemTerraArrow( int id ){
		super( id );
		setCreativeTab(TFCTabs.TFCWeapons);
		icons = new Icon[TerraBowSettings.ArrowheadNames.length];
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
    public int getItemStackLimit(){
	       if (canStack()) {
	            return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
	          }
	          return 1;
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
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "arrows/Arrow" + TerraBowSettings.ArrowheadNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + TerraBowSettings.ArrowheadNames[itemStack.getItemDamage()];
	}
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return true;
    }
}
