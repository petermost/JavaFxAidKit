// Copyright 2014 Peter Most, PERA Software Solutions GmbH
//
// This file is part of the JavaAidKit library.
//
// JavaAidKit is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// JavaAidKit is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with JavaAidKit. If not, see <http://www.gnu.org/licenses/>.

package com.pera_software.company;

import java.io.*;
import com.pera_software.aidkit.io.*;

/**
 * @author P. Most
 *
 */
public final class PERAResources {

	public static final String ICON_NAME = "PERA-Icon.png";
	public static final String LOGO_NAME = "PERA-Logo.png";
	
	private PERAResources() {
	}
	
	public static InputStream getResourceAsStream( String resourceName ) throws ResourceNotFoundException {
		return Resources.asStream( PERAResources.class, resourceName );	
	}
}
