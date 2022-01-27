package revature.watchAgain

import java.sql.DriverManager

object watchAgainDB {
  def createWatchedList(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var create: String = ""

    //Create the table for titles you've already watched.
    create = "CREATE TABLE watchAgain(watchedID int NOT NULL, " +
      "watchedTitle varchar(300), wDate date)"
    s.executeUpdate(create)
  }

  def viewWatchAgain(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s = connection.createStatement()
    var query: String = ""

    //query to show the watchAgain table.
    query = "SELECT * FROM watchAgain"
    val resultSet = s.executeQuery(query)
    while (resultSet.next) {
      val watchedId = resultSet.getInt("watchedID")
      val watchedTitle = resultSet.getString("watchedTitle")
      val wDate = resultSet.getString("wDate")
      println(("wID = %s, Title = %s, Date Added = %s").format(watchedId, watchedTitle, wDate))
      //println("You created the watchAgain table.")
    }
  }

}
