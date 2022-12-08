package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import testclasses.Students;

class StudentsTest {

	@Test
	void test() {
		Students s = new Students();
		String name = s.student(0);
		assertEquals("Ashutosh", name);
	}
}
