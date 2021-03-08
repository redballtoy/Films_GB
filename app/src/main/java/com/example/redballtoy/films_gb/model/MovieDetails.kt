package com.example.redballtoy.films_gb.model

data class FilmDetails(
        val id: Int,
        val backdropMoviePath: String,
        val originalTitle: String,
        val ageCategory: String,
        val gendes: Map<Int, String>,
        val voteAverage: Double,
        val voteCount: Int,
        val overview: String
) {
    constructor() : this(
            id = 212,
            backdropMoviePath = "/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg",
            originalTitle = "Avengers: Endgame",
            ageCategory = "16+",
            gendes = mutableMapOf(
                    12 to "Adventure",
                    878 to "Science Fiction",
                    28 to "Action"),
            voteAverage = 8.3,
            voteCount = 17277,
            overview="After the devastating events of Avengers: Infinity War, the universe\n " +
                    "is in ruins due to the efforts of the Mad Titan, Thanos. With the help\n " +
                    "of remaining allies, the Avengers must assemble once more in order to undo\n " +
                    "Thanos' actions and restore order to the universe once and for all, no matter\n " +
                    "what consequences may be in store.\n"
    ) {
    }

    fun printInfo() :String {
        val outPut: String = "\nid =$id\n" +
                "backdropMoviePath = $backdropMoviePath\n" +
                "originalTitle = $originalTitle\n" +
                "ageCategory = $ageCategory\n" +
                "gendes = ${gendes[12]}\n\t${gendes[878]}\n\t${gendes[28]}\n" +
                "voteAverage= $voteAverage\n" +
                "voteCount= $voteCount\n"+
                "overwiew = $overview"


        return outPut
    }

}