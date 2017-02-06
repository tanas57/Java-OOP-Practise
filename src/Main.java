import java.util.Date;
public class Main {
	
	
	public static void main(String[] args) {
		
		Date now = new Date();
		Customer [] musteri = new Customer[4];
		Product [] urun = new Product[5];
		Order [] siparis = new Order[4];
		
		// Customer ( firstname, lastname, identity, singtime, gender )
		musteri[0] = new Customer("Tayyip","Muslu","111111111111" , now.getTime(), 'm');
		musteri[1] = new Customer("Fatih","Yılmaz","222222222222" , now.getTime(), 'm');
		musteri[2] = new Customer("Koray","Güneş" ,"3333333333331", now.getTime(), 'm');
		musteri[3] = new Customer("Mert","Şentürk" ,"4444444444444", now.getTime(), 'm');
		
		// Product( product_id, product_name, product_category, product_stock, product_cost )
		urun[0] = new Product(1, "Pencil", "Stationery", 10,  1.5);
		urun[1] = new Product(2, "Ruber", "Stationery",  10,  0.75);
		urun[2] = new Product(3, "Bread", "Food", 	     100, 1);
		urun[3] = new Product(4, "Mobile Phone", "Telecommunication", 3, 1250);
		urun[4] = new Product(5, "Tablet", "Telecommunication", 5, 449.99);
		
		// set product cost
		urun[2].setProductCost(1.75);
		
		// Order ( order_id, customer, [] products, [] numofProducts, orderTime )
		
		siparis[0] = new Order(1, musteri[0], new Product[]{ urun[0], urun[1] }
		, new int[]{3,5},now.getTime());
		siparis[1] = new Order(2, musteri[1], new Product[]{ urun[3] }
		, new int[]{ 1 },now.getTime());
		siparis[2] = new Order(3, musteri[3], new Product[]{ urun[2], urun[0], urun[1] }
		, new int[]{10,2,2},now.getTime());
		
		
		// single product as a array
		siparis[3] = new Order(4, musteri[2], new Product[]{ urun[4] }, new int[]{ 2 }, now.getTime());
		
		print("Customer who has first order : " + siparis[0].getOrderCustomer().getFirstName());
		
		Order orders = new Order();
		
		print("Total fee : " +  orders.getSumOfCost(siparis));
	}
	
	static void print(Object anything) { System.out.println(anything); }

}
