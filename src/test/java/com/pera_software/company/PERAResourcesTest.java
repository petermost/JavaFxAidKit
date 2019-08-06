package com.pera_software.company;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.pera_software.aidkit.io.ResourceNotFoundException;

public class PERAResourcesTest {

	@Test
	public void testGetResourceAsStream() throws ResourceNotFoundException {
		assertNotNull(PERAResources.getResourceAsStream( PERAResources.LOGO_NAME));
	}

}
