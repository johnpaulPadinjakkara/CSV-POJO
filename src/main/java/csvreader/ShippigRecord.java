package csvreader;

import java.util.Map;

public class ShippigRecord {
	
	
	private String region;
	private String country;
	private String itemType;
	private String salesChannel;
	private String orderPrioriy;
	private String orderdate;
	private String orderId;
	private String shipDate;
	private String unitSold;
	private String unitPrice;
	private String unitCost;
	private String totalRevenue;
	private String toalCost;
	private String totalProfit;
	
	
	
	
	
	@Override
	public String toString() {
		return "{region=" + region + ", country=" + country + ", itemType=" + itemType + ", salesChannel="
				+ salesChannel + ", orderPrioriy=" + orderPrioriy + ", orderdate=" + orderdate + ", orderId=" + orderId
				+ ", shipDate=" + shipDate + ", unitSold=" + unitSold + ", unitPrice=" + unitPrice + ", unitCost="
				+ unitCost + ", totalRevenue=" + totalRevenue + ", toalCost=" + toalCost + ", totalProfit="
				+ totalProfit + "}";
	}
	
	public ShippigRecord(Map<String, String> row) {
		this.region = row.get("Region");
		this.country = row.get("Country");
		this.itemType = row.get("Item Type");
		this.salesChannel = row.get("Sales Channel");
		this.orderPrioriy = row.get("Order Priority");
		this.orderdate = row.get("Order Date");
		this.orderId = row.get("Order ID");
		this.shipDate = row.get("Ship Date");
		this.unitSold = row.get("Unit Sold");
		this.unitPrice = row.get("Unit Price");
		this.unitCost = row.get("Unit Cost");
		this.totalRevenue = row.get("Total Revenue");
		this.toalCost = row.get("Total Cost");
		this.totalProfit = row.get("Total Profit");
	}


	public ShippigRecord(String region, String country, String itemType, String salesChannel, String orderPrioriy,
			String orderdate, String orderId, String shipDate, String unitSold, String unitPrice, String unitCost,
			String totalRevenue, String toalCost, String totalProfit) {
		super();
		this.region = region;
		this.country = country;
		this.itemType = itemType;
		this.salesChannel = salesChannel;
		this.orderPrioriy = orderPrioriy;
		this.orderdate = orderdate;
		this.orderId = orderId;
		this.shipDate = shipDate;
		this.unitSold = unitSold;
		this.unitPrice = unitPrice;
		this.unitCost = unitCost;
		this.totalRevenue = totalRevenue;
		this.toalCost = toalCost;
		this.totalProfit = totalProfit;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getSalesChannel() {
		return salesChannel;
	}


	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}


	public String getOrderPrioriy() {
		return orderPrioriy;
	}


	public void setOrderPrioriy(String orderPrioriy) {
		this.orderPrioriy = orderPrioriy;
	}


	public String getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getShipDate() {
		return shipDate;
	}


	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}


	public String getUnitSold() {
		return unitSold;
	}


	public void setUnitSold(String unitSold) {
		this.unitSold = unitSold;
	}


	public String getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getUnitCost() {
		return unitCost;
	}


	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}


	public String getTotalRevenue() {
		return totalRevenue;
	}


	public void setTotalRevenue(String totalRevenue) {
		this.totalRevenue = totalRevenue;
	}


	public String getToalCost() {
		return toalCost;
	}


	public void setToalCost(String toalCost) {
		this.toalCost = toalCost;
	}


	public String getTotalProfit() {
		return totalProfit;
	}


	public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}
	
	
	
	
	

}
