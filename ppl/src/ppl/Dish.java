package ppl;

public class Dish {
	private final String name;
	private final boolean veg;
	private final int cal;
	private final String type;
	
	public Dish(String n, boolean v, int c, String t) {
		name = n;
		veg = v;
		cal = c;
		type = t;
	}
	public String getType() {
		return type;
	}
	public int getCal() {
		return cal;
	}
	public boolean isVeg() {
		return veg;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return (name + type);
	}

}