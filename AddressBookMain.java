import java.util.ArrayList;
import java.util.Scanner;

class contactDetail {
    public String firstname, lastname;
    public String address, city, state;
    public int zip;
    public long phoneNumber;
    public String email;

    public contactDetail(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phonenumber;
        this.email = email;
    }
	public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public long getPhoneNo() {
        return phoneNumber;
    }
    public void setPhoneNo(long phno) {
        this.phoneNumber = phno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class addressBook {
    private ArrayList<contactDetail> contactList = new ArrayList<contactDetail>();
	
		public void insertContact(contactDetail contactDetailObject) {
			contactList.add(contactDetailObject);
		}
}
public class AddressBookMain {
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
		 addressBook addressObject = new addressBook();
		String choice = "y";
       System.out.println("Wellcome to Address Book Program!");

		while(choice.equals("y") || choice.equals("Y")) {
	    	System.out.println("Firstname : ");
			String firstname = scan.nextLine();
	    	System.out.println("Lastname : ");
			String lastname = scan.nextLine();
	    	System.out.println("Address : ");
			String address = scan.nextLine();
	    	System.out.println("City : ");
			String city = scan.nextLine();
	    	System.out.println("State : ");
			String state = scan.nextLine();
	    	System.out.println("Zip : ");
			int zip = scan.nextInt();
	    	System.out.println("PhoneNumber : ");
			long phonenumber = scan.nextLong();
	    	System.out.println("Email : ");
			String email = scan.nextLine();
			System.out.println("Do you want add more contact : ");
			choice = scan.nextLine();
			scan.close();
			contactDetail contact = new contactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
			addressObject.insertContact(contact);
		}

   }
}