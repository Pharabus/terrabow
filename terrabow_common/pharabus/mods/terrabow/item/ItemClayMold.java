package pharabus.mods.terrabow.item;

import net.minecraft.util.Icon;
import TFC.Core.TFCTabs;
import TFC.Items.Pottery.ItemPotteryMold;

public class ItemClayMold extends ItemPotteryMold {

    
    Icon CopperIcon;
    Icon BronzeIcon;
    Icon BismuthBronzeIcon;
    Icon BlackBronzeIcon;
    
    public ItemClayMold(int id) {
        super(id);
        setCreativeTab(TFCTabs.TFCPottery);
    }

}
