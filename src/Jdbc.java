import java.sql.*;

public class Jdbc {

	public static void main(String[] args) {
		try {

			// Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/aeprojekt", 
					"root", 
					"test1234"
				);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from names");

			while (resultSet.next())

				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
