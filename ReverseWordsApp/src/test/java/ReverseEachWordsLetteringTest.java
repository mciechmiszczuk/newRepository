
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ReverseEachWordsLetteringTest {

    String enterWord = "word";
    String reverseSentence = "drow";

    @Test
    public void shouldGetNotNullIfSentenceIsNotNull() {
        assertNotNull("should not be null", enterWord);
    }

    @Test
    public void shouldGetTrueIfIsAnySplitsBetweenWordsInSentence() {
        (enterWord).split(enterWord);
    }

    @Test
    public void shouldGetNotNullIfReveerseSentenceIsNotNull() {
        assertNotNull("reverse Sentence should not be null", reverseSentence);
    }

    @Test
    public void testReverseEachWordsLetteringSwap()

    {
        assertEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap ("drow"), "word");

        assertNotEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap("droo"), "word");

        assertEquals(ReverseEachWordsLettering.reverseEachWordsLetteringSwap(""), "");
    }
}