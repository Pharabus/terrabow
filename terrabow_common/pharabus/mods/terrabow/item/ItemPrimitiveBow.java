package pharabus.mods.terrabow.item;

import net.minecraft.client.renderer.texture.IconRegister;
import pharabus.mods.terrabow.TerraBowSettings;

public class ItemPrimitiveBow extends ItemTerraBow{
	
	public ItemPrimitiveBow( int id ){
		super( id );
		setMaxDamage( TerraBowSettings.PrimitiveBowDurability );
	}
	@Override
    public float getArrowVelocityModifier(){
    	return (float) TerraBowSettings.PrimitiveBowVelocityModifier;
    }
	@Override
    public float getArrowAccuracyModifier(){
    	return (float) TerraBowSettings.PrimitiveBowAccuracyModifier;
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
