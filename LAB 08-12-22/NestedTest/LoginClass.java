package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class LoginClass {
	@Test
	void verifyLoginID() {
		String id = "ashutosh@91";
		assertEquals(id, "ashutosh@91", "Valid login id ");
		System.out.println("OUTERMOST CLASS - LoginClass");
	}

	@Nested
	@DisplayName("Nested test")
	class nestedPasswordClass{
		@Test
		void verifyPassword() {
			String passwd = "ashutosh1234";
			assertEquals(passwd, "ashutosh1234", "Valid password");
			System.out.println("NESTED CLASS - nestedPasswordClass");
		}
	}
}

