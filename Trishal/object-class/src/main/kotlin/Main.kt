fun main() {
    println(NetworkConfig.baseUrl)

    println(NetworkConfig.getNetworkDetails())

    val provider: NetworkInfoProvider = object : NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            return "Custom network details"
        }
    }

    println(provider.getNetworkDetails())
}