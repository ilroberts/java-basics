package chapter1;

import org.junit.*;
import static org.junit.Assert.*;

public class UniqueCharsTest {

    public UniqueCharsTest() {
    }

    @Test
    public void testNonUniqueChars() {

        String input = "mindovermatter";
        assertFalse(UniqueChars.hasUniqueChars(input));
    }

    @Test
    public void testUniqueChars() {

        String input = "thequickfox";
        assertTrue(UniqueChars.hasUniqueChars(input));
    }
}

