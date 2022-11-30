package com.example.marvelapp.factory.response

import com.example.marvelapp.framework.network.response.CharacterResponse
import com.example.marvelapp.framework.network.response.DataContainerResponse
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.network.response.ThumbnailResponse

class DataWrapperResponseFactory {

    fun create() = DataWrapperResponse(
        "",
        DataContainerResponse(
            0,
            2,
            listOf(
                CharacterResponse(
                    "1011334",
                    "3-D Man",
                    ThumbnailResponse(
                        "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784",
                        "jpg"
                    )
                ),
                CharacterResponse(
                    "1017100",
                    "A-Bomb (HAS)",
                    ThumbnailResponse(
                        "http://i.annihil.us/u/prod/marvel/i/mg/3/20/5232158de5b16",
                        "jpg"
                    )
                )
            )
        )
    )
}