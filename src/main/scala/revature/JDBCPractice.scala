package revature

import java.sql.{Connection, DriverManager}

object JDBCPractice {
  def main(args: Array[String]): Unit = {
    //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "KafeAde!f1a")
    //val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/newdb"
    val username = "root"
    val password = "KafeAde!f1a"
    var connection: Connection = null
    try {
      //Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultset = statement.executeQuery("SELECT * from customer")
      println("Here is the customer information.")
      while (resultset.next) {
        val customerid = resultset.getString("CustomerID")
        val country = resultset.getString("Country")
        val customername = resultset.getString("CustomerName")
        val contactname = resultset.getString("ContactName")
        val address = resultset.getString("Address")
        val city = resultset.getString("City")
        val postalcode = resultset.getString("PostalCode")
        println("customerid = %s, country = %s, customername =%s, contactname = %s, address = %s, city = %s, postalcode = %s".format(customerid, country, customername, contactname, address, city, postalcode))

      }
    } catch {
      case e: Exception => e.printStackTrace()
    }
    if (connection != null){
      connection.close()
    }
  }

}
