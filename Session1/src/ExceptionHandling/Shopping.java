package ExceptionHandling;

public class Shopping {

	public int  buyProduct (int balance, int cost) {
		
			if (balance<cost) {
				throw new ArithmeticException ("Insufficient Balance"+balance+"to buy"+cost);
			}
			return balance-cost;
	}

}

//lambda, method reference, serialization, multithreading, file handling
