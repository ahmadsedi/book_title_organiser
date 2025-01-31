package com.ahmadsedi.book;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 31/01/2025
 * Time: 13:38
 */

public class BookTitleReporter {

    public static int prefixTitles(String[] titles) {
        return Stream.iterate(0, i->i+1).limit(titles.length).
                mapToInt(i-> (int) IntStream.range(0, titles.length).
                        filter(j->i!=j&&titles[j].startsWith(titles[i])).count()).sum();
    }
}
