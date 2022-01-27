package revature.LAShows

import java.sql.DriverManager
import scala.io.StdIn.readInt
import revature.Project0_TryOne.laShowGenrePicker

object LAAdventureShow {
  //This function does the actual adding of the movie you choose to the watchlist
  //or it adds it to the watched list.
  def addingLAAdventureShow(yourLAShowSelection: Int, a: Int): Unit = {
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
        println("The series has been added to your watchlist.")
        //Go back to the other movies from the genre you chose.
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for NO.
            |""".stripMargin)
        val back = readInt()
        if (back == 1) {
          LAAdventureShowsButNotStuck(a)
        }
        else {
          System.exit(0)
        }
      }
      else if (decide == 2) {
        println(s"You have watched the show.")
        //Go back to the other movies from the genre you chose.
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for NO.
            |""".stripMargin)
        val back = readInt()
        if (back == 1) {
          LAAdventureShowsButNotStuck(a)
        }
        else {
          //QUIT
          System.exit(0)
        }
      }
      else if (decide == 3) {
        LAAdventureShowsButNotStuck(a)
      }
      else {
        println("Enter a valid number to make a selection (1-3).")
        addingLAAdventureShow(yourLAShowSelection, a)
      }
    }
  }

  //Function to add a movie you choose to your watchlist for watching later.
  def moreOfALAAdventureShow(y: Int): Unit = {
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
      addingLAAdventureShow(more, y)
    }

  }


  //LADramaMovies
  def LAAdventureShows(ahhh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("LIVE-ACTION ADVENTURE SHOWS:")
    query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Adventure'"
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
    moreOfALAAdventureShow(ahhh)
  }

  //LADramaMovies But You Aren't Stuck:
  def LAAdventureShowsButNotStuck(huh: Int): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    println("LIVE-ACTION ADVENTURE SHOWS:")
    query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Adventure'"
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
        |Or do you want to select a movie?
        |1 for GO BACK. 2 for SELECTION MENU.
        |""".stripMargin)
    val back = readInt()
    if (back == 1) {
      laShowGenrePicker()
    }
    else if (back == 2) {
      LAAdventureShows(huh)
    }
    else {
      println("Please enter a valid number (1-3)." + "\n")
      LAAdventureShowsButNotStuck(huh)
    }
  }

}

