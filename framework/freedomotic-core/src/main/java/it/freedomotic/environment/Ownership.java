//Copyright 2009 Enrico Nicoletti
//eMail: enrico.nicoletti84@gmail.com
//
//This file is part of EventEngine.
//
//EventEngine is free software; you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation; either version 2 of the License, or
//any later version.
//
//EventEngine is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with EventEngine; if not, write to the Free Software
//Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

package it.freedomotic.environment;

import it.freedomotic.model.environment.Zone;

/**
 *Interfaccia che definisce il metodo <code>decideOwner()</code>
 * che sarà implementato diversamente per ogni politica di ownership.
 */
public interface Ownership {
   //public abstract boolean decideOwnwer(Zone z, int mode);
   abstract boolean canTriggerReactionsOnEnter(ZoneLogic z);
   abstract boolean canTriggerReactionsOnExit(ZoneLogic z);
}
