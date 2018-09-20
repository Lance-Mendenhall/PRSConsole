
public class User {

	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String phoneNumber;
	private String email;
	private int isReviewer;
	
	public User(int iD, String username, String password, String firstname, String lastname, String phoneNumber,
			String email, int isReviewer) {
		id = iD;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isReviewer = isReviewer;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsReviewer() {
		return isReviewer;
	}

	public void setIsReviewer(int isReviewer) {
		this.isReviewer = isReviewer;
	}
	
	
	
}
