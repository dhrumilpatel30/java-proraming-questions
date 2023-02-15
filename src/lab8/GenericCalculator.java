package lab8;

public class GenericCalculator <T extends Number,V extends Number>{
    public double addition(T a, V b) {
		return a.doubleValue()+b.doubleValue();
	}
	public double subtraction(T a, V b) {
		return a.doubleValue()-b.doubleValue();
	}
	public double multiplication(T a, V b) {
		return a.doubleValue()*b.doubleValue();
	}
	public double division(T a, V b) {
		return a.doubleValue()/b.doubleValue();
	}
	public static void main(String[] args) {

		GenericCalculator<Integer, Double> gc = new GenericCalculator<>();

        System.out.println(gc.addition(2, 5.2));
        System.out.println(gc.subtraction(2, 5.2));
        System.out.println(gc.multiplication(2, 5.2));
        System.out.println(gc.division(2, 5.2));

	}
}
