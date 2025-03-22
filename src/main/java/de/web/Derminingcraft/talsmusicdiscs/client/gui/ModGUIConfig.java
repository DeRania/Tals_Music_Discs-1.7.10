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
package de.web.Derminingcraft.talsmusicdiscs.client.gui;


import cpw.mods.fml.client.config.GuiConfig;
import de.web.Derminingcraft.talsmusicdiscs.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import static de.web.Derminingcraft.talsmusicdiscs.handlers.ConfigurationHandler.*;
public class ModGUIConfig extends GuiConfig
{

    public ModGUIConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(getConfiguration().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(getConfiguration().toString()));
    }
}
