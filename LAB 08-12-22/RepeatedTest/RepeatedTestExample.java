package testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class RepeatedTestExample {

	@RepeatedTest(5)
	void multiply (TestInfo testInfo) {
       int a=5;
       int b=4;
       assertEquals(20, (a*b));
	}
}
