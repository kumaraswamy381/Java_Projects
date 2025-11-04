package Service;


public class FedEx implements DeliveryService
{
@Override
	public boolean deliverProduct(double ammount) 
	{
		System.out.println("Product deliverd with FedEx service and ammount paid is :"+ ammount);
		return true;
	}

}
