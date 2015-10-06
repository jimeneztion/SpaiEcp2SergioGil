package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User usr;

	@Before
	public void before() {
		usr = new User(1, "Carlos", "Perez");
	}

	@Test
	public void testUser() {
		assertEquals("Number does not match", usr.getNumber(), 1);
		assertEquals("Name does not match", usr.getName(), "Carlos");
		assertEquals("FamilyName does not match", usr.getFamilyName(), "Perez");
	}

	@Test
	public void testUserFirstLetterUppercase() {
		usr = new User(3, "agustin", "garcia");
		assertEquals("Number does not match", usr.getNumber(), 3);
		assertEquals("Name does not match", usr.getName(), "Agustin");
		assertEquals("FamilyName does not match", usr.getFamilyName(), "Garcia");
	}

	@Test
	public void testFullName() {
		assertEquals(usr.fullName(), "Carlos Perez");
	}

	@Test
	public void testInitials() {
		assertEquals(usr.initials(), "C.");
	}
	
    
    @Test
    public void testSetNumber() {
        usr.setNumber(34);
        assertEquals(34,usr.getNumber());
    }
    @Test
    public void testSetName() {
        usr.setName("Pepe");
        assertEquals("Pepe",usr.getName());
    }


}
