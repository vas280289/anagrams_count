import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * A class determining how many anagrams exist in the string
 */
public class AnagramsCounter {
    private final static String SPLITTER = "\\s";

    /**
     * Count anagrams occurrences
     * @param input input string (words divided by space)
     * @return anagrams count
     */
    public static long countAnagrams(String input) {
        String[] words = input.split(SPLITTER);
        Map<String, Set<String>> stringVariables = getVariablesMap(words);

        return stringVariables.values().stream().map(strings -> strings.size() - 1).count();
    }

    private static Map<String, Set<String>> getVariablesMap(String[] words) {
        Map<String, Set<String>> variablesMap = new HashMap<>();

        for (String s : words) {
            if (StringUtils.isNotBlank(s)) {
                String newKey = getAlphabeticalOrder(s);
                Set<String> set = variablesMap.computeIfAbsent(newKey, k -> new HashSet<>());

                set.add(s);
            }
        }

        return variablesMap;
    }

    private static String getAlphabeticalOrder(String s) {
        if (StringUtils.isNotBlank(s)) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            return new String(chars);
        }

        return StringUtils.EMPTY;
    }
}
