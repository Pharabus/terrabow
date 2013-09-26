package pharabus.mods.terrabow;

import pharabus.mods.terrabow.entity.EntityBismuthArrow;
import pharabus.mods.terrabow.entity.EntityBismuthBronzeArrow;
import pharabus.mods.terrabow.entity.EntityBlackBronzeArrow;
import pharabus.mods.terrabow.entity.EntityBlackSteelArrow;
import pharabus.mods.terrabow.entity.EntityBlueSteelArrow;
import pharabus.mods.terrabow.entity.EntityBoneArrow;
import pharabus.mods.terrabow.entity.EntityBronzeArrow;
import pharabus.mods.terrabow.entity.EntityCopperArrow;
import pharabus.mods.terrabow.entity.EntityIronArrow;
import pharabus.mods.terrabow.entity.EntityRedSteelArrow;
import pharabus.mods.terrabow.entity.EntityRoseGoldArrow;
import pharabus.mods.terrabow.entity.EntitySteelArrow;
import pharabus.mods.terrabow.entity.EntityStoneArrow;
import pharabus.mods.terrabow.entity.EntityTinArrow;
import pharabus.mods.terrabow.entity.EntityZincArrow;
import pharabus.mods.terrabow.render.RenderTerraArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderers(){

		RenderingRegistry.registerEntityRenderingHandler( EntityStoneArrow.class, new RenderTerraArrow( CommonProxy.StoneArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBoneArrow.class, new RenderTerraArrow( CommonProxy.BoneArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBismuthArrow.class, new RenderTerraArrow( CommonProxy.BismuthArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBismuthBronzeArrow.class, new RenderTerraArrow( CommonProxy.BismuthBronzeArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBlackBronzeArrow.class, new RenderTerraArrow( CommonProxy.BlackBronzeArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBlackSteelArrow.class, new RenderTerraArrow( CommonProxy.BlackSteelArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBlueSteelArrow.class, new RenderTerraArrow( CommonProxy.BlueSteelArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityBronzeArrow.class, new RenderTerraArrow( CommonProxy.BronzeArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityCopperArrow.class, new RenderTerraArrow( CommonProxy.CopperArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityIronArrow.class, new RenderTerraArrow( CommonProxy.IronArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityRedSteelArrow.class, new RenderTerraArrow( CommonProxy.RedSteelArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityRoseGoldArrow.class, new RenderTerraArrow( CommonProxy.RoseGoldArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntitySteelArrow.class, new RenderTerraArrow( CommonProxy.SteelArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityTinArrow.class, new RenderTerraArrow( CommonProxy.TinArrowPNG ) );
		RenderingRegistry.registerEntityRenderingHandler( EntityZincArrow.class, new RenderTerraArrow( CommonProxy.ZincArrowPNG ) );
	}
}
