import Service.DeliveryService;

public class Amazon {
	private DeliveryService service;

	public void setService(DeliveryService service) {
		this.service = service;
	}

	public Amazon(DeliveryService service) {
		super();
		this.service = service;
	}

	public boolean deliverTheprocuct(double ammount) {
		return service.deliverProduct(ammount);

	}

}
