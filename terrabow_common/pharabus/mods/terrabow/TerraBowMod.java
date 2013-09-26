package pharabus.mods.terrabow;

import net.minecraftforge.common.Configuration;
import pharabus.mods.terrabow.handler.CraftingHandler;
import pharabus.mods.terrabow.manager.EntityManager;
import pharabus.mods.terrabow.manager.ItemManager;
import pharabus.mods.terrabow.manager.RecipeManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( modid = "TerraBow", name="TerraBow", version = "0.8",
dependencies = "required-after:Forge@[9.10,);required-after:FML@[6.2,);required-after:terrafirmacraft")
@NetworkMod( clientSideRequired = true, serverSideRequired = false )

public class TerraBowMod {

	@SidedProxy( clientSide = "pharabus.mods.terrabow.ClientProxy", serverSide = "pharabus.mods.terrabow.CommonProxy" )
	public static CommonProxy proxy;
	
	@Instance("TerraBow")
    public static TerraBowMod instance;
	
	 @EventHandler
	public void preInit( FMLPreInitializationEvent event ){
		Configuration config = new Configuration( event.getSuggestedConfigurationFile() );
		TerraBowSettings.config( config );
		config.save();
	}
	
	//TODO NEXT: Obsidian arrows?
	//Draw the last textures myself?
	//Make a recipe guide
	
	 @EventHandler
	public void init( FMLInitializationEvent event ){
		
		EntityManager.RegisterGlobalEntityID();
		EntityManager.RegisterModEntity( this );
		
		ItemManager.SetItems();	//Be certain to call this before registering crafting recipes
		ItemManager.RegisterItems();
		ItemManager.RegisterItemNames();
		
		proxy.registerRenderers();
		
		RecipeManager.RemoveRecipes(); //Should call this before registering recipes.
		RecipeManager.RegisterRecipes();
		RecipeManager.RegisterAnvilRecipes();
		RecipeManager.RegisterKnappingRecipes();
		RecipeManager.RegisterItemHeat();
		
		GameRegistry.registerCraftingHandler( new CraftingHandler() );
	}
	
}