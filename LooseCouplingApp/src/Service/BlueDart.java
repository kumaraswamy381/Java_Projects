package Service;

public class BlueDart implements DeliveryService {

	@Override
	public boolean deliverProduct(double ammount)
	{
		System.out.println("Product deliverd with Blue service and ammount paid is :"+ ammount);
		return true;
	}

}
