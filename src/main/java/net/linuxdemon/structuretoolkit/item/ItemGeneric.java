package net.linuxdemon.structuretoolkit.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.linuxdemon.structuretoolkit.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGeneric extends Item
{
	public ItemGeneric ()
	{
		super();
		this.maxStackSize = 1;
		this.setCreativeTab( Reference.CREATIVE_TAB );
	}

	@Override
	public String getUnlocalizedName ()
	{
		return String.format( "item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
	}

	@Override
	public String getUnlocalizedName ( ItemStack itemStack )
	{
		return String.format( "item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons ( IIconRegister iconRegister )
	{
		itemIcon = iconRegister.registerIcon( this.getUnlocalizedName().substring( this.getUnlocalizedName().indexOf( "." ) + 1 ) );
	}

	protected String getUnwrappedUnlocalizedName ( String unlocalizedName )
	{
		return unlocalizedName.substring( unlocalizedName.indexOf( "." ) + 1 );
	}

}
