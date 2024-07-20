package model.service;


import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class CalculationService {

	public <T extends Comparable <T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("A lista não pode ser vazia");
		} else {
			T max = list.get(0);
			for (T n : list) {
				if (n.compareTo(max) > 0) {
					max = n;
				}
			}
			return max;
		}
	}	
}
