package com.example.redballtoy.films_gb.model


//Возвращает начальный список фильмов
class Films {

    private val films = listOf(
            Film(
                    false,
                    "/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg",
                    mapOf(
                            12 to "Adventure",
                            878 to "Science Fiction",
                            28 to "Action"
                    ),
                    "https://www.marvel.com/movies/avengers-endgame",
                    299534,
                    "Avengers: Endgame",
                    298.619,
                    "16+",
                    "/ulzhLuWrPK07P1YkdWQLZnQh1JL.jpg",
                    181,
                    "Avengers: Endgame",
                    8.3,
                    17277,
                    "After the devastating events of Avengers: Infinity War, the universe " +
                            "is in ruins due to the efforts of the Mad Titan, Thanos. With the help " +
                            "of remaining allies, the Avengers must assemble once more in order to undo " +
                            "Thanos' actions and restore order to the universe once and for all, no matter " +
                            "what consequences may be in store."
            ),

            //Tenet
            Film(
                    false,
                    "/wzJRB4MKi3yK138bJyuL9nx47y6.jpg",
                    mapOf(
                            53 to "Thriller",
                            878 to "Science Fiction",
                            28 to "Action"
                    ),
                    "https://www.tenetfilm.com/",
                    577922,
                    "Tenet",
                    473.116,
                    "16+",
                    "/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                    97,
                    "Tenet",
                    7.3,
                    4795,
                    "Armed with only one word - Tenet - and fighting for the survival of the entire " +
                            "world, the Protagonist journeys through a twilight world of international espionage " +
                            "on a mission that will unfold in something beyond real time."
            ),

            //Black Widow
            Film(
                    false,
                    "/oH2sbig0rywDIPWZVPGyiIZc8fT.jpg",
                    mapOf(
                            53 to "Thriller",
                            80 to "Нет данных",
                            9648 to "Нет данных",
                            10770 to "Нет данных"
                    ),
                    "https://www.tenetfilm.com/",
                    255577,
                    "Black Widow",
                    11.596,
                    "16+",
                    "/khKyzgKESxwxsiEIvbNRACa5mRc.jpg",
                    102,
                    "Black Widow",
                    5.2,
                    6,
                    "Mel, a photo journalist, gets suspicious when her best friend Danny " +
                            "start dating Olivia a wealthy but mysterious woman. She enlists the " +
                            "help of her assistant in investigating Olivia's past and present " +
                            "occupation putting herself in danger."
            ),
            //Wonder Woman 1984
            Film(
                    false,
                    "/egg7KFi18TSQc1s24RMmR9i2zO6.jpg",
                    mapOf(
                            14 to "Нет данных",
                            28 to "Action",
                            12 to "Нет данных"
                    ),
                    "https://www.tenetfilm.com/",
                    464052,
                    "Wonder Woman 1984",
                    1861.792,
                    "16+",
                    "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                    120,
                    "Wonder Woman 1984",
                    6.8,
                    4474,
                    "A botched store robbery places Wonder Woman in a global battle against " +
                            "a powerful and mysterious ancient force that puts her powers in jeopardy."
            )
    )

    fun getFilms() = films

    fun getFilmById(id: Int): Film? = films.find { it.id == id }

    fun getFilmsCount(): Int = films.size

}



