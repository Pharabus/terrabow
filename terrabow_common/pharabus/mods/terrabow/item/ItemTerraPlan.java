package pharabus.mods.terrabow.item;

import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.Core.TFCTabs;

public class ItemTerraPlan extends ItemTerraBowBase{

	public ItemTerraPlan( int id ){
		super(id, EnumSize.MEDIUM, EnumWeight.LIGHT );
		setCreativeTab(TFCTabs.TFCMisc);
	}
	
    @Override
    public boolean canStack() {
        // TODO Auto-generated method stub
        return false;
    }
    //ToDo icons
}
