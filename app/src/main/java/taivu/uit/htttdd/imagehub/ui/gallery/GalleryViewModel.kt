package taivu.uit.htttdd.imagehub.ui.gallery

import javax.inject.Inject
import androidx.lifecycle.ViewModel
import taivu.uit.htttdd.imagehub.data.UnsplashRepository

class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
): ViewModel() {
}