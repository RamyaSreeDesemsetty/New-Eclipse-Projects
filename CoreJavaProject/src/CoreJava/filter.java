package CoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
	

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 1, 3, 2, 4, 5, 1);

		System.out.println(Stream.concat(list.stream().filter(n -> n == 1),
				list.stream().filter(n -> n != 1)).collect(Collectors.toList()));
	}

}
