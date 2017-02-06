import java.text.SimpleDateFormat;

public class Customer {
	private String firstname;
	private String lastname;
	private String identity;
	private long singupdate;
	private char gender;
	
	public Customer(String Firstname, String Lastname, String Identity, long SingDate, char Gender)
	{
		firstname = Firstname;
		lastname = Lastname;
		identity = Identity;
		singupdate = SingDate;
		gender = Gender;
	}
	
	public void setFirstName(String Firstname) { firstname = Firstname; }
	
	public String getFirstName() { return firstname; }
	
	public void setLastName(String LastName) { lastname = LastName; }
	
	public String getLastName() { return lastname; }
	
	public void setIdentity(String Identity) { identity = Identity; }
	
	public String getIdentity() { return identity; }
	
	public void setSingupDate(long date) { singupdate = date; }
	
	public String getSingupDate()
	{ 
		SimpleDateFormat date = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String date2 = date.format(singupdate);
		return date2; 
	}
	
	public void setGender(char Gender) { gender = Gender; }
	
	public String getGender() { if(gender == 'm') return "Male"; else return "Female"; }
	
}
