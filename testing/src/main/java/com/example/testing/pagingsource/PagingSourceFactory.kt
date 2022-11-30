package com.example.testing.pagingsource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.core.domain.model.Character

class PagingSourceFactory {

    fun create(characters: List<Character>) = object :
        PagingSource<Int, Character>() {

        override fun getRefreshKey(state: PagingState<Int, Character>) = 1

        @Suppress("MagicNumber")
        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Character> =
            LoadResult.Page(characters, null, 20)
    }
}