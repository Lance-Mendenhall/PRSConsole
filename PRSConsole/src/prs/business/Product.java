package prs.business;

public class Product {

	private int id;
	private int vendorID;
	private String partNumber;
	private String name;
	private double price;
	private String Unit;
	private String photoPath;
	
	public Product(int id, int vendorID, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		this.id = id;
		this.vendorID = vendorID;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		Unit = unit;
		this.photoPath = photoPath;
	}

	

	public Product(int vendorID, String partNumber, String name, double price) {
		super();
		this.vendorID = vendorID;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorID() {
		return vendorID;
	}

	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorID=" + vendorID + ", partNumber=" + partNumber + ", name=" + name
				+ ", price=" + price + ", Unit=" + Unit + ", photoPath=" + photoPath + "]";
	}
	
	
	
	
}