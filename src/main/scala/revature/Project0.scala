package revature

import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Project0 {
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
        |14) TAKE ME BACK TO PREVIOUS PAGE
        |""".stripMargin)

    val choice = readInt()
    choice
  }

  @tailrec
  def laMovieGenrePicker(): Unit = {
    val choice = genrePicker()
    if (choice==1){
      println("Live-Action Drama Movies.")
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
    else if(choice==2){
      println("Live-Action Action Movies.")
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
    else if(choice==3){
      println("Live-Action Comedy Movies.")
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
    else if(choice==4){
      println("Live-Action Horror Movies.")
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
    else if(choice==5){
      println("Live-Action Sci-Fi Movies.")
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
    else if(choice==6){
      println("Live-Action Thriller Movies.")
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
    else if(choice==7){
      println("Live-Action Western Movies.")
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
    else if(choice==8){
      println("Live-Action Romance Movies.")
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
    else if(choice==9){
      println("Live-Action Adventure Movies.")
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
    else if(choice==10){
      println("Live-Action Crime Movies.")
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
    else if(choice==11){
      println("Live-Action Musical Movies.")
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
    else if(choice==12){
      println("Live-Action Fantasy Movies.")
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
    else if(choice==13){
      println("Live-Action Biographical Movies.")
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
    else if(choice==14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      laMovieGenrePicker()
    }

  }

  @tailrec
  def animatedMovieGenrePicker(): Unit = {
    val choice = genrePicker()
    if (choice==1){
      println("Animated Drama Movies.")
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
    else if(choice==2){
      println("Animated Action Movies.")
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
    else if(choice==3){
      println("Animated Comedy Movies.")
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
    else if(choice==4){
      println("Animated Horror Movies.")
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
    else if(choice==5){
      println("Animated Sci-Fi Movies.")
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
    else if(choice==6){
      println("Animated Thriller Movies.")
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
    else if(choice==7){
      println("Animated Western Movies.")
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
    else if(choice==8){
      println("Animated Romance Movies.")
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
    else if(choice==9){
      println("Animated Adventure Movies.")
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
    else if(choice==10){
      println("Animated Crime Movies.")
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
    else if(choice==11){
      println("Animated Musical Movies.")
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
    else if(choice==12){
      println("Animated Fantasy Movies.")
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
    else if(choice==13){
      println("Animated Biographical Movies.")
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
    else if(choice==14){
      aniOrLAMovie()
    }
    else{
      println("Enter a valid number (1-14).")
      animatedMovieGenrePicker()
    }
  }

  def aniOrLAMovie(): Unit={
    println(
      """
        |Do you want to watch an animated film or a live-action film?
        |Enter a number to select an option:
        |1) Live-Action
        |2) Animated
        |""".stripMargin)
    val choice = readInt()
    if (choice == 1){
      laMovieGenrePicker()
    }
    else if(choice == 2){
      animatedMovieGenrePicker()
    }
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
      aniOrLAMovie()
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

