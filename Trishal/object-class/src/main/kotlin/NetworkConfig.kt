object NetworkConfig: NetworkInfoProvider {
    val baseUrl = "https://api.example.com"
    val userAgent = "demo-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"

    }
}