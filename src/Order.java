public class Order {
	private int orderID;
	private Customer orderCustomer;
	private Product [] orderProduct;
	private int [] numberOfProduct;
	private long orderDate;
	
	public Order()
	{
		//
	}
	public Order(int id, Customer customerID, Product[] products, int[] numOfProducts, long date)
	{
		orderID = id;
		orderCustomer = customerID;
		orderProduct = products;
		numberOfProduct = numOfProducts;
		orderDate = date;
	}
	
	public void setOrderID(int id) { orderID = id; }
	
	public int getOrderID() { return orderID; }
	
	public void setOrderCustomer(Customer CustomerID) { orderCustomer = CustomerID; }
	
	public Customer getOrderCustomer() { return orderCustomer; }
	
	public void setOrderProduct(Product [] Products) { orderProduct = Products; }
	
	public Product [] getOrderProduct() { return orderProduct; }
	
	public void setNumOfProduct(int [] numOfProduct) { numberOfProduct = numOfProduct; }
	
	public int [] getNumOfProduct() { return numberOfProduct; }
	
	public void setOrderDate(long date) { orderDate = date; }
	
	public long getOrderDate() { return orderDate; }
	
	public double getSumOfCost(Order[] orders)
	{
		double counter = 0;
		for(int i = 0; i < 3; i++)
		{
			Product[] products = orders[i].getOrderProduct();
			int[] piece  = orders[i].getNumOfProduct();
			for(byte j = 0; j < piece.length; j++) counter += (products[j].getProductCost() * piece[j]);
		}
		return counter;
	}
}
