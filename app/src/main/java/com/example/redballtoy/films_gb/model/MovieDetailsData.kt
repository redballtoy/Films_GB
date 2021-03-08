package com.example.redballtoy.films_gb.model


data class MovieDetailsData(
        val id: Int = 212,
        val backdropMoviePath: String = "/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg",
        val originalTitle: String = "Avengers: Endgame",
        val ageCategory: String = "16+",
        val genres: Map<Int, String> = mutableMapOf(
                12 to "Adventure",
                878 to "Science Fiction",
                28 to "Action"),
        val voteAverage: Double = 8.3,
        val voteCount: Int = 17277,
        val overview: String = "After the devastating events of Avengers: Infinity War, the universe " +
                "is in ruins due to the efforts of the Mad Titan, Thanos. With the help " +
                "of remaining allies, the Avengers must assemble once more in order to undo " +
                "Thanos' actions and restore order to the universe once and for all, no matter " +
                "what consequences may be in store."
) {

    fun printInfo(): String {
        val outPut: String = "\nid =$id\n" +
                "backdropMoviePath = $backdropMoviePath\n" +
                "originalTitle = $originalTitle\n" +
                "ageCategory = $ageCategory\n" +
                "genres = ${genres[12]}\n\t${genres[878]}\n\t${genres[28]}\n" +
                "voteAverage= $voteAverage\n" +
                "voteCount= $voteCount\n" +
                "overview = $overview"
        return outPut
    }
}


