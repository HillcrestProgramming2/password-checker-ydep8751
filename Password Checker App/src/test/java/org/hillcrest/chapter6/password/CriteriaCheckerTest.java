package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CriteriaCheckerTest {

    /**
     * Tests a weak password that meets only a single criteria.
     * checks both the score and the strength.
     */
    @Test
    public void testWeakPassword() {
        assertEquals(1, CriteriaChecker.evaluateCriteria("12345"));
        assertEquals("Weak", CriteriaChecker.determineStrength(1));
    }

    /**
     * Tests a moderate strength password that meets three criteria.
     */
    @Test
    public void testModeratePassword() {
        assertEquals(3, CriteriaChecker.evaluateCriteria("yuvan123"));
        assertEquals("Moderate", CriteriaChecker.determineStrength(3));
    }

    /**
     * Tests a strong password that meets all five criteria.
     */
    @Test
    public void testStrongPassword() {
        assertEquals(5, CriteriaChecker.evaluateCriteria("Yuvan@depatla*1234"));
        assertEquals("Strong", CriteriaChecker.determineStrength(5));
    }
}
