package loan;

public class VehicleLoan extends SecuredLoan
{
	private String vehicleCategory;
	private String vehicleModelNo;
	private String manufacturer;
	private int yearOfmanufacture;
	private double assetValue;
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getVehicleModelNo() {
		return vehicleModelNo;
	}
	public void setVehicleModelNo(String vehicleModelNo) {
		this.vehicleModelNo = vehicleModelNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYearOfmanufacture() {
		return yearOfmanufacture;
	}
	public void setYearOfmanufacture(int yearOfmanufacture) {
		this.yearOfmanufacture = yearOfmanufacture;
	}
	public double getAssetValue() {
		return assetValue;
	}
	public void setAssetValue(double assetValue) {
		this.assetValue = assetValue;
	}
	
	public VehicleLoan() {
		// TODO Auto-generated constructor stub
	}
	public VehicleLoan(String vehicleCategory, String vehicleModelNo, String manufacturer, int yearOfmanufacture,
			double assetValue) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.vehicleModelNo = vehicleModelNo;
		this.manufacturer = manufacturer;
		this.yearOfmanufacture = yearOfmanufacture;
		this.assetValue = assetValue;
	}
	
	

}
