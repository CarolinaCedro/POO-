package services;

public class Guest {

    private String Name;
    private String Email;
    private Integer Room;

    public Guest(String name, String email, Integer room) {
        Name = name;
        Email = email;
        Room = room;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getRoom() {
        return Room;
    }

    public void setRoom(Integer room) {
        Room = room;
    }

    @Override
    public String toString() {
        return Room + ":" + " " + Name + " , " + Email;
    }
}
