package managementcandidates;

public class ExperienceCandidate extends Candidates {

    private int ExpInYear;
    private String ProSkill;

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        while (ExpInYear < 0 || ExpInYear > 100) {
            System.out.print("Please enter year of experience from 0 to 100: ");
            ExpInYear = Integer.valueOf(sc.nextLine());
        }
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(int ExpInYear, String ProSkill, String CandidateID,
            String FirstName, String LastName, String Address, String Phone, String Email, String CandidateType, int BirthDate) {
        super(CandidateID, FirstName, LastName, Address, Phone, Email, CandidateType, BirthDate);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName()+"\t | "+this.getCandidateID()+"\t | Year of experience: "+this.ExpInYear+"\t | Pro Skill: "+this.ProSkill;
    }
    
    
}
