package revature

import java.sql.DriverManager
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
      query = "SELECT * FROM movie WHERE mLaStatus = 1 and mGenre = 'Drama'"
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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
        println(("Id = %s, Title = %s, Director = %s, Runtime (Min) = %s, Year Released = %s, " +
          "Genre = %s, Rating = %s, Live-Action Status = %s").format(movie_id, mTitle, mDirector,
          mRuntimeMin, mYearReleased, mGenre, mRating, mLaStatus))
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

  @tailrec
  def laShowGenrePicker(): Unit = {
    val choice = genrePicker()
    if (choice==1){
      println("Live-Action Drama Shows.")
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
    else if(choice==2){
      println("Live-Action Action Shows.")
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
    else if(choice==3){
      println("Live-Action Comedy Shows.")
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
    else if(choice==4){
      println("Live-Action Horror Shows.")
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
    else if(choice==5){
      println("Live-Action Sci-Fi Shows.")
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
    else if(choice==6){
      println("Live-Action Thriller Shows.")
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
    else if(choice==7){
      println("Live-Action Western Shows.")
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
    else if(choice==8){
      println("Live-Action Romance Shows.")
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
    else if(choice==9){
      println("Live-Action Adventure Shows.")
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
    else if(choice==10){
      println("Live-Action Crime Shows.")
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
    else if(choice==11){
      println("Live-Action Musical Shows.")
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
    else if(choice==12){
      println("Live-Action Fantasy Shows.")
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
    else if(choice==13){
      println("Live-Action Biopic Shows.")
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
    val choice = genrePicker()
    if (choice==1){
      println("Animated Drama Shows.")
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
    else if(choice==2){
      println("Animated Action Shows.")
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
    else if(choice==3){
      println("Animated Comedy Shows.")
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
    else if(choice==4){
      println("Animated Horror Shows.")
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
    else if(choice==5){
      println("Animated Sci-Fi Shows.")
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
    else if(choice==6){
      println("Animated Thriller Shows.")
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
    else if(choice==7){
      println("Animated Western Shows.")
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
    else if(choice==8){
      println("Animated Romance Shows.")
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
    else if(choice==9){
      println("Animated Adventure Shows.")
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
    else if(choice==10){
      println("Animated Crime Shows.")
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
    else if(choice==11){
      println("Animated Musical Shows.")
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
    else if(choice==12){
      println("Animated Fantasy Shows.")
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
    else if(choice==13){
      println("Animated Biopic Shows.")
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


