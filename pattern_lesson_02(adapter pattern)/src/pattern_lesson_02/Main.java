package pattern_lesson_02;

public class Main {

	public static void main(String[] args) {
		
		float f = 100;
		
		
		Adapter PatterenedCalc = new AdapterImpl();
		
		System.out.println(PatterenedCalc.half(f));
		System.out.println(PatterenedCalc.twotimes(f));
		
		/*System.out.println(BasicCalc.twotimes(d));
		System.out.println(BasicCalc.half(d));*/

	}

}
