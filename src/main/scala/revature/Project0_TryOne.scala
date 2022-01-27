package revature

import java.sql.DriverManager
import java.time.{LocalDate, Year}
import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Project0_TryOne {
  def genrePicker(): Int = {
    println(
      """
        |Choose which genre you want to watch.
        |Enter a number to make a selection:
        |1) Drama
        |2) Action
        |3) Comedy
        |4) Horror
        |5) Sci-Fi
        |6) Thriller
        |7) Western
        |8) Romance
        |9) Adventure
        |10) Crime
        |11) Musical
        |12) Fantasy
        |13) Biographical
        |14) GO BACK TO PREVIOUS PAGE
        |""".stripMargin)

    val choice = readInt()
    choice
  }

  @tailrec
  def laMovieGenrePicker(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    val choice = genrePicker()
    //If you pick Drama
    if (choice==1){
      println("LIVE-ACTION DRAMA MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Drama'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        //val mDirector = resultSet.getString("mDirector")
        //val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        //val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        //val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    //If you pick Action
    else if(choice==2){
      println("LIVE-ACTION ACTION MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Action'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    //If you pick Comedy
    else if(choice==3){
      println("LIVE-ACTION COMEDY MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Comedy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }

    //If you picked Horror Movies
    else if(choice==4){
      println("LIVE-ACTION HORROR MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Horror'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    //If you picked Sci-fi
    else if(choice==5){
      println("LIVE-ACTION SCI-FI MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Sci-fi'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    //If you picked Thriller
    else if(choice==6){
      println("LIVE-ACTION THRILLER MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Thriller'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Western
    else if(choice==7){
      println("LIVE-ACTION WESTERN MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Western'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Romance
    else if(choice==8){
      println("LIVE-ACTION ROMANCE MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Romance'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Adventure
    else if(choice==9){
      println("LIVE-ACTION ADVENTURE MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Adventure'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Crime
    else if(choice==10){
      println("LIVE-ACTION CRIME MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Crime'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Musical
    else if(choice==11){
      println("LIVE-ACTION MUSICAL MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Musical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Fantasy
    else if(choice==12){
      println("LIVE-ACTION FANTASY MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Fantasy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you pick Biographical
    else if(choice==13){
      println("LIVE-ACTION BIOGRAPHICAL MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Biographical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if (choice == 14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      laMovieGenrePicker()
    }

  }

  @tailrec
  def animatedMovieGenrePicker(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""
    val choice = genrePicker()

    //If you chose Drama
    if (choice==1){
      println("ANIMATED DRAMA MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Drama'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Action
    else if(choice==2){
      println("ANIMATED ACTION MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Action'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Comedy
    else if(choice==3){
      println("ANIMATED COMEDY MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Comedy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Horror
    else if(choice==4){
      println("ANIMATED HORROR MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Horror'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Sci-fi
    else if(choice==5){
      println("ANIMATED SCI-FI MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Sci-fi'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Thriller
    else if(choice==6){
      println("ANIMATED THRILLER MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Thriller'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Western
    else if(choice==7){
      println("ANIMATED WESTERN MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Western'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Romance
    else if(choice==8){
      println("ANIMATED ROMANCE MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Romance'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Adventure
    else if(choice==9){
      println("ANIMATED ADVENTURE MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Adventure'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Crime
    else if(choice==10){
      println("ANIMATED CRIME MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Crime'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Musical
    else if(choice==11){
      println("ANIMATED MUSICAL MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Musical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Fantasy
    else if(choice==12){
      println("ANIMATED FANTASY MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Fantasy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
      //If you chose Biographical
    else if(choice==13){
      println("ANIMATED BIOGRAPHICAL MOVIES:")
      query = "SELECT * FROM movie WHERE mLaStatus = 0 and mGenre = 'Biographical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val movie_id = resultSet.getString("movie_id")
        val mTitle = resultSet.getString("mTitle")
        val mDirector = resultSet.getString("mDirector")
        val mRuntimeMin = resultSet.getString("mRunTimeMin")
        val mYearReleased = resultSet.getString("mYearReleased")
        val mGenre = resultSet.getString("mGenre")
        val mRating = resultSet.getString("mRating")
        val mLaStatus = resultSet.getString("mLaStatus")
        println(("%s (%s) (%s)").format(mTitle, mYearReleased, mRating))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedMovieGenrePicker()
      }
      else{
        0
      }
    }
    else if (choice == 14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      animatedMovieGenrePicker()
    }
  }

  //DEALING WITH THE SHOWS NOW:
  @tailrec
  def laShowGenrePicker(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    val choice = genrePicker()
    //If you choose Drama Live Action Show:
    if (choice==1){
      println("LIVE-ACTION DRAMA SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Drama'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Action Show:
    else if(choice==2){
      println("LIVE-ACTION ACTION SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Action'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Comedy Show:
    else if(choice==3){
      println("LIVE-ACTION COMEDY SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Comedy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Horror Show:
    else if(choice==4){
      println("LIVE-ACTION HORROR SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Horror'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Sci-fi Show:
    else if(choice==5){
      println("LIVE-ACTION SCI-FI SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Sci-fi'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Thriller Show:
    else if(choice==6){
      println("LIVE-ACTION THRILLER SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Thriller'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Western Show:
    else if(choice==7){
      println("LIVE-ACTION WESTERN SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Western'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Romance Show:
    else if(choice==8){
      println("LIVE-ACTION ROMANCE SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Romance'"
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Adventure Show:
    else if(choice==9){
      println("LIVE-ACTION ADVENTURE SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Adventure'"
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Crime Show:
    else if(choice==10){
      println("LIVE-ACTION CRIME SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Crime'"
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Musical Shows:
    else if(choice==11){
      println("LIVE-ACTION MUSICAL SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Musical'"
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Fantasy Shows:
    else if(choice==12){
      println("LIVE-ACTION FANTASY SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Fantasy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose LA Biographical Shows:
    else if(choice==13){
      println("LIVE-ACTION BIOGRAPHICAL SHOWS:")
      println("Live-Action Biographical Shows.")
      query = "SELECT * FROM series WHERE sLaStatus = 1 and sGenre = 'Biographical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        laShowGenrePicker()
      }
      else{
        0
      }
    }
    else if (choice == 14){
      aniOrLAShow()
    }
    else{
      println("Enter a valid number (1-14).")
      laShowGenrePicker()
    }
  }

  @tailrec
  def animatedShowGenrePicker(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    val choice = genrePicker()
    //If you choose animated Drama Shows:
    if (choice==1){
      println("ANIMATED DRAMA SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Drama'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated Action Shows:
    else if(choice==2){
      println("ANIMATED ACTION SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Action'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose Animated Comedy Shows:
    else if(choice==3){
      println("ANIMATED COMEDY SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Comedy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose Animated Horror Shows:
    else if(choice==4){
      println("ANIMATED HORROR SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Horror'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }

      //If you choose animated Sci-fi shows:
    else if(choice==5){
      println("ANIMATED SCI-FI SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Sci-fi'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose Animated Thriller Shows:
    else if(choice==6){
      println("ANIMATED THRILLER SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Thriller'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose Animated Western Shows:
    else if(choice==7){
      println("ANIMATED WESTERN SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Western'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated Romance shows:
    else if(choice==8){
      println("ANIMATED ROMANCE SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Romance'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated Adventure Shows:
    else if(choice==9){
      println("ANIMATED ADVENTURE SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Adventure'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated crime shows:
    else if(choice==10){
      println("ANIMATED CRIME SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Crime'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated Musical Shows:
    else if(choice==11){
      println("ANIMATED MUSICAL SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Musical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose animated Fantasy Shows:
    else if(choice==12){
      println("ANIMATED FANTASY SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Fantasy'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
      //If you choose Animated Biographical Shows
    else if(choice==13){
      println("ANIMATED BIOGRAPHICAL SHOWS:")
      query = "SELECT * FROM series WHERE sLaStatus = 0 and sGenre = 'Biographical'"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        //val series_id = resultSet.getString("series_id")
        val sTitle = resultSet.getString("sTitle")
        //val sCreator = resultSet.getString("sCreator")
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
        println(("%s (%s) (%s - %s)\t\t" + " Number of Seasons = %s " +
          "%s").format(sTitle, sRating, sYearReleased, unfinished,
          numOfSeasons, isCancelled))
      }
      //This is outside of while loop
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        animatedShowGenrePicker()
      }
      else{
        0
      }
    }
    else if (choice == 14){
      aniOrLAShow()
    }
    else{
      println("Enter a valid number (1-14).")
      animatedShowGenrePicker()
    }
  }

  @tailrec
  def aniOrLAMovie(): Unit={
    println(
      """
        |Do you want to watch an animated film or a live-action film?
        |Enter a number to select an option:
        |1) Live-Action
        |2) Animated
        |3) GO BACK TO PREVIOUS PAGE
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1){
      laMovieGenrePicker()
    }
    else if(choice == 2){
      animatedMovieGenrePicker()
    }
    else if (choice == 3){
      movieOrShow()
    }
    else{
      println("Enter a valid number (1-3)")
      aniOrLAMovie()
    }
  }

  @tailrec
  def aniOrLAShow(): Unit = {
    println(
      """
        |Do you want to watch an animated series or a live-action series?
        |Enter a number to select an option:
        |1) Live-Action
        |2) Animated
        |3) GO BACK TO PREVIOUS PAGE
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1){
      laShowGenrePicker()
    }
    else if(choice == 2){
      animatedShowGenrePicker()
    }
    else if (choice == 3){
      movieOrShow()
    }
    else{
      println("Enter a valid number (1-3)")
      aniOrLAShow()
    }

  }

  @tailrec
  def movieOrShow(): Unit = {
    println(
      """
        |Do you want to watch a movie or a series?
        |Enter a number to select an option:
        |1) Movie
        |2) Series
        |3) GO BACK TO PREVIOUS PAGE
        |""".stripMargin)
    val choice = readInt()

    if (choice == 1 ){
      aniOrLAMovie()
    }
    else if (choice == 2){
      aniOrLAShow()
    }
    else if (choice == 3){
      possibilities()
    }
    else{
      println("Enter a valid number (1-3).")
      movieOrShow()
    }

  }

  def watchlistCheck(): Unit = {
    println("Here is your watchlist.")
  }

  @tailrec
  def possibilities(): Unit = {
    println(
      """
        |Welcome to the Screen Servant!
        |Enter a number to select a category:
        |1) View my watchlist
        |2) View my watched list
        |3) Browse movie collection
        |4) Login to user account
        |5) Create user account
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1) {
      println("Here is your watchlist.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        possibilities()
      }
      else{
        0
      }

    }
    else if (choice == 2){
      println("Here is your watched list.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        possibilities()
      }
      else{
        0
      }
    }
    else if(choice == 3){
      movieOrShow()
    }
    else{
      println("Enter a valid number (1-3).")
      possibilities()
    }
  }

  def main (args: Array[String]): Unit = {
    possibilities()
  }

}


