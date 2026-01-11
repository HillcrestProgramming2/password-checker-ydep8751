package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FeedbackGeneratorTest {

    @Test
    public void testFeedbackForWeakPassword() {
        String expected =
                "- Increase the length to at least 8 characters.\n" +
                        "- Add at least one uppercase letter.\n" +
                        "- Add at least one lowercase letter.\n" +
                        "- Include at least one special character.\n";

        assertEquals(expected, FeedbackGenerator.generateFeedback("12345"));
    }

    @Test
    public void testNoFeedbackForStrongPassword() {
        assertEquals("", FeedbackGenerator.generateFeedback("Yuvan@depatla*1234"));
    }
}
