package taivu.uit.htttdd.imagehub.data

import taivu.uit.htttdd.imagehub.api.UnsplashApi
import javax.inject.Inject

class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}