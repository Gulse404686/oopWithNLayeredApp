package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private ILogger[] loggers;
	
	public ProductManager(IProductDao productDao, ILogger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	
	}

	public void add(Product product) throws Exception {
		//İş kuralları
		if(product.getUnitPrice() < 10) {
			throw new Exception("Urun fiyati 10'dan kucuk olamaz.");
			
		} 
		//IProductDao productDao = new JdbcProductDao();
		//IProductDao productDao1 = new HibernateProductDao();
		productDao.add(product);
		
		for(ILogger logger : loggers) {
			logger.log(product.getName());
			
		}
	}

}
