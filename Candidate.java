
package candidatemanage;

public class Candidate {
    private String firstName;
    private String lastName;
    private int birth;
    private String phone;
    private String email;
    private String address;
    private int type;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, int birth, String phone, String email, String address, int type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.type = type;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
}
