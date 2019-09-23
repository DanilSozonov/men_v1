abstract class Person {
    private String firstName;
    private String phoneNumber;
    private String passport;

    Person(String firstName, String phoneNumber, String passport) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }
}
