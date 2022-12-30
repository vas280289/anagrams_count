import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * AnagramsCounter test ckass {@link AnagramsCounter}
 */
public class AnagramsCounterTest {
    private final static String NON_EMPTY_INPUT = "aa aa odg dog gdo";
    private final static long EXPECTED_NOT_EMPTY = 2;
    private final static String EMPTY_INPUT = StringUtils.EMPTY;
    private final static long EXPECTED_EMPTY = 0;

    /**
     * Count anagrams non-empty string input success scenario
     */
    @Test
    public void countAnagramsTestSuccess() {
        long actual = AnagramsCounter.countAnagrams(NON_EMPTY_INPUT);

        Assert.assertEquals(EXPECTED_NOT_EMPTY, actual);
    }

    /**
     * Count anagrams empty string input success scenario
     */
    @Test
    public void countAnagramsTestSuccessEmptyString() {
        long actual = AnagramsCounter.countAnagrams(EMPTY_INPUT);

        Assert.assertEquals(EXPECTED_EMPTY, actual);
    }
}
