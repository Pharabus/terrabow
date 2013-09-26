package pharabus.mods.terrabow.item;

import java.util.List;

import pharabus.mods.terrabow.TerraBowSettings;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemMetalRod extends Item implements ISize{
	
	public Icon[] icons;

	public String[] MetaNames;
	public ItemMetalRod( int id ) {
		super( id );
		setCreativeTab(TFCTabs.TFCMisc);
		MetaNames =new String[]{  "Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Bronze",
										"Copper", "Iron", "Red Steel", "Rose Gold", "Steel", "Tin", "Zinc"  };
		icons = new Icon[this.MetaNames.length];
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
			this.icons[i] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "metalrods/MetalRod" + this.MetaNames[i].replaceAll( "\\s", "" ) );
		}
	}
	@Override
	public String getUnlocalizedName( ItemStack itemStack ){
		return this.getUnlocalizedName() + "." + this.MetaNames[itemStack.getItemDamage()];
	}
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public int getItemStackLimit(){
        if (canStack()) {
            return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
          }
          return 1;
    }
}
