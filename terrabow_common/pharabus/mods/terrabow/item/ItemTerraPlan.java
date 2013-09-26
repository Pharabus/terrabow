package pharabus.mods.terrabow.item;

import net.minecraft.item.Item;
import TFC.API.ISize;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemTerraPlan extends Item implements ISize{

	public ItemTerraPlan( int id ){
		super( id );
		setCreativeTab(TFCTabs.TFCMisc);
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
    public boolean canStack() {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public int getItemStackLimit(){
          if (canStack()) {
                return getSize().stackSize * getWeight().multiplier <= 64 ? getSize().stackSize * getWeight().multiplier : 64;
              }
              return 1;
    }
}
