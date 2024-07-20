package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.service.CalculationService;

public class ProgramaInicial {

	public static void main(String[] args) {
		String path = "c://temp//exemplo.txt";
		List<Product> list = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			String line = bf.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bf.readLine();
			}
			CalculationService cs = new CalculationService();
			Product max = cs.max(list);
			System.out.println("Produto mais caro: " + max);
		}
		catch (IOException e) {
			System.out.println("Error message: " + e);
		}

	}

}
