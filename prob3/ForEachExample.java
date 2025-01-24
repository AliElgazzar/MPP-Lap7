package lesson7.labs.prob3;

import java.util.Arrays;
import java.util.List;

public class ForEachExample implements Consumer {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
				"Away", "On Vacation", "Everywhere you want to be");

		ForEachExample example = new ForEachExample();
		example.printUpperCase(list);

	}
}
