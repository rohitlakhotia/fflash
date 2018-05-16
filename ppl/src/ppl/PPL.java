package ppl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import basics.Test;

//import sun.security.pkcs11.wrapper.Functions;
class Test {
	  static int x;
	  int k;
	  
	  // constructor with 2 args
	  public Test( int n, int m ) {
	    x = n;
	    k = m;
	  }
	  
	  public static void main(String[] args) {
	    Test t1 = new Test(10, 20);
	    Test t2 = new Test(30, 40);
	    System.out.print(t1.x + " ");
	    System.out.print(t1.k + " ");
	    System.out.print(t2.x + " ");
	    System.out.println(t2.k);
	  }
	}
public class PPL {
	//public enum Type {LUNCH, DINNER, BREAKFAST}; 
	
	public PPL() {
		// TODO Auto-generated constructor stub
	}
}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array<int> x=new Array<int>();
		int[] a=new int[] {1,2,3,4};
		int x=Arrays.stream(a)
				.reduce(26,(p,q)->(((p-25)*q)+25));
		System.out.println(x);
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		dishes.add(new Dish("Rice", true, 200, "BREAKFAST"));
		dishes.add(new Dish("Wheat", true, 450, "LUNCH"));
		dishes.add(new Dish("Dal", true, 810, "BREAKFAST"));
		dishes.add(new Dish("Fruits", true, 50, "DINNER"));
		dishes.add(new Dish("ABCD", false, 1200, "LUNCH"));
		Map<String, List<Dish> > d=dishes.stream()
										.collect(Collectors.groupingBy(Dish::getType));
		
		Map<String, Map<Boolean, List<Dish> > > calwise=dishes.stream()
															  .collect(Collectors.groupingBy(p->p.getType(), Collectors.groupingBy(
																  p->{
																	  if(p.getCal()>500) {
																		  return true;
																		  
																	  }
																	  else return false;
																  }
															  ))
																	  );
		Map<String, Optional<Dish> > low_cal=dishes.stream()
												   .collect(Collectors.groupingBy(Dish::getType, Collectors.minBy(Comparator.comparingInt(Dish::getCal))));
															  
		System.out.println(low_cal.get("DINNE"));
		/*long total = dishes.stream()
			  .filter(Dish::isVeg)
			  .count();
		System.out.println(total);
		
		Map<String, List<Dish> > dishesType = dishes.stream()
													   .collect(Collectors.groupingBy(Dish::getType));
		
		System.out.println(dishesType.get("LUNCH"));
		
		Map<Boolean, List<Dish> > dishesType2 = dishes.stream()
				   .collect(Collectors.groupingBy(d -> { if(d.getCal() >500) return true; else return false;}));

		System.out.println(dishesType2.get(true));

		Map<String, Optional<Dish>>  dishesType4 = dishes.stream()
		.collect(Collectors.groupingBy(Dish::getType, Collectors.minBy(Comparator.comparingInt(Dish::getCal))));
		
		int dishesType3 = dishes.stream()
		//.collect(Collectors.groupingBy(d -> { if(d.getCal() >500) return true; else return false;}))
		.collect(Collectors.reducing(0, Dish::getCal, Integer::sum));
		
		System.out.println(dishesType3);
		System.out.println(dishesType4.get("DINNER").orElse(new Dish("D",true,23,"ABC")));
		
		int vg = dishes.stream().filter(Dish::isVeg).map(t -> 1).reduce(0, Integer::sum);
		System.out.println(vg);
		*/
		
		
		
		
//	}*/

//}