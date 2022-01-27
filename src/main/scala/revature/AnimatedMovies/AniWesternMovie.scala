package revature.AnimatedMovies

import java.sql.DriverManager
import scala.io.StdIn.readInt
import revature.Project0_TryOne.animatedMovieGenrePicker

object AniWesternMovie {
  //This function does the actual adding of the movie you choose to the watchlist
  //or it adds it to the watched list.
  def addingAniWestern(yourLAMovieSelection: Int, a: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var queryThis = " "
    //val more = readInt()
    queryThis = s"SELECT * from movie where movie_id = $yourLAMovieSelection"
    val resultAdd = s.executeQuery(queryThis)
    while (resultAdd.next) {
      val mRuntimeMin = resultAdd.getString("mRunTimeMin")

      //Choose what you want to do with the movie you are looking at.
      println(
        """
          |What would you like to do?
          |Enter a number to make a choice:
          |1) Add to watchlist
          |2) Watch
          |3) GO BACK
          |""".stripMargin)
      val decide = readInt()
      if (decide == 1) {
        println("The movie has been added to your watchlist.")
        //Go back to the other movies from the genre you chose.
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for NO.
            |""".stripMargin)
        val back = readInt()
        if (back == 1) {
          AniWesternMoviesButNotStuck(a)
        }
        else {
          System.exit(0)
        }
      }
      else if (decide == 2) {
        println(s"You have wasted $mRuntimeMin mins of your life.")
        //Go back to the other movies from the genre you chose.
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for NO.
            |""".stripMargin)
        val back = readInt()
        if (back == 1) {
          AniWesternMoviesButNotStuck(a)
        }
        else {
          //QUIT
          System.exit(0)
        }
      }
      else if (decide == 3) {
        AniWesternMoviesButNotStuck(a)
      }
      else {
        println("Enter a valid number to make a selection (1-3).")
        addingAniWestern(yourLAMovieSelection, a)
      }
    }
  }

  //Function to add a movie you choose to your watchlist for watching later.
  def moreOfAAniWesternMovie(y: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()

    //Choose a movie to see more info about it
    println(
      """
        |Enter the id number of the movie you want to select:
        |""".stripMargin)
    var query1 = " "
    val more = readInt()
    query1 = s"SELECT * from movie where movie_id = $more"
    val resultNew = s.executeQuery(query1)
    while (resultNew.next) {
      val movie_id = resultNew.getString("movie_id")
      val mTitle = resultNew.getString("mTitle")
      val mDirector = resultNew.getString("mDirector")
      val mRuntimeMin = resultNew.getString("mRunTimeMin")
      val mYearReleased = resultNew.getString("mYearReleased")
      //val mGenre = resultNew.getString("mGenre")
      val mRating = resultNew.getString("mRating")
      //val mLaStatus = resultSet.getString("mLaStatus")
      println(("%s) %s (%s) (%s) (%s mins)").format(movie_id, mTitle, mYearReleased, mRating, mRuntimeMin))
      println(("Director = %s" + "\n").format(mDirector))

      //This function does the actual adding of the movie you choose to the watchlist
      //or it adds it to the watched list.
      addingAniWestern(more, y)
    }

  }


  //LADramaMovies
  def AniWesternMovies(ahhh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("ANIMATED WESTERN MOVIES:")
    query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Western'"
    //println("Live-Action Drama Movies.")
    val resultSet = s.executeQuery(query)
    while (resultSet.next) {
      val movie_id = resultSet.getString("movie_id")
      val mTitle = resultSet.getString("mTitle")
      //val mDirector = resultSet.getString("mDirector")
      //val mRuntimeMin = resultSet.getString("mRunTimeMin")
      val mYearReleased = resultSet.getString("mYearReleased")
      //val mGenre = resultSet.getString("mGenre")
      val mRating = resultSet.getString("mRating")
      //val mLaStatus = resultSet.getString("mLaStatus")
      println(("%s) %s (%s) (%s)").format(movie_id, mTitle, mYearReleased, mRating))
    }
    moreOfAAniWesternMovie(ahhh)
  }

  //LADramaMovies But You Aren't Stuck:
  def AniWesternMoviesButNotStuck(huh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("ANIMATED WESTERN MOVIES:")
    query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Western'"
    //println("Live-Action Drama Movies.")
    val resultSet = s.executeQuery(query)
    while (resultSet.next) {
      val movie_id = resultSet.getString("movie_id")
      val mTitle = resultSet.getString("mTitle")
      //val mDirector = resultSet.getString("mDirector")
      //val mRuntimeMin = resultSet.getString("mRunTimeMin")
      val mYearReleased = resultSet.getString("mYearReleased")
      //val mGenre = resultSet.getString("mGenre")
      val mRating = resultSet.getString("mRating")
      //val mLaStatus = resultSet.getString("mLaStatus")
      println(("%s) %s (%s) (%s)").format(movie_id, mTitle, mYearReleased, mRating))
    }
    //If you want to go back and choose a different genre
    //for a live-action movie:

    println(
      """
        |Would you like to go back?
        |Or do you want to select a movie?
        |1 for GO BACK. 2 for SELECTION MENU.
        |""".stripMargin)
    val back = readInt()
    if (back == 1) {
      animatedMovieGenrePicker()
    }
    else if (back == 2) {
      AniWesternMovies(huh)
    }
    else {
      println("Please enter a valid number (1-3)." + "\n")
      AniWesternMoviesButNotStuck(huh)
    }
  }

}

