// 8.	Define the DrivingLicense class, containing the following attributes:
// driver's name and surname, address, postal code, city, driving license number,
// year of issue and driving license category.
// Use private access modifiers when declaring attributes.
// Then, create a driving license and try to assign values to the attributes.
// What message are you getting? After that, change the access modifiers from private to public
// and try to assign values once again. What can you observe?

public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private String drivingLicenceNumber;
    private int yearOfIssue;
    private String drivingLicenceCategory;

// 10.	Apply the private access modifier to all attributes of the DriverLicense class.
// Then, create get and set methods for each of the attributes.
// After that, modify the program and the method displaying the driving license.
// Replace attributes names with get and set methods.

    
    // getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getDrivingLicenceCategory() {
        return drivingLicenceCategory;
    }


    // setters

    // 13.	Modify the setName() method in the DrivingLicense.
    // Regardless of the given name value, the value of the attribute should begin with a capital letter.
    // Replace the remaining letters with lowercase. Then check the method in action.
    // Tip. Use the methods available in the String class.
    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    // 12.	In the DrivingLicense class, modify the setter method for the year of issue attribute.
    // The valid value of the attribute should be greater than or equal to 1980
    // and less than or equal to the current year.
    // If the given value is different, do not change the attribute.
    private static int minYear = 1980;
    private static int thisYear = 2023;

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= DrivingLicence.minYear && yearOfIssue <= DrivingLicence.thisYear) {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public void setDrivingLicenceCategory(String drivingLicenceCategory) {
        this.drivingLicenceCategory = drivingLicenceCategory;
    }


// 9.	Complete the DrivingLicense class.
// Define the display() method that displays the driving license
// (all data contained on the driving license).
// Try to display the data in an attractive form.
// What access modifier will you apply to the defined method?
    public void display() {
        System.out.println("Name:\t\t" + getName());
        System.out.println("Surname:\t" + getSurname());
        System.out.println("Address:\t" + getAdress());
        System.out.println("Postal Code:\t" + getPostalCode());
        System.out.println("City:\t\t" + getCity());
        System.out.println("Driving License Number: " + getDrivingLicenceNumber());
        System.out.println("Year of Issue:\t" + getYearOfIssue());
        System.out.println("Driving License Category: " + getDrivingLicenceCategory());
        System.out.println("------------");
    }

// 11.	Add a toString() method in the DrivingLicense class to return driving license information.
// Use getter methods to get the driving license data. Then, check the method in action.
    public String toString() {
        return String.format("Driving License nr %s, for %s", getDrivingLicenceNumber(), getName() + " " + getSurname());
    }
}