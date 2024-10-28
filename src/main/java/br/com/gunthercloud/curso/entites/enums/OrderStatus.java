package br.com.gunthercloud.curso.entites.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus v : OrderStatus.values()) {
			if(code == v.getCode()) {
				return v;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code!");
	}
}