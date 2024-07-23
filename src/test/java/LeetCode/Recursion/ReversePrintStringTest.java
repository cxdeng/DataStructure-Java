package LeetCode.Recursion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrintStringTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    /**
     * Set up the streams to capture the output before each test.
     */
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Restore the original output stream and reset the captured output after each test.
     */
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        outContent.reset(); // Reset output content after each test
    }

    /**
     * Helper method to test the reverse print functionality.
     * @param input the input string to be reversed and printed
     * @param expectedOutput the expected reversed output
     */
    private void testReversePrint(String input, String expectedOutput) {
        ReversePrintString.printStr(input, 0);
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testString1() {
        testReversePrint("abcdefg", "gfedcba");
    }

    @Test
    public void testString2() {
        testReversePrint("hijklmnop", "ponmlkjih");
    }

    @Test
    public void testString3() {
        testReversePrint("123456789", "987654321");
    }

    @Test
    public void testString4() {
        testReversePrint("OpenAI", "IAnepO");
    }

    @Test
    public void testString5() {
        testReversePrint("Python", "nohtyP");
    }

    @Test
    public void testString6() {
        testReversePrint("你好世界", "界世好你");
    }

    @Test
    public void testString7() {
        testReversePrint("HelloWorld", "dlroWolleH");
    }

    @Test
    public void testString8() {
        testReversePrint("DataScience", "ecneicSataD");
    }

    @Test
    public void testString9() {
        testReversePrint("MachineLearning", "gninraeLenihcaM");
    }

    @Test
    public void testString10() {
        testReversePrint("ChatGPT", "TPGtahC");
    }
}