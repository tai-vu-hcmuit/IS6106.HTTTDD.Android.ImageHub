package taivu.uit.htttdd.imagehub.api

import taivu.uit.htttdd.imagehub.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)