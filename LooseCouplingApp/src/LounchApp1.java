import Service.BlueDart;
import Service.DHL;
import Service.FedEx;

public class LounchApp1 {

	public static void main(String[] args) {
		System.out.println("welcome to our First loosely coupled application app");

		Amazon amz = new Amazon(new BlueDart()); // Constructor injection

		// Amazon amz1 = new Amazon();//bean

		amz.setService(new DHL()); // setter dependency injection

		boolean status = amz.deliverTheprocuct(555.55);

		if (status)
			System.out.println("Product deliverd Successfully");
		else
			System.out.println("Failed to deliver product");

	}

}
