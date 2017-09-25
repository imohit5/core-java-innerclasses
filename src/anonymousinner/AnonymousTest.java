package anonymousinner;

public class AnonymousTest {

	public static void main(String[] args) {
		Connection connection = DriverManager.getConnection();
		connection.createStatement();
	}

}
