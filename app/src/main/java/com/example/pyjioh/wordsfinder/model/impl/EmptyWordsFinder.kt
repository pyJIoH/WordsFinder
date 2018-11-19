package com.example.pyjioh.wordsfinder.model.impl

import com.example.pyjioh.wordsfinder.model.IWordsFinder

/**
 * An implementation of @IWordsFinder for testing which always return an empty map
 */
class EmptyWordsFinder : IWordsFinder {
    override fun find(letters: Array<CharArray>): Map<Int, String> {
        return HashMap()
    }
}