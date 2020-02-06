package loan;

public class HomeLoan extends SecuredLoan
{
	private String buildername;
	private int propertySize;
	private double propertyValue;
	public String getBuildername() {
		return buildername;
	}
	public void setBuildername(String buildername) {
		this.buildername = buildername;
	}
	public int getPropertySize() {
		return propertySize;
	}
	public void setPropertySize(int propertySize) {
		this.propertySize = propertySize;
	}
	public double getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}
	public HomeLoan() {
		// TODO Auto-generated constructor stub
	}
	public HomeLoan(String buildername, int propertySize, double propertyValue) {
		super();
		this.buildername = buildername;
		this.propertySize = propertySize;
		this.propertyValue = propertyValue;
	}
	
	

}
