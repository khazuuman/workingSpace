
package candidatemanage;

public class Experience extends Candidate{
    private int ExplnYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExplnYear, String ProSkill, String firstName, String lastName, int birth, String phone, String email, String address, int type) {
        super(firstName, lastName, birth, phone, email, address, type);
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int ExplnYear) {
        this.ExplnYear = ExplnYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
}
