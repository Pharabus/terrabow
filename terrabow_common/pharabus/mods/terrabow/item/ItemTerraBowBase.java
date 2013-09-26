package pharabus.mods.terrabow.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.Util.StringUtil;
import TFC.Items.ItemTerra;

public abstract class ItemTerraBowBase extends Item implements ISize{

    private EnumSize size;
    private EnumWeight weight;
    public ItemTerraBowBase(int id, EnumSize size, EnumWeight weight) {
        super(id);
        this.size = size;
        this.weight = weight;
    }

    @Override
    public EnumSize getSize(){
        return size;
    }
    @Override
    public EnumWeight getWeight(){
        return weight;
    }
    
    @Override
    public boolean canStack() {
        return true;
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
}
