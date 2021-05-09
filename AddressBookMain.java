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

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edit Firstname : ");
        String firstname = sc.nextLine();
        setFirstName(firstname);
        	
        System.out.println("Edit Lastname : ");
        String lastname = sc.nextLine();
        setLastName(lastname);
            
        System.out.println("Edit Address : ");
        String address = sc.nextLine();
        setAddress(address);
            
        System.out.println("Edit City : ");
        String city = sc.nextLine();
        setCity(city);
            
        System.out.println("Edit State : ");
        String state = sc.nextLine();
        setState(state);
            
        System.out.println("Edit Zip : ");
        int zip = sc.nextInt();
        setZip(zip);
            
        System.out.println("Edit PhoneNumber : ");
        long phonenumber = sc.nextLong();
        sc.nextLine();
        setPhoneNo(phonenumber);
            
        System.out.println("Edit Email : ");
        String email = sc.nextLine();
        setEmail(email);
    }

    public void printContactDetails() {
        System.out.println("Firstname : " + getFirstName());
        System.out.println("Lastname : " + getLastName());
        System.out.println("Address : " + getAddress());
        System.out.println("City : " + getCity());
        System.out.println("State : " + getState());
        System.out.println("Zip : " + getZip());
        System.out.println("PhoneNumber : " + getPhoneNo());
        System.out.println("Email : " + getEmail());

    }
}
    public void delete(String nameToDelete) {
        int i=0;
        for(i=0;i<contactList.size();i++) {
        if(contactList.get(i).firstname.equals(nameToDelete)) {
    	    contactList.remove(i);
    	    System.out.println("Contact is Deleted");
        }
        else {
            System.out.println("Contact not found!");
            }
        }
    }
    public void printContactDetails() {
        for(contactDetail getInfo: contactList) {
            System.out.println("Firstname : " + getInfo.getFirstName());
            System.out.println("Lastname : " + getInfo.getLastName());
            System.out.println("Address : " + getInfo.getAddress());
            System.out.println("City : " + getInfo.getCity());
            System.out.println("State : " + getInfo.getState());
            System.out.println("Zip : " + getInfo.getZip());
            System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
            System.out.println("Email : " + getInfo.getEmail());
        }

    }

}
class addressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<contactDetail> contactList = new ArrayList<contactDetail>();
    String addressBookName;       
}

public class AddressBookMain {
    public static void main(String args[]) {
        ArrayList<addressBook> adbook = new ArrayList<addressBook>();
        Scanner scan = new Scanner(System.in);
        String choice = "y";
        int r = 0;
        System.out.println("Wellcome to Address Book Program!");
        while(r != 3) {
            System.out.println("1.CREATE AN ADDRESS BOOK");
            System.out.println("2.ACCESS AN ADDRESS BOOK");
            System.out.println("3.EXIT THE APPLICATION");
            r = scan.nextInt();
            switch(r) {
                case 1:
                    System.out.println("Enter the name of address book to be created");
                    String name = scan.next();
                    addressBook book = new addressBook();
                    book.addressBookName = name;
                    adbook.add(book);          
                break;
                case 2:
                    int key = 0;
                    System.out.println("Enter the address book name to be accessed");
                    String accessBook = scan.next();
                    for (int j = 0; j < adbook.size(); j++) {
                    if (adbook.get(j).addressBookName.equalsIgnoreCase(accessBook)) {
                        int switchChoice = 0;
                        while(switchChoice != 5) {
                            System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
                            System.out.println("Enter choice : ");
                            switchChoice = scan.nextInt();
                            scan.nextLine();
                            choice = "y";
                            switch(switchChoice) {
                                case 1:
                                    while(choice.equals("y")) {
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
                                        scan.nextLine();
                                        String email = scan.nextLine();
                                        System.out.println("Do you want add more contact : ");
                                        choice = scan.nextLine();
                                        
                                        contactDetail contact = new contactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
                                        adbook.get(j).contactList.add(contact);                                        
                                    }
                                break;

                                case 2:
                                    System.out.println("Enter name of contact to edit : ");
                                    String nameToEdit = scan.nextLine();
                                    int i = 0;
                                    for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                        if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToEdit)) {
                                            adbook.get(j).contactList.get(i).editContact();
                                        }
                                    }        
                                break;

                                case 3:
                                    System.out.println("Enter name of contact to delete : ");
                                    String deleteCon = scan.nextLine();
                                    for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                        if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(deleteCon)) {
                                            adbook.get(j).contactList.remove(i);
                                        }
                                    }
                                break;

                                case 4:
                                    System.out.println("Enter name of contact to view : ");
                                    String nameToView = scan.nextLine();
                                    for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                        if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToView)) {
                                            adbook.get(j).contactList.get(i).printContactDetails();
                                        }
                                    }
                                break;
                                default:
                                    break;
                            }
                        }
                    
                    }
                    }
            } 
        }
    }
}
