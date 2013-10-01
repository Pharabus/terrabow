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

public class ItemClayMold extends ItemTerraBowBase {

    Icon ClayIcon;
    Icon CeramicIcon;
    Icon CopperIcon;
    Icon BronzeIcon;
    Icon BismuthBronzeIcon;
    Icon BlackBronzeIcon;
    
    public String[] MetaNames;
    
    public ItemClayMold(int id) {
        super(id,EnumSize.SMALL,EnumWeight.MEDIUM);
        setCreativeTab(TFCTabs.TFCPottery);
        MetaNames = new String[] { "arrowheadClayMold", "arrowheadCeramicMold", "arrowheadCopperMold", "arrowheadBronzeMold", "arrowheadBismuthBronzeMold", "arrowheadBlackBronzeMold" };
    }
    

    
    @Override
    public Icon getIconFromDamage(int damage) {
        if (damage == 0) return this.ClayIcon;
        if (damage == 1) return this.CeramicIcon;
        if (damage == 2) return this.CopperIcon;
        if (damage == 3) return this.BronzeIcon;
        if (damage == 4) return this.BismuthBronzeIcon;
        if (damage == 5) return this.BlackBronzeIcon;
        
        return this.ClayIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));        
    };
    
   @Override
    public String getUnlocalizedName(ItemStack itemstack) {
       return this.getUnlocalizedName() + "." + this.MetaNames[itemstack.getItemDamage()];
   }

    
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister) {
               
        this.ClayIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[0]);
        this.CeramicIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[1]);
        if (this.MetaNames.length > 2) {
          this.CopperIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[2]);
          this.BronzeIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[3]);
          this.BismuthBronzeIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[4]);
          this.BlackBronzeIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "pottery/" + this.MetaNames[5]);
        }
    }

}
