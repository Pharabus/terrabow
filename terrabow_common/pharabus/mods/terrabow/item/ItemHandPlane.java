package pharabus.mods.terrabow.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import pharabus.mods.terrabow.TerraBowSettings;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;
import TFC.Core.Util.StringUtil;
import TFC.Items.ItemTerra;
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

   public static void addSizeInformation(ISize object, List arraylist) {
        if ((object.getSize() != null) && (object.getWeight() != null))
          arraylist.add("'" + StringUtil.localize(new StringBuilder().append("gui.Weight.").append(object.getWeight().getName()).toString()) + " '" + StringUtil.localize(new StringBuilder().append("gui.Size.").append(object.getSize().getName().replace(" ", "")).toString()));
      }

    @Override
      public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag)
      {
        ItemTerra.addSizeInformation(this, arraylist);

    }
	   
	@SideOnly(Side.CLIENT)
    @Override
	public void registerIcons( IconRegister iconRegister ){
		this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "handplanes/" + this.getUnlocalizedName().replace( "item.", "" ) );
	}
}
