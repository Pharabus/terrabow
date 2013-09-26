package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import pharabus.mods.terrabow.TerraBowSettings;

public class ItemLongbow extends ItemTerraBow{
	
	public ItemLongbow( int id ){
		super( id );
		setMaxDamage( TerraBowSettings.LongbowDurability );
	}
	@Override
    public float getArrowVelocityModifier(){
    	return (float) TerraBowSettings.LongbowVelocityModifier;
    }
	@Override
    public float getArrowAccuracyModifier(){
    	return (float) TerraBowSettings.LongbowAccuracyModifier;
    }
	@Override
	public void registerIcons( IconRegister iconRegister ){
		this.itemIcon = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "primitivebow/PrimitiveBow" );
		for( int i = 0; i < TerraBowSettings.UniqueArrows; i++ ){
			for( int j = 0; j < 3; j++ ){ //3 loops, 1 for each nocking animation
				this.iconArrowArray[i * 3 + j] = iconRegister.registerIcon(TerraBowSettings.TEXTURE_LOCATION + ":" + "primitivebow/Primitive" + TerraBowSettings.ArrowheadNames[i].replaceAll( "\\s", "" ) + j );
			}
		}
	}
}