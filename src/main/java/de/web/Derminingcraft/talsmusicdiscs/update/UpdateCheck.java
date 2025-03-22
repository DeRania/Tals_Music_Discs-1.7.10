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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Scanner;

import de.web.Derminingcraft.talsmusicdiscs.reference.Reference;
import de.web.Derminingcraft.talsmusicdiscs.reference.updateInfo;
import de.web.Derminingcraft.talsmusicdiscs.utility.LogHelper;
import java.net.URL;

/**
 * Created by Roberto on 21/03/2025.
 */
public class UpdateCheck
{
    public static void checkForUpdates()
    {
        try {
            String updatePath = "http://tal.free.nf/gallery/TalsMusicDiscs.txt";
            URL url = new URL(updateInfo.updatePath);

            HttpURLConnection connection = (HttpURLConnection) new URL(url.toString()).openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            //404 == file not found
            //500 == file is forbidden access
            //200 == all good
            LogHelper.info("UpdateChecker got response " + responseCode);

            if(responseCode != 200)
            {
                updateInfo.updateErrored = true;
            }
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNextLine())
            {
                updateInfo.modUpdate.add(scanner.nextLine());
            }
            scanner.close();

            updateInfo.updateArray = updateInfo.modUpdate.stream().toArray(String[]::new);

            if (!updateInfo.updateArray[0].startsWith("0"))
            {
                updateInfo.updateErrored = true;
            }
            else
            {
                if(!Reference.MOD_VERSION.endsWith(updateInfo.updateArray[0]))
                {
                    updateInfo.updateIsAvailable = true;
                    updateInfo.updateLN1 = updateInfo.updateArray[1];
                    updateInfo.updateLN2 = updateInfo.updateArray[2];
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
