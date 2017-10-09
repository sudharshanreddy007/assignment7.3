package methodOverloading;


	import methodOverloading.Sales;

	public class SalesDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Sales Sales1 =new Sales(1);
	     Sales Sales2 =new Sales(123);
	     Sales Sales3 =new Sales(1234, 4500.00);
	     
	            Sales1.display();     
	            Sales2.display();
	            Sales3.display();
	            
		}
}