package net.linuxdemon.structuretoolkit;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.linuxdemon.structuretoolkit.handler.ConfigurationHandler;
import net.linuxdemon.structuretoolkit.init.ModBlocks;
import net.linuxdemon.structuretoolkit.init.ModItems;
import net.linuxdemon.structuretoolkit.proxy.IProxy;
import net.linuxdemon.structuretoolkit.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class StructureToolKit
{
	@Mod.Instance(Reference.MOD_ID)
	public static StructureToolKit instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit ( FMLPreInitializationEvent event )
	{
		ConfigurationHandler.init( event.getSuggestedConfigurationFile() );
		FMLCommonHandler.instance().bus().register( new ConfigurationHandler() );

		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init ( FMLInitializationEvent event )
	{

	}

	@Mod.EventHandler
	public void postInit ( FMLPostInitializationEvent event )
	{

	}
}
