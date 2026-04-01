import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _trendingPerfumes = MutableStateFlow<List<String>>(emptyList())
    val trendingPerfumes: StateFlow<List<String>> = _trendingPerfumes

    private val _recommendations = MutableStateFlow<List<String>>(emptyList())
    val recommendations: StateFlow<List<String>> = _recommendations

    private val _isLoading = MutableStateFlow<Boolean>(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun loadTrendingPerfumes() {
        viewModelScope.launch {
            _isLoading.value = true
            // Simulate loading data
            // This would be a network call in a real app
            _trendingPerfumes.value = listOf("Perfume 1", "Perfume 2", "Perfume 3")
            _isLoading.value = false
        }
    }

    fun loadAIRecommendations(userWardrobe: List<String>) {
        viewModelScope.launch {
            _isLoading.value = true
            // Simulate loading data based on user wardrobe
            // This would be a network call in a real app
            _recommendations.value = userWardrobe.map { "$it Recommendation" }
            _isLoading.value = false
        }
    }
}