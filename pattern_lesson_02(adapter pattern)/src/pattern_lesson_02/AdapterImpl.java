package pattern_lesson_02;

public class AdapterImpl implements Adapter {

	@Override
	public float twotimes(float f) {
		
		return (float) BasicCalc.twotimes((double)f);
	}

	@Override
	public float half(float f) {
		return (float) BasicCalc.half((double)f);
	}

}
