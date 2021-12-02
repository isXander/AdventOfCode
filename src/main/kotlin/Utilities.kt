fun getResource(name: String): List<String> {
    return {}.javaClass.getResource(name)!!.readText().split("\n")
}