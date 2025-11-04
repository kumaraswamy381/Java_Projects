package Service;

public class DHL implements DeliveryService {

	@Override
	public boolean deliverProduct(double ammount)
	{
		
		System.out.println("Product deliverd with DHL service and ammount paid is :"+ ammount);
		return true;
	}

}
