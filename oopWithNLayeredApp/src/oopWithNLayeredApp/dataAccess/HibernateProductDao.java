package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements IProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır.
		System.out.println("Hibernate ile veri tabanina eklendi.");
	}

}
