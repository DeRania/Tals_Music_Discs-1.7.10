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
package de.web.Derminingcraft.talsmusicdiscs.utility;

import cpw.mods.fml.common.FMLLog;
import de.web.Derminingcraft.talsmusicdiscs.reference.Reference;
import org.apache.logging.log4j.Level;


public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_ID, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}


