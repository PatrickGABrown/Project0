package revature

import revature.watchlist.watchList

import java.sql.DriverManager
//import java.time.{LocalDate, Year}
import scala.annotation.tailrec
import scala.io.StdIn.readInt
import revature.LAMovies.LADramaMovie._
import revature.LAMovies.LAActionMovie._
import revature.LAMovies.LAComedyMovie._
import revature.LAMovies.LAHorrorMovie._
import revature.LAMovies.LASciFiMovie._
import revature.LAMovies.LAThrillerMovie._
import revature.LAMovies.LAWesternMovie._
import revature.LAMovies.LARomanceMovie._
import revature.LAMovies.LAAdventureMovie._
import revature.LAMovies.LACrimeMovie._
import revature.LAMovies.LAMusicalMovie._
import revature.LAMovies.LAFantasyMovie._
import revature.LAMovies.LABioMovie._

import revature.LAShows.LADramaShow._
import revature.LAShows.LAActionShow._
import revature.LAShows.LAComedyShow._
import revature.LAShows.LAHorrorShow._
import revature.LAShows.LASciFiShow._
import revature.LAShows.LAThrillerShow._
import revature.LAShows.LAWesternShow._
import revature.LAShows.LARomanceShow._
import revature.LAShows.LAAdventureShow._
import revature.LAShows.LACrimeShow._
import revature.LAShows.LAMusicalShow._
import revature.LAShows.LAFantasyShow._
import revature.LAShows.LABioShow._

import revature.AnimatedMovies.AniDramaMovie._
import revature.AnimatedMovies.AniActionMovie._
import revature.AnimatedMovies.AniComedyMovie._
import revature.AnimatedMovies.AniHorrorMovie._
import revature.AnimatedMovies.AniSciFiMovie._
import revature.AnimatedMovies.AniThrillerMovie._
import revature.AnimatedMovies.AniWesternMovie._
import revature.AnimatedMovies.AniRomanceMovie._
import revature.AnimatedMovies.AniAdventureMovie._
import revature.AnimatedMovies.AniCrimeMovie._
import revature.AnimatedMovies.AniMusicalMovie._
import revature.AnimatedMovies.AniFantasyMovie._
import revature.AnimatedMovies.AniBioMovie._

import revature.AnimatedShows.AniDramaShow._
import revature.AnimatedShows.AniActionShow._
import revature.AnimatedShows.AniComedyShow._
import revature.AnimatedShows.AniHorrorShow._
import revature.AnimatedShows.AniSciFiShow._
import revature.AnimatedShows.AniThrillerShow._
import revature.AnimatedShows.AniWesternShow._
import revature.AnimatedShows.AniRomanceShow._
import revature.AnimatedShows.AniAdventureShow._
import revature.AnimatedShows.AniCrimeShow._
import revature.AnimatedShows.AniMusicalShow._
import revature.AnimatedShows.AniFantasyShow._
import revature.AnimatedShows.AniBioShow._



object Project0_TryOne {
  //This function prompts the user to choose a genre from a list of 13
  //Or go back to the previous screen.
  //The choice is sent to the function for choosing a movie and
  //the function for choosing a show.
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

  //------------------------------------------------------------------------------------------------------------------
  //DEALING WITH THE MOVIES IN THE DB

  //Function to select the genre for live-action movies and see the options.
  @tailrec
  def laMovieGenrePicker(): Unit = {
    val choice = genrePicker()
    //If you pick Drama
    if (choice==1){
      LADramaMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
    //If you pick LA Action Movies:
    else if(choice==2) {
      LAActionMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:

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
        //QUIT
        System.exit(0)
      }

      //CLOSE THE FUNCTION
    }
    //If you pick Comedy
    else if(choice==3){
      LAComedyMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:

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
        //QUIT
        System.exit(0)
      }

      //CLOSE THE FUNCTION
    }

    //If you picked Horror Movies
    else if(choice==4){
      LAHorrorMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:

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
        //QUIT
        System.exit(0)
      }

      //CLOSE THE FUNCTION
    }
    //If you picked Sci-fi
    else if(choice==5){
      LASciFiMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:

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
        //QUIT
        System.exit(0)
      }

      //CLOSE THE FUNCTION
    }
    //If you picked Thriller
    else if(choice==6){
      LAThrillerMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Western
    else if(choice==7){
      LAWesternMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Romance
    else if(choice==8){
      LARomanceMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Adventure
    else if(choice==9){
      LAAdventureMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Crime
    else if(choice==10){
      LACrimeMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick LA Musical
    else if(choice==11){
      LAMusicalMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Fantasy
    else if(choice==12){
      LAFantasyMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you pick Biographical
    else if(choice==13){
      LABioMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
    else if (choice == 14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      laMovieGenrePicker()
    }

  }

  //Function to select the genre for an animated movie to watch:
  @tailrec
  def animatedMovieGenrePicker(): Unit = {
    val choice = genrePicker()
    //If you chose Drama
    if (choice==1){
      AniDramaMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Action
    else if(choice==2){
      AniActionMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Comedy
    else if(choice==3){
      AniComedyMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Horror
    else if(choice==4){
      AniHorrorMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Sci-fi
    else if(choice==5){
      AniSciFiMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Thriller
    else if(choice==6){
      AniThrillerMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Western
    else if(choice==7){
      AniWesternMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Romance
    else if(choice==8){
      AniRomanceMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Adventure
    else if(choice==9){
      AniAdventureMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Crime
    else if(choice==10){
      AniCrimeMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Musical
    else if(choice==11){
      AniMusicalMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Fantasy
    else if(choice==12){
      AniFantasyMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you chose Biographical
    else if(choice==13){
      AniBioMoviesButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
    else if (choice == 14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      animatedMovieGenrePicker()
    }
  }

  //-------------------------------------------------------------------------------------------------------------------
  //DEALING WITH THE SHOWS NOW:
  @tailrec
  def laShowGenrePicker(): Unit = {
    val choice = genrePicker()
    //If you choose Drama Live Action Show:
    if (choice==1){
      LADramaShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Action Show:
    else if(choice==2){
      LAActionShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Comedy Show:
    else if(choice==3){
      LAComedyShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Horror Show:
    else if(choice==4){
      LAHorrorShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Sci-fi Show:
    else if(choice==5){
      LASciFiShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Thriller Show:
    else if(choice==6){
      LAThrillerShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Western Show:
    else if(choice==7){
      LAWesternShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Romance Show:
    else if(choice==8){
      LARomanceShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Adventure Show:
    else if(choice==9){
      LAAdventureShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Crime Show:
    else if(choice==10){
      LACrimeShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Musical Shows:
    else if(choice==11){
      LAMusicalShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Fantasy Shows:
    else if(choice==12){
      LAFantasyShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose LA Biographical Shows:
    else if(choice==13){
      LABioShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
    else if (choice == 14){
      aniOrLAShow()
    }
    else{
      println("Enter a valid number (1-14).")
      laShowGenrePicker()
    }
  }

  //Function to pick the genre for an animated show to watch:
  @tailrec
  def animatedShowGenrePicker(): Unit = {
    val choice = genrePicker()
    //If you choose animated Drama Shows:
    if (choice==1){
      AniDramaShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated Action Shows:
    else if(choice==2){
      AniActionShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose Animated Comedy Shows:
    else if(choice==3){
      AniComedyShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose Animated Horror Shows:
    else if(choice==4){
      AniHorrorShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }

      //If you choose animated Sci-fi shows:
    else if(choice==5){
      AniSciFiShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose Animated Thriller Shows:
    else if(choice==6){
      AniThrillerShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose Animated Western Shows:
    else if(choice==7){
      AniWesternShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated Romance shows:
    else if(choice==8){
      AniRomanceShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated Adventure Shows:
    else if(choice==9){
      AniAdventureShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated crime shows:
    else if(choice==10){
      AniCrimeShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated Musical Shows:
    else if(choice==11){
      AniMusicalShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose animated Fantasy Shows:
    else if(choice==12){
      AniFantasyShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
      //If you choose Animated Biographical Shows
    else if(choice==13){
      AniBioShowsButNotStuck(choice)
      //If you want to go back and choose a different genre
      //for a live-action movie:
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
        //QUIT
        System.exit(0)
      }
      //CLOSE THE FUNCTION
    }
    else if (choice == 14){
      aniOrLAShow()
    }
    else{
      println("Enter a valid number (1-14).")
      animatedShowGenrePicker()
    }
  }

  //------------------------------------------------------------------------------------------------------------------
  //This function prompts the user to choose between
  //Live-action or animated movie
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

  //------------------------------------------------------------------------------------------------------------------
  //This function prompts the user to choose between
  //Live-action or animated show.
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

  //------------------------------------------------------------------------------------------------------------------
  //This function prompts the user to choose between browsing for movies OR shows
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

  //------------------------------------------------------------------------------------------------------------------
  //Functions for dealing with the watch list.
  def watchlistCheck(): Unit = {
    try{
      //println("Here is your watchlist.")
      val url = "jdbc:mysql://localhost:3306/project0"
      val username = "root"
      val password = "KafeAde!f1a"
      val connection = DriverManager.getConnection(url, username, password)
      val s = connection.createStatement()
      var query: String = ""

      //println("LIVE-ACTION DRAMA MOVIES:")
      query = "SELECT * FROM watchList"
      //println("Live-Action Drama Movies.")
      val resultSet = s.executeQuery(query)
      /*
      while (resultSet.next) {
        val wId = resultSet.getInt("wID")
        val wTitle = resultSet.getString("wTitle")
        val addDate = resultSet.getString("addDate")
        println(("wID = %s, Title = %s, Date Added = %s").format(wId, wTitle, addDate))
      }
      */
    }
    catch{
      case
        e: Exception => //e.printStackTrace()
        println(
          """
            |You have not created a watchlist.
            |Go back and browse the collection to
            |start adding titles to your watchlist,
            |OR create your watchlist now and fill it later.
            |DO YOU WANT TO CREATE YOUR WATCHLIST?
            |Enter a number to make a choice:
            |1 for CREATE WATCHLIST NOW
            |2 for GO BACK
            |3 for QUIT APP
            |""".stripMargin)
        val x = readInt()
        if (x==1){
          watchList.createWatchList()
        }
        else if (x==2){
          possibilities()
        }
        else{
          System.exit(0)
        }
    }
  }

  def deleteFromWatchList(): Unit = {
    println("Enter the id of the title you want to remove from the watch list.")
    val use = readInt()
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var delete: String = ""

    delete = s"DELETE FROM watchList WHERE wID = $use"
    s.executeUpdate(delete)

  }


  //------------------------------------------------------------------------------------------------------------------
  //Functions for dealing with the watch again table.
  def watchedListCheck(): Unit = {
    try{
      //println("Here is the list of titles you have watched already.")
      val url = "jdbc:mysql://localhost:3306/project0"
      val username = "root"
      val password = "KafeAde!f1a"
      val connection = DriverManager.getConnection(url, username, password)
      val s = connection.createStatement()
      var query: String = ""

      query = "SELECT * FROM watchAgain"
      val resultSet = s.executeQuery(query)
      while (resultSet.next) {
        val watchedId = resultSet.getInt("watchedID")
        val watchedTitle = resultSet.getString("watchedTitle")
        val wDate = resultSet.getString("wDate")
        println(("wID = %s, Title = %s, Date Added = %s").format(watchedId, watchedTitle, wDate))
      }
    }
    catch{
      case e: Exception => //e.printStackTrace()
        println(
          """
            |You have not watched anything yet.
            |Go back and browse the collection to
            |start watching right now.
            |Enter a number to make a choice:
            |1 for GO BACK
            |2 for QUIT APP
            |""".stripMargin)
        val x = readInt()
        if (x==1){
          possibilities()
        }
        else{
          System.exit(0)
        }
    }
  }

  //------------------------------------------------------------------------------------------------------------------
  //This function represents the home page of the app.
  @tailrec
  def possibilities(): Unit = {
    println(
      """
        |Welcome to the Screen Servant!
        |Enter a number to select a category:
        |1) View my watchlist
        |2) View my watched list
        |3) Browse the collection of titles.
        |4) Quit
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1) {
      watchlistCheck()
      watchList.viewWatchList()
      println("Here is your watchlist.")
      println(
        """
          |Would you like to remove an item from your watch list?
          |1 for YES. 2 for NO.
          |""".stripMargin)
      val cut = readInt()
      if (cut == 1){
        deleteFromWatchList()
        println("Title deleted.")
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for QUIT APP.
            |""".stripMargin)
        val back = readInt()
        if (back == 1){
          possibilities()
        }
        else{
          System.exit(0)
        }

      }
      else{
        println(
          """
            |Would you like to go back?
            |1 for YES. 2 for QUIT APP.
            |""".stripMargin)
        val back = readInt()
        if (back == 1){
          possibilities()
        }
        else{
          System.exit(0)
        }
      }

    }
    else if (choice == 2){
      watchedListCheck()
      //println("Here is your watched list.")
      println(
        """
          |Would you like to go back?
          |1 for YES. 2 for QUIT APP.
          |""".stripMargin)
      val back = readInt()
      if (back == 1){
        possibilities()
      }
      else{
        System.exit(0)
      }
    }
    else if(choice == 3){
      movieOrShow()
    }
    else if (choice == 4){
      //0
      System.exit(0)
    }
    else{
      println("Enter a valid number (1-3).")
      possibilities()
    }
  }

  //------------------------------------------------------------------------------------------------------------------
  //This is the MAIN function:
  def main (args: Array[String]): Unit = {
    //Run the function that starts the Screen Servant app.
    possibilities()
  }

}


