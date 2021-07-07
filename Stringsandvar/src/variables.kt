/**
 * A variable is like a container for data
 * Creating a variable
 * var tvShowsWatched = "many"
 * Changing a variable
 * var age = 25
 * age = 26
 * var new age = age + 1
 * You cannot change a variable's type
 */
//There are two types of variables: var(mutable) or (val)immutable

/**
 * Names can contain letters, numbers, and underscores
 * They must start with a letter or an underscore
 * Can be anything except Kotlin keywords
 * Name convention - camelCase
 */
/***
 * Constants are values that do not change
 * are available at complie time - are not calculated during program execution
 * top level - are declared outside of functions
 *
 * convention: names are in all-caps
 */

const val  URL_Link = "google.com"


fun main(args: Array<String>){
    var tvShows = "many"
    println(tvShows)
    tvShows = "too many" //you only need var when you define it
    println(tvShows)

    println("Accessing the URL: $URL_Link")

}

