package com.pera_software.company;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import com.pera_software.aidkit.io.ResourceNotFoundException;

public class PERAResourcesTest {

	@Test
	public void testGetResourceAsStream() throws ResourceNotFoundException {
		assertNotNull(PERAResources.getResourceAsStream( PERAResources.LOGO_NAME));
	}

}
