package entities;

public class User {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Gender;
    private String Birthday;
    private String City;
    private Integer Phone;
    private Integer ID;


    public User() {
    }

    public User(String firstName, String lastName, String email, String gender, String birthday, String city, Integer phone, Integer id) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Gender = gender;
        Birthday = birthday;
        City = city;
        Phone = phone;
        ID = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public Integer getID() {
        return ID;
    }


    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", City='" + City + '\'' +
                ", Phone=" + Phone +
                ", ID=" + ID +
                '}';
    }
}
