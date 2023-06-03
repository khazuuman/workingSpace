
package candidatemanage;

public class Fresher extends Candidate{
    private String graduateTime;
    private String graduateRank;
    private String universiryName;

    public Fresher() {
    }

    public Fresher(String graduateTime, String graduateRank, String universiryName, String firstName, String lastName, int birth, String phone, String email, String address, int type) {
        super(firstName, lastName, birth, phone, email, address, type);
        this.graduateTime = graduateTime;
        this.graduateRank = graduateRank;
        this.universiryName = universiryName;
    }

    public String getGra_time() {
        return graduateTime;
    }

    public void setGra_time(String graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getGra_rank() {
        return graduateRank;
    }

    public void setGra_rank(String graduateRank) {
        this.graduateRank = graduateRank;
    }

    public String getUni_name() {
        return universiryName;
    }

    public void setUni_name(String universiryName) {
        this.universiryName = universiryName;
    }
    
    
}
