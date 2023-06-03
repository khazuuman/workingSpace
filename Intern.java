
package candidatemanage;

public class Intern extends Candidate{
    private String major;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, int semester, String universityName, String firstName, String lastName, int birth, String phone, String email, String address, int type) {
        super(firstName, lastName, birth, phone, email, address, type);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUni_name() {
        return universityName;
    }

    public void setUni_name(String universityName) {
        this.universityName = universityName;
    }
    
}
