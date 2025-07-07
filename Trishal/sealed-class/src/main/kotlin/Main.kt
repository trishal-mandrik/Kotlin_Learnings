fun render(state: UiState) = when (state) {
    is UiState.Error -> println("Error")
    is UiState.Loaded -> println("Loading: ${state.title}, ${state.subtitle}")
    UiState.Loading -> println("Loading...")
}

fun main() {
    var state: UiState = UiState.Loading
    render(state)

    state = UiState.Loaded(title = "Kotlin", subtitle = "Is cool!")
    render(state)

    state = UiState.Error(IllegalStateException())
    render(state)
}