package revature.watchlist

import java.sql.DriverManager

object watchList {
  def createWatchList(): Unit = {
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s2 = connection.createStatement()
    var create: String = ""
    var query: String = ""

    //create an empty watchList
    create = "CREATE TABLE watchList(wID int NOT NULL, " +
      "wTitle varchar(300), addDate date)"
    s2.executeUpdate(create)
  }

  def viewWatchList(): Unit={
    val url = "jdbc:mysql://localhost:3306/project0"
    val username = "root"
    val password = "KafeAde!f1a"
    val connection = DriverManager.getConnection(url, username, password)
    val s1 = connection.createStatement()
    var query: String = ""

    //query to show the watchList table.
    query = "SELECT * FROM watchList"
    val resultSet = s1.executeQuery(query)
    while (resultSet.next){
      val wId = resultSet.getInt("wID")
      val wTitle = resultSet.getString("wTitle")
      val addDate = resultSet.getString("addDate")
      println(("wID = %s, Title = %s, Date Added = %s").format(wId, wTitle, addDate))
      //println("You created the watchAgain table.")
    }

  }

}
