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

package de.web.Derminingcraft.talsmusicdiscs.init;

import de.web.Derminingcraft.talsmusicdiscs.items.CastMold;
import de.web.Derminingcraft.talsmusicdiscs.items.MusicDiscs;
import de.web.Derminingcraft.talsmusicdiscs.items.VinylBase;
import de.web.Derminingcraft.talsmusicdiscs.items.base.BaseItems;

/**
 * Created by Roberto on 22/03/2025.
 */
public class initItems
{
    //The actual Music Discs
    //Orange
    public static final BaseItems musicDiscOrange1 = new MusicDiscs("musicDiscOrange1");
    //Purple
    public static final BaseItems musicDiscPurple1 = new MusicDiscs("musicDiscPurple1");

    //The Vinyl Base precursor for the Discs
    public static final BaseItems baseOrange = new VinylBase("baseOrange");
    public static final BaseItems basePurple = new VinylBase("basePurple");
    public static final BaseItems baseWhite = new VinylBase("baseWhite");
    public static final BaseItems baseMagenta = new VinylBase("baseMagenta");
    public static final BaseItems baseLightBlue = new VinylBase("baseLightBlue");
    public static final BaseItems baseYellow = new VinylBase("baseYellow");
    public static final BaseItems baseLime = new VinylBase("baseLime");
    public static final BaseItems basePink = new VinylBase("basePink");
    public static final BaseItems baseGray = new VinylBase("baseGray");
    public static final BaseItems baseLightGray = new VinylBase("baseLightGray");
    public static final BaseItems baseCyan = new VinylBase("baseCyan");
    public static final BaseItems baseBlue = new VinylBase("baseBlue");
    public static final BaseItems baseBrown = new VinylBase("baseBrown");
    public static final BaseItems baseGreen = new VinylBase("baseGreen");
    public static final BaseItems baseRed = new VinylBase("baseRed");
    public static final BaseItems baseBlack = new VinylBase("baseBlack");

    //The Cast and Mold for the machines
    public static final BaseItems cast = new CastMold("cast");
    public static final BaseItems mold = new CastMold("mold");

}
