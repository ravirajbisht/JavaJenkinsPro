package prg.ravi.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ravi.learning.testSomething.AnotherRandomClass;

import static org.junit.jupiter.api.Assertions.*;

class AnotherRandomClassTest {

    private final AnotherRandomClass anotherRandomClass = new AnotherRandomClass();
    private static final int int1 = 2;
    private static final int int2 = 3;

    private static final int EXPECTED_SUM = 5;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum() {
        assertEquals(EXPECTED_SUM,anotherRandomClass.sum(int1,int2));
    }
}