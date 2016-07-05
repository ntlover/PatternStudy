
public abstract class AbsGameconnectHelper {

	protected abstract void secuCheck();
	protected abstract void autheCheck();
	protected abstract void authoCheck();
	protected abstract void connection();
	
	public String requestConnection(){
		secuCheck();
		autheCheck();
		authoCheck();
		connection();
		
		return "connection success";
	}
}
