import java.time.LocalDateTime;

public class PurchaseRequest {

	private int id;
	private int userID;
	private LocalDateTime DateNeeded;
	private String DeliveryMode;
	private int total;
	private LocalDateTime submittedDate;
	private String reasonForRejecton;
	private String status;
	
	public PurchaseRequest(int iD, int userID, LocalDateTime dateNeeded, String deliveryMode, int total,
			LocalDateTime submittedDate, String reasonForRejecton, String status) {
		id = iD;
		this.userID = userID;
		DateNeeded = dateNeeded;
		DeliveryMode = deliveryMode;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejecton = reasonForRejecton;
		this.status = status;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public LocalDateTime getDateNeeded() {
		return DateNeeded;
	}

	public void setDateNeeded(LocalDateTime dateNeeded) {
		DateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return DeliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		DeliveryMode = deliveryMode;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejecton() {
		return reasonForRejecton;
	}

	public void setReasonForRejecton(String reasonForRejecton) {
		this.reasonForRejecton = reasonForRejecton;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
