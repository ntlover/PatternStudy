
public class DefaultGameConnect extends AbsGameconnectHelper {

	@Override
	protected void secuCheck() {
		System.out.println("security check ok");

	}

	@Override
	protected void autheCheck() {
		System.out.println("authentication check ok");

	}

	@Override
	protected void authoCheck() {
		System.out.println("authorization check ok");

	}

	@Override
	protected void connection() {
		System.out.println("connection check ok");

	}

}
