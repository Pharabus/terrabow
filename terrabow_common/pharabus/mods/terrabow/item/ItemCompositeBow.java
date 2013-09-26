package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import pharabus.mods.terrabow.TerraBowSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCompositeBow extends ItemTerraBow{
	
	public ItemCompositeBow( int id ){
		super( id );
		setMaxDamage( TerraBowSettings.CompositeBowDurability );
	}
	@Override
    public float getArrowVelocityModifier(){
    	return (float) TerraBowSettings.CompositeBowVelocityModifier;
    }
	@Override
    public float getArrowAccuracyModifier(){
    	return (float) TerraBowSettings.CompositeBowAccuracyModifier;
    }
	
	@SideOnly(Side.CLIENT)
    @Override
	public void registerIcons( IconRegister iconRegister ){
		this.itemIcon  = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "compositebow/CompositeBow" );
		for( int i = 0; i < TerraBowSettings.UniqueArrows; i++ ){
			for( int j = 0; j < 3; j++ ){ //3 loops, 1 for each nocking animation
				this.iconArrowArray[i * 3 + j] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "compositebow/Composite" + TerraBowSettings.ArrowheadNames[i].replaceAll( "\\s", "" ) + j );
			}
		}
	}
}