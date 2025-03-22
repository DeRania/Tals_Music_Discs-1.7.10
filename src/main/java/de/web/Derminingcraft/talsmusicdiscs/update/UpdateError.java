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

package de.web.Derminingcraft.talsmusicdiscs.update;

import com.mojang.realmsclient.gui.ChatFormatting;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

/**
 * Created by Roberto on 21/03/2025.
 */
public class UpdateError
{
    public static void UpdateError(PlayerEvent.PlayerLoggedInEvent event)
    {
        event.player.addChatMessage(new ChatComponentText(ChatFormatting.RED + "Tals Music Discs ERROR:"));
        event.player.addChatMessage(new ChatComponentText(ChatFormatting.RED + "There was an error connecting to the update server."));

    }
}
