package revature.AnimatedShows

import java.sql.DriverManager
import scala.io.StdIn.readInt
import revature.Project0.animatedShowGenrePicker
import revature.watchlist.watchList
import revature.watchAgain._

object AniThrillerShow {
  //This function does the actual adding of the movie you choose to the watchlist
  //or it adds it to the watched list.
  def addingAniThrillerShow(yourLAShowSelection: Int, a: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var queryThis = " "
    //val more = readInt()
    queryThis = s"SELECT * from series where series_id = $yourLAShowSelection"
    val resultAdd = s.executeQuery(queryThis)
    while (resultAdd.next) {
      //val mRuntimeMin = resultAdd.getString("mRunTimeMin")

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
            val again = s"SELECT * from movie where movie_id = $yourLAShowSelection"
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
              AniThrillerShowsButNotStuck(a)
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
            val again = s"SELECT * from movie where movie_id = $yourLAShowSelection"
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
            println(s"You have watched the show.")
            //Go back to the other shows from the genre you chose.
            println(
              """
                |Would you like to go back?
                |1 for YES. 2 for NO.
                |""".stripMargin)
            val back = readInt()
            if (back == 1) {
              AniThrillerShowsButNotStuck(a)
            }
            else {
              //QUIT
              System.exit(0)
            }
        }
      }
      else if (decide == 3) {
        AniThrillerShowsButNotStuck(a)
      }
      else {
        println("Enter a valid number to make a selection (1-3).")
        addingAniThrillerShow(yourLAShowSelection, a)
      }
    }
  }

  //Function to add a movie you choose to your watchlist for watching later.
  def moreOfAAniThrillerShow(y: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()

    //Choose a show to see more info about it
    println(
      """
        |Enter the id number of the series you want to select:
        |""".stripMargin)
    var query1 = " "
    val more = readInt()
    query1 = s"SELECT * from series where series_id = $more"
    val resultNew = s.executeQuery(query1)
    while (resultNew.next) {
      //val series_id = resultSet.getString("series_id")
      val sTitle = resultNew.getString("sTitle")
      val sCreator = resultNew.getString("sCreator")
      val numOfSeasons = resultNew.getString("numOfSeasons")
      val sYearReleased = resultNew.getInt("sYearReleased")
      val sYearFinished = resultNew.getInt("sYearFinished")
      var unfinished = " "
      if (sYearFinished == 0){
        unfinished = "currently airing"
      }
      else{
        val x = String.valueOf(sYearFinished)
        unfinished = x
      }
      val cancelledStatus = resultNew.getInt("cancelledStatus")
      var isCancelled = " "
      if (cancelledStatus==1){
        isCancelled = "(cancelled)"
      }
      else{
        isCancelled = " "
      }
      val sGenre = resultNew.getString("sGenre")
      val sRating = resultNew.getString("sRating")
      val sLaStatus = resultNew.getString("sLaStatus")
      println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
        "%s").format(sTitle, sRating, sYearReleased, unfinished,
        numOfSeasons, isCancelled))
      println(("Creator = %s" + "\n").format(sCreator))

      //This function does the actual adding of the movie you choose to the watchlist
      //or it adds it to the watched list.
      addingAniThrillerShow(more, y)
    }

  }


  //LADramaMovies
  def AniThrillerShows(ahhh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("ANIMATED THRILLER SHOWS:")
    query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Thriller'"
    //println("Live-Action Drama Movies.")
    val resultSet = s.executeQuery(query)
    while (resultSet.next) {
      val series_id = resultSet.getString("series_id")
      val sTitle = resultSet.getString("sTitle")
      val sCreator = resultSet.getString("sCreator")
      val numOfSeasons = resultSet.getString("numOfSeasons")
      val sYearReleased = resultSet.getInt("sYearReleased")
      val sYearFinished = resultSet.getInt("sYearFinished")
      var unfinished = " "
      if (sYearFinished == 0){
        unfinished = "currently airing"
      }
      else{
        val x = String.valueOf(sYearFinished)
        unfinished = x
      }
      val cancelledStatus = resultSet.getInt("cancelledStatus")
      var isCancelled = " "
      if (cancelledStatus==1){
        isCancelled = "(cancelled)"
      }
      else{
        isCancelled = " "
      }
      val sGenre = resultSet.getString("sGenre")
      val sRating = resultSet.getString("sRating")
      val sLaStatus = resultSet.getString("sLaStatus")
      println(("%s) %s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
        "%s").format(series_id, sTitle, sRating, sYearReleased, unfinished,
        numOfSeasons, isCancelled))
    }
    moreOfAAniThrillerShow(ahhh)
  }

  //LADramaMovies But You Aren't Stuck:
  def AniThrillerShowsButNotStuck(huh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("ANIMATED THRILLER SHOWS:")
    query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Thriller'"
    val resultSet = s.executeQuery(query)
    while (resultSet.next) {
      val series_id = resultSet.getString("series_id")
      val sTitle = resultSet.getString("sTitle")
      val sCreator = resultSet.getString("sCreator")
      val numOfSeasons = resultSet.getString("numOfSeasons")
      val sYearReleased = resultSet.getInt("sYearReleased")
      val sYearFinished = resultSet.getInt("sYearFinished")
      var unfinished = " "
      if (sYearFinished == 0){
        unfinished = "currently airing"
      }
      else{
        val x = String.valueOf(sYearFinished)
        unfinished = x
      }
      val cancelledStatus = resultSet.getInt("cancelledStatus")
      var isCancelled = " "
      if (cancelledStatus==1){
        isCancelled = "(cancelled)"
      }
      else{
        isCancelled = " "
      }
      val sGenre = resultSet.getString("sGenre")
      val sRating = resultSet.getString("sRating")
      val sLaStatus = resultSet.getString("sLaStatus")
      println(("%s) %s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
        "%s").format(series_id, sTitle, sRating, sYearReleased, unfinished,
        numOfSeasons, isCancelled))
    }
    //If you want to go back and choose a different genre
    //for a live-action show:
    println(
      """
        |Would you like to go back?
        |Or do you want to select a show?
        |1 for GO BACK. 2 for SELECTION MENU.
        |""".stripMargin)
    val back = readInt()
    if (back == 1) {
      animatedShowGenrePicker()
    }
    else if (back == 2) {
      AniThrillerShows(huh)
    }
    else {
      println("Please enter a valid number (1-3)." + "\n")
      AniThrillerShowsButNotStuck(huh)
    }
  }

}



