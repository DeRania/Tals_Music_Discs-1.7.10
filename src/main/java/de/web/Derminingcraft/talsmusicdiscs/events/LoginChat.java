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

package de.web.Derminingcraft.talsmusicdiscs.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import de.web.Derminingcraft.talsmusicdiscs.handlers.ConfigurationHandler;
import de.web.Derminingcraft.talsmusicdiscs.reference.updateInfo;
import de.web.Derminingcraft.talsmusicdiscs.update.UpdateError;
import de.web.Derminingcraft.talsmusicdiscs.update.UpdateSuccess;

/**
 * Created by Roberto on 21/03/2025.
 */
public class LoginChat
{
    boolean hasRunThisSession = false;

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
    {
        if (!hasRunThisSession)
        {
            if (ConfigurationHandler.updateCheck)
            {
                if (updateInfo.updateErrored)
                {
                    UpdateError.UpdateError(event);
                } else if (updateInfo.updateIsAvailable)
                {
                    UpdateSuccess.updateSuccess(event);
                } else
                {

                }
                hasRunThisSession = true;
            } else
            {
                hasRunThisSession = true;
            }
        }
    }
}
