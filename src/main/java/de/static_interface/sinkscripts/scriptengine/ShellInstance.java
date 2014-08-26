/*
 * Copyright (c) 2014 http://adventuria.eu, http://static-interface.de and contributors
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.static_interface.sinkscripts.scriptengine;

import org.bukkit.command.CommandSender;

public abstract class ShellInstance
{
    private Object executor;
    protected String code;
    private CommandSender sender;

    public ShellInstance(CommandSender sender, Object executor)
    {
        this.sender = sender;
        this.executor = executor;
    }

    public Object getExecutor()
    {
        return executor;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public abstract void clearCache();

    public CommandSender getSender()
    {
        return sender;
    }
}
