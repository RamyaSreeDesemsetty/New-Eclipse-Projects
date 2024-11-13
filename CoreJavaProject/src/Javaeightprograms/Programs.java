package Javaeightprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Programs {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 10, 2, 26, 9, 11, 2, 26, 26);
		// "1.Find maximum number in the list"
		System.out.println(list.stream().mapToInt(Integer::intValue).max());
		// "2.Find minimum number in the list"
		System.out.println(list.stream().mapToInt(Integer::intValue).min());
		// "3.Find average of the list"
		System.out.println(list.stream().mapToInt(Integer::intValue).average());
		// "4.Find sum of numbers "
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
		// "5.Find total numbers "
		System.out.println(list.stream().mapToInt(Integer::intValue).count());
		// "6.Find max,min,avg,sum,count of numbers "
		System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics());
		// "7.Sort given list"
		System.out.println(list.stream().sorted().toList());
		// "8.Sort the given list in descending order"
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());
		// "9.Find the odd numbers"
		System.out.println(list.stream().filter(n -> n % 2 != 0).toList());
		// "10.Find the even numbers"
		System.out.println(list.stream().filter(n -> n % 2 == 0).toList());
		// "11.Find the even and odd numbers"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd")));
		// "12.Find the square of numbers"
		System.out.println(list.stream().map(n -> n * n).toList());
		// "13.Find the numbers Starting with 1"
		System.out.println(list.stream().map(n -> n + "").filter(n -> n.startsWith("1")).toList());
		System.out.println(list.stream().map(String::valueOf).filter(n -> n.startsWith("1")).toList());
		System.out.println(
				list.stream().map(String::valueOf).filter(n -> n.startsWith("1")).map(Integer::valueOf).toList());
		// "14.Find the Square of odd numbers"
		System.out.println(list.stream().filter(n -> n % 2 != 0).map(n -> n * n).toList());
		// "15.Find the top 3 numbers or limit of 3"
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toList());
		// "16.Find the second largest element"
		System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get());
		// "17.Find the second smallest element"
		System.out.println(list.stream().distinct().sorted().skip(1).limit(1).findFirst().get());
		// "18.Remove the duplicates"
		System.out.println(list.stream().distinct().toList());
		// "find the occurence of each number"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())));
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity())));
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.summarizingInt(n -> 1))));
		// "20.find the occurence of each number"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).toList());
		// "21.Find NonRepeated numbers"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).toList());
		// "22.Find first nonrepeated number(unique)"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().distinct().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.get());
		// "23.Find the first Repeated number(Unique)"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().distinct().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).findFirst()
				.get());
		// "24.Find the most repeated number"
		System.out.println(list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().max(Map.Entry.comparingByValue()).get().getKey());
		// 25.Find the common elements in the given two arraylists"
		List<Integer> l1 = Arrays.asList(2, 4, 1, 5, 1);
		List<Integer> l2 = Arrays.asList(3, 6, 7, 1, 2);
		System.out.println(l1.stream().filter(l2::contains).distinct().toList());
		// "26.Find the uncommon elements"
		System.out.println(l1.stream().filter(n -> !l2.contains(n)).toList());// it gives only from one list
		System.out.println(Stream
				.concat(l1.stream().filter(n -> !l2.contains(n)), l2.stream().filter(n -> !l1.contains(n))).toList());
		// "27.Print First five odd numbers"
		System.out.println(IntStream.rangeClosed(0, 10).filter(n -> n % 2 != 0).boxed().limit(5).toList());
		// "28.Find first even numbers"
		System.out.println(IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).boxed().limit(5).toList());
		// "29.Find 10 random numbers "
		Random random = new Random();
		System.out.println(IntStream.generate(() -> random.nextInt(100)).boxed().limit(5).toList());
		// "30.Reverse the list"
		System.out.println(IntStream.rangeClosed(1, list.size()).mapToObj(n -> list.get(list.size() - n)).toList());
	}

}
