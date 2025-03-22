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

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.Collections;
import java.util.Set;

public class GuiFactory implements IModGuiFactory
{

    @Override
    public void initialize(Minecraft minecraftInstance) {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return ModGUIConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return Collections.emptySet();
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}
