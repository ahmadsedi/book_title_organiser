package com.ahmadsedi.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 30/01/2025
 * Time: 15:40
 */

public class BookTitleReporterTest {
    @Test
    void prefixTitles1(){
        String[] titles = {"wall", "wall paper", "wall street", "phil", "philadelphia"};
        int result = BookTitleReporter.prefixTitles(titles);
        Assertions.assertEquals(3, result);
    }
    @Test
    void prefixTitles2(){
        String[] titles = {"a", "a", "aa", "aaaab", "philadelphia"};
        int result = BookTitleReporter.prefixTitles(titles);
        Assertions.assertEquals(7, result);
    }
    @Test
    void prefixTitles_givenEmptyArray_returnZero(){
        String[] titles = {};
        int result = BookTitleReporter.prefixTitles(titles);
        Assertions.assertEquals(0, result);
    }
}
