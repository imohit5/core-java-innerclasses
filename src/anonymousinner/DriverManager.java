package anonymousinner;

public class DriverManager {

	static Connection getConnection() {
		Connection connection = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Anonymous inner class");
			}

		};

		return connection;

	}

}
