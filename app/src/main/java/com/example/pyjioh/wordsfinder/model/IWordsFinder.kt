package com.example.pyjioh.wordsfinder.model

/**
 * A common interface for all WordsFinder implementations
 */
interface IWordsFinder {

    /**
     * Looking for possible words in [letters]
     * @return a map<Int, String> with length of letter to a word
     */
    fun find(letters: Array<CharArray>): Map<Int, String>
}