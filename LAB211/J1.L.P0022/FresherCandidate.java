/*
 * Ho Tan Thanh Nhan
 * DE150039
 * SE1505
 */
package managementcandidates;

public class FresherCandidate extends Candidates {
    private int graduationDate;
    private String graduationRank;
    private String UniversityName;

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        switch (1) {
            case 1:{
                this.graduationRank = "Excellence";
                break;
            }
            case 2:{
                this.graduationRank = "Good";
                break;
            }
            case 3:{
                this.graduationRank = "Fair";
                break;
            }
            case 4:{
                this.graduationRank = "Poor";
                break;
            }
            default: System.out.println("No invalid.");
        }
        
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String UniversityName) {
        this.UniversityName = UniversityName;
    }

    public FresherCandidate() {
    }

    public FresherCandidate(int graduationDate, String graduationRank, String UniversityName, String CandidateID, String FirstName, String LastName, String Address, String Phone, String Email, String CandidateType, int BirthDate) {
        super(CandidateID, FirstName, LastName, Address, Phone, Email, CandidateType, BirthDate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.UniversityName = UniversityName;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName()+"\t | "+this.getCandidateID()+"\t | graduationDate: " + this.graduationDate + "\t | graduationRank: " + this.graduationRank + "\t | UniversityName: " + this.UniversityName;
    
    }
    
    
}
