package com.example.pyjioh.wordsfinder

import com.example.pyjioh.wordsfinder.model.impl.EmptyWordsFinder
import org.junit.Test

import org.junit.Assert.*

/**
 * An example of local unit test for [EmptyWordsFinderTest]
 */
class EmptyWordsFinderTest {

    @Test
    fun initializationTest() {
        val letters = Array(0) {charArrayOf()}
        val foundWords = EmptyWordsFinder().find(letters)
        assertEquals(0, foundWords.size)
    }
}
