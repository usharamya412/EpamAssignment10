import java.util.*;
import java.util.stream.Collectors;
public class lambdas {
	public static double average(List<Integer> list){
		return list.stream().mapToInt(i -> i).average().getAsDouble();
	}
	public static void main(String args[]){
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,8,10);
		double res=average(list1);
		System.out.println(res);
	}
}
