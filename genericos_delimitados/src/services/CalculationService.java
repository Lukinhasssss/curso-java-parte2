package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List cannot be empty");
		}
		
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { // Se for maior do que 0 (zero) significa que o primeiro é maior do que o segundo
				max = item;
			}
		}
		return max;
	}

}
