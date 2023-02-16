package assignment4;
	import java.util.*;
	import java.util.stream.*;

	public class DuplicateNumb {
		public static <T> Set<T>
		findDuplicateInStream(Stream<T> stream)
		{
			Set<T> items = new HashSet<>();
			return stream

				.filter(n -> !items.add(n))
				.collect(Collectors.toSet());
		}
		public static void main(String[] args)
		{
			Stream<Integer> stream
				= Stream.of(5, 13, 4,
							2, 13, 27,
							2, 9, 9, 34);
			System.out.println(
				findDuplicateInStream(stream));
		}
	}