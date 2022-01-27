package revature.LAMovies

import java.sql.DriverManager
import scala.io.StdIn.readInt
import revature.Project0.laMovieGenrePicker
import revature.watchlist.watchList
import revature.watchAgain._

object LASciFiMovie {
  //This function does the actual adding of the movie you choose to the watchlist
  //or it adds it to the watched list.
  def addingLASciFi(yourLAMovieSelection: Int, a: Int): Unit = {
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
        try{
          watchList.createWatchList()
        }
        catch{
          case e: Exception => //e.printStackTrace()
            val url = "jdbc:mysql://localhost:3306/project0"
            val username = "root"
            val password = "KafeAde!f1a"
            val connection = DriverManager.getConnection(url, username, password)
            val sb = connection.createStatement()
            val sc = connection.createStatement()
            //Get the data from the movie you chose.
            val again = s"SELECT * from movie where movie_id = $yourLAMovieSelection"
            val resultAdd = sb.executeQuery(again)
            while (resultAdd.next) {
              var q = " "
              val mTitle = resultAdd.getString("mTitle")
              val movie_id = resultAdd.getString("movie_id")
              val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
              val date = format.format(new java.util.Date())
              q = s"insert into watchList VALUES($movie_id, '$mTitle', '$date')"
              sc.executeUpdate(q)

            }

            println("The movie has been added to your watchlist.")
            //Go back to the other movies from the genre you chose.
            println(
              """
                |Would you like to go back?
                |1 for YES. 2 for NO.
                |""".stripMargin)
            val back = readInt()
            if (back == 1) {
              LASciFiMoviesButNotStuck(a)
            }
            else {
              System.exit(0)
            }
        }
      }
      else if (decide == 2) {
        try{
          watchAgainDB.createWatchedList()
        }
        catch{
          case e: Exception => //e.printStackTrace()
            val url = "jdbc:mysql://localhost:3306/project0"
            val username = "root"
            val password = "KafeAde!f1a"
            val connection = DriverManager.getConnection(url, username, password)
            val sb = connection.createStatement()
            val sc = connection.createStatement()
            //Get the data from the movie you chose.
            val again = s"SELECT * from movie where movie_id = $yourLAMovieSelection"
            val resultAdd = sb.executeQuery(again)
            while (resultAdd.next) {
              var q = " "
              val mTitle = resultAdd.getString("mTitle")
              val movie_id = resultAdd.getString("movie_id")
              val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
              val date = format.format(new java.util.Date())
              q = s"insert into watchAgain VALUES($movie_id, '$mTitle', '$date')"
              sc.executeUpdate(q)

            }
            println(s"You have wasted $mRuntimeMin mins of your life.")
            //Go back to the other movies from the genre you chose.
            println(
              """
                |Would you like to go back?
                |1 for YES. 2 for NO.
                |""".stripMargin)
            val back = readInt()
            if (back == 1) {
              LASciFiMoviesButNotStuck(a)
            }
            else {
              //QUIT
              System.exit(0)
            }
        }
      }
      else if (decide == 3) {
        LASciFiMoviesButNotStuck(a)
      }
      else {
        println("Enter a valid number to make a selection (1-3).")
        addingLASciFi(yourLAMovieSelection, a)
      }
    }
  }

  //Function to add a movie you choose to your watchlist for watching later.
  def moreOfALASciFiMovie(y: Int): Unit = {
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
      addingLASciFi(more, y)
    }

  }


  //LADramaMovies
  def LASciFiMovies(ahhh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("LIVE-ACTION SCI-FI MOVIES:")
    query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Sci-fi'"
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
    moreOfALASciFiMovie(ahhh)
  }

  //LADramaMovies But You Aren't Stuck:
  def LASciFiMoviesButNotStuck(huh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("LIVE-ACTION SCI-FI MOVIES:")
    query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Sci-fi'"
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
      laMovieGenrePicker()
    }
    else if (back == 2) {
      LASciFiMovies(huh)
    }
    else {
      println("Please enter a valid number (1-3)." + "\n")
      LASciFiMoviesButNotStuck(huh)
    }
  }

}
