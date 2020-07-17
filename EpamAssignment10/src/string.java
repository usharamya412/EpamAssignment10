import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class string {
	public static List<String> search(List<String> list){
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3)
				.collect(Collectors.toList());
	}
	public static void main(String args[]){
		List<String> list2=Arrays.asList("pineapple","apple","ape","ant","age");
		System.out.println(search(list2));
	}
}
