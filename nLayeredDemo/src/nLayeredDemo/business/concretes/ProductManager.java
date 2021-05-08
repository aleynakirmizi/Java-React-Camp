package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService,LoggerService{
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerservice) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerservice;
		
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("ürün eklendi "+ product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		
	}
	

}
