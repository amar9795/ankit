package loan;

import java.time.LocalDate;

public class Loan
{
	private int loanId;
	private String loanType;
	private double loanAmount;
	private int tenure;
	private double roi;
	public  enum loanStatus{pending,approved};
	private double emiPerMonth;
	private LocalDate loanDisbursalDate;
	private double maxEligibleLoanAmount;
	private int repaymentFrequency;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double getEmiPerMonth() {
		return emiPerMonth;
	}
	public void setEmiPerMonth(double emiPerMonth) {
		this.emiPerMonth = emiPerMonth;
	}
	public LocalDate getLoanDisbursalDate() {
		return loanDisbursalDate;
	}
	public void setLoanDisbursalDate(LocalDate loanDisbursalDate) {
		this.loanDisbursalDate = loanDisbursalDate;
	}
	public double getMaxEligibleLoanAmount() {
		return maxEligibleLoanAmount;
	}
	public void setMaxEligibleLoanAmount(double maxEligibleLoanAmount) {
		this.maxEligibleLoanAmount = maxEligibleLoanAmount;
	}
	public int getRepaymentFrequency() {
		return repaymentFrequency;
	}
	public void setRepaymentFrequency(int repaymentFrequency) {
		this.repaymentFrequency = repaymentFrequency;
	}
	
	public Loan()
	{
		
	}
	
	public Loan(int loanId, String loanType, double loanAmount, int tenure, double roi, double emiPerMonth,
			LocalDate loanDisbursalDate, double maxEligibleLoanAmount, int repaymentFrequency) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.roi = roi;
		this.emiPerMonth = emiPerMonth;
		this.loanDisbursalDate = loanDisbursalDate;
		this.maxEligibleLoanAmount = maxEligibleLoanAmount;
		this.repaymentFrequency = repaymentFrequency;
	}
	public void calculateEmi()
	{
		
	}
	public void generateRepaymentSchedule()
	{
		
	}
	public double calculateLatePenality(LocalDate currentDate)
	{
		return 0.0;
	}
	public void calculateEligibleLoanAmount()
	{
		
	}
	
	

}
