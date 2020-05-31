package DebuggingAndUnitTesting.Challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

/**
 *CHALLENGE 1:
 * Create the test class and the stub methods, and invoke the fail() method.
 * CHALLENGES 2 and 3:
 * Implement multiple test scenarios for the removePairs() method.
 * CHALLENGE 4:
 * Implement a test scenario for the everyNthChar() method with the input char array
 * containing the letters 'h','e','l','l','o' and n=2. Expected output is 'e','l'.
 * CHALLENGE 5:
 * Implement a test scenario where n is greater than the length of the array.
 * CHALLENGE 6:
 * Implement two test scenarios for the nullIfOddLength() method, one with odd length string,
 * and the other with even length string.
 * CHALLENGE 7:
 * Write the test for the converter() method with the input of a=10, b=5 and output 300.
 * CHALLENGE 8:
 * Add a test to the converter() method with the following scenario.
 * Input must be a=10, b=0, and it should throw an ArithmeticException (divide by 0).
 * CHALLENGE 9:
 * Remove the repetitive code -> SOLVED at the time of creating the tests.
 * The lecturer meant for us to remove multiple instantiations of the Utilities class
 * and encapsulate them in one setUp() method.
 * CHALLENGE 10:
 * Add the following 5 scenarios to the removePairs() method, it's a suggestion not to hardcode them in
 * one test method but to pass them as parameters.
 * The following scenarios are:
 * #1 input= "ABCDEFF", output = "ABCDEF",
 * #2 input= "AB88EFFG", output = "AB8EFG",
 * #3 input= "112233445566", output = "123456",
 * #4 input= "ZYZQQB", output = "ZYZQB",
 * #5 input= "A", output = "A"
 * ALREADY ADDED parametrized testing wherever needed before the challenge.
 * SOLUTION:
 * The code below.
 */

public class UtilitiesTest {

    private Utilities utilities;

    @BeforeEach
    void setUp() {
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @ParameterizedTest
    @MethodSource("everyNthCharArrayProvider")
    void everyNthCharArrayLargerThanN(char[] input, int n, char[] expected) {
        Assertions.assertArrayEquals(expected, utilities.everyNthChar(input,n));
        //challenge 1
//        Assertions.fail("Not implemented");
    }

    private static Stream everyNthCharArrayProvider() {
        return Stream.of(
                Arguments.of(new char[] {'h','e','l','l','o'}, 2, new char[] {'e','l'})
        );
    }

    @org.junit.jupiter.api.Test
    void everyNthCharArraySmallerSizeThanN() {
        Assertions.assertArrayEquals(
                new char[]{'h','e','l','l','o'},
                utilities.everyNthChar(new char[]{'h','e','l','l','o'},10));
        //challenge 1
//        Assertions.fail("Not implemented");
    }

    @ParameterizedTest
    @MethodSource("removePairsStringProvider")
    void removePairsTestStringsLargerThanOneCharacter(String input, String expected) {
        Assertions.assertEquals(expected, utilities.removePairs(input));
        //challenge 1 code
//        Assertions.fail("Not implemented");
    }
    private static Stream removePairsStringProvider() {
        return Stream.of(
                //the last five test scenarios are from the challenge 10
                Arguments.of("AABCDDEFF", "ABCDEF"),
                Arguments.of("AAAAABBBCCD", "ABCD"),
                Arguments.of("TestABCDDD", "TestABCD"),
                Arguments.of("AB","AB"),
                Arguments.of("CC","C"),
                Arguments.of("ABCDEFF","ABCDEF"),
                Arguments.of("AB88EFFG","AB8EFG"),
                Arguments.of("112233445566","123456"),
                Arguments.of("ZYZQQB","ZYZQB"),
                Arguments.of("A","A")
                );
    }


    @org.junit.jupiter.api.Test
    void removePairsTestNull() {
        Assertions.assertNull(utilities.removePairs(null));
        //challenge 1 code
//        Assertions.fail("Not implemented");
    }

    @org.junit.jupiter.api.Test
    void removePairsTestSingleCharacterString() {
        Assertions.assertEquals("A",utilities.removePairs("A"));
        //challenge 1 code
//        Assertions.fail("Not implemented");
    }

    @org.junit.jupiter.api.Test
    void removePairsTestEmptyString() {
        Assertions.assertEquals("",utilities.removePairs(""));
        //challenge 1 code
//        Assertions.fail("Not implemented");
    }

    @ParameterizedTest
    @MethodSource("converterArgumentProvider")
    void converter(int a, int b, int expected) {
        Assertions.assertEquals(expected, utilities.converter(a, b));
        //challenge 1
        //Assertions.fail("Not implemented");
    }

    private static Stream converterArgumentProvider() {
        return Stream.of(
                Arguments.of(10, 5, 300)
        );
    }

    @org.junit.jupiter.api.Test
    void converterDivideByZeroThrowsArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> utilities.converter(10,0));
        //challenge 1
        //Assertions.fail("Not implemented");
    }

    @ParameterizedTest
    @ValueSource( strings = {"Dog"})
    void nullIfOddLengthOddLengthString(String oddLengthString) {
        Assertions.assertNull(utilities.nullIfOddLength(oddLengthString));
        //challenge 1
//        Assertions.fail("Not implemented");
    }

    @ParameterizedTest
    @ValueSource( strings = {"Beer"})
    void nullIfOddLengthEvenLengthString(String evenLengthString) {
        Assertions.assertEquals(evenLengthString,utilities.nullIfOddLength(evenLengthString));
        //challenge 1
//        Assertions.fail("Not implemented");
    }
}
