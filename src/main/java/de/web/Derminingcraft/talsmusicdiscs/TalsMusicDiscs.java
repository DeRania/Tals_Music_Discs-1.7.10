/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 ^^     TalsMusicDiscs is a minecraft modification
 ^^     Copyright (C) 2025  Tal (Roberto De Luca)
 ^^                                            ^^
 ^^     This program is free software: you can redistribute it and/or modify
 ^^     it under the terms of the GNU General Public License as published by
 ^^     the Free Software Foundation, either version 3 of the License, or
 ^^     (at your option) any later version.    ^^
 ^^                                            ^^
 ^^     This program is distributed in the hope that it will be useful,
 ^^     but WITHOUT ANY WARRANTY; without even the implied warranty of
 ^^     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 ^^     GNU General Public License for more details.
 ^^                                            ^^
 ^^     You should have received a copy of the GNU General Public License
 ^^     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
package de.web.Derminingcraft.talsmusicdiscs;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.web.Derminingcraft.talsmusicdiscs.events.LoginChat;
import de.web.Derminingcraft.talsmusicdiscs.handlers.ConfigurationHandler;
import de.web.Derminingcraft.talsmusicdiscs.proxy.IProxy;
import de.web.Derminingcraft.talsmusicdiscs.reference.Reference;
import cpw.mods.fml.common.Mod;
import de.web.Derminingcraft.talsmusicdiscs.register.RegisterItems;
import de.web.Derminingcraft.talsmusicdiscs.update.UpdateCheck;
import de.web.Derminingcraft.talsmusicdiscs.utility.LogHelper;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.MOD_VERSION,
        dependencies = Reference.MOD_DEPENDICES,
        acceptedMinecraftVersions = Reference.MC_VERSION,
        canBeDeactivated = true,
        guiFactory = Reference.GUI_FACTORY_CLASS
    )

public class TalsMusicDiscs
{
    @Mod.Instance
    public static TalsMusicDiscs instance = new TalsMusicDiscs();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preinit(FMLPreInitializationEvent event)
    {
        //Configuration Manager
        String configDir = event.getModConfigurationDirectory().toString();
        ConfigurationHandler.init(configDir);
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Check for Updates
        UpdateCheck.checkForUpdates();
        FMLCommonHandler.instance().bus().register(new LoginChat());

        LogHelper.info("Registering Items");
        RegisterItems.MusicDiscs();


        LogHelper.info("preInitialization Complete");

        LogHelper.info("I love you Kida :3");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");

        LogHelper.info("I love you soooo much");
    }

    @Mod.EventHandler
    public static void init(FMLPostInitializationEvent event)
    {
        LogHelper.info("postInitialization Complete");

        LogHelper.info("you wouldn't believe how much i love you <3");
    }
}
