package applicator;

import java.util.Comparator;

import application.Product;

public class MyComparation  implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}  /* comparando por nome, idependente se as letras forem
         maiusculas ou minusculas: toUpperCase()*/                                                                      
}