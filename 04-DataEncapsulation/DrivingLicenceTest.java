public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("Jane");
        dl.setSurname("Doe");
        dl.setAdress("Starowiślna 4");
        dl.setPostalCode("30-600");
        dl.setCity("Kraków");
        dl.setDrivingLicenceNumber("1234");
        dl.setYearOfIssue(2023);
        dl.setDrivingLicenceCategory("B");
        dl.display();
        System.out.println(dl.toString());
    }
}