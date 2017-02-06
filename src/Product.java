public class Product {
	private int ProductID;
	private String ProductName;
	private String ProductCategory;
	private int ProductStock;
	private double ProductCost;
	
	public Product(int id, String name, String cat, int stock, double cost)
	{
		ProductID = id;
		ProductName = name;
		ProductCategory = cat;
		ProductStock = stock;
		ProductCost = cost;
	}
	
	public int getProductID() { return ProductID; }
	
	public String getProductName() { return ProductName; }
	
	public void setProuctName(String category_name){ ProductCategory = category_name; }
	
	public String getProductCategory() { return ProductCategory; }
	
	public void setProductStock(int newStock) { ProductStock = newStock; }
	
	public int getProductStock() { return ProductStock; }
	
	public void setProductCost(double cost) { ProductCost = cost; }
	
	public double getProductCost() { return ProductCost; }
}
