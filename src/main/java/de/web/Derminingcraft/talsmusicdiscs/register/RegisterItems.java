/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 ^ TalsMusicDiscs is a minecraft modification                                                     ^
 ^ Copyright (C) 2025 Tal (Roberto De Luca)                                                       ^
 ^                                                                                                ^
 ^ This program is free software: you can redistribute it and/or modify                           ^
 ^ it under the terms of the GNU General Public License as published by                           ^
 ^ the Free Software Foundation, either version 3 of the License, or                              ^
 ^ (at your option) any later version.                                                            ^
 ^                                                                                                ^
 ^ This program is distributed in the hope that it will be useful,                                ^
 ^ but WITHOUT ANY WARRANTY; without even the implied warranty of                                 ^
 ^ MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                                  ^
 ^ GNU General Public License for more details.                                                   ^
 ^                                                                                                ^
 ^ You should have received a copy of the GNU General Public License                              ^
 ^ along with this program.  If not, see <https://www.gnu.org/licenses/>.                         ^
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/

package de.web.Derminingcraft.talsmusicdiscs.register;

import cpw.mods.fml.common.registry.GameRegistry;

import static de.web.Derminingcraft.talsmusicdiscs.init.initItems.*;

/**
 * Created by Roberto on 22/03/2025.
 */
public class RegisterItems
{
    public static void MusicDiscs()
    {
        // Orange Music Discs
        GameRegistry.registerItem(musicDiscOrange1, "musicDiscOrange1");
        // Purple Music Discs
        GameRegistry.registerItem(musicDiscPurple1, "musicDiscPurple1");
    }
    public static void CastMold()
    {
        GameRegistry.registerItem(cast, "cast");
        GameRegistry.registerItem(mold, "mold");
    }
    public static void VinylBase()
    {
        GameRegistry.registerItem(baseOrange, "baseOrange");
        GameRegistry.registerItem(basePurple, "basePurple");
        //GameRegistry.registerItem(baseWhite, "baseWhite");
        //GameRegistry.registerItem(baseMagenta, "baseMagenta");
        //GameRegistry.registerItem(baseLightBlue, "baseLightBlue");
        //GameRegistry.registerItem(baseYellow, "baseYellow");
        //GameRegistry.registerItem(baseLime, "baseLime");
        //GameRegistry.registerItem(basePink, "basePink");
        //GameRegistry.registerItem(baseGray, "baseGray");
        //GameRegistry.registerItem(baseLightGray, "baseLightGray");
        //GameRegistry.registerItem(baseCyan, "baseCyan");
        //GameRegistry.registerItem(baseBlue, "baseBlue");
        //GameRegistry.registerItem(baseBrown, "baseBrown");
        //GameRegistry.registerItem(baseGreen, "baseGreen");
        //GameRegistry.registerItem(baseRed, "baseRed");
        //GameRegistry.registerItem(baseBlack, "baseBlack");
    }
}
