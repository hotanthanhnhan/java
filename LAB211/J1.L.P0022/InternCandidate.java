package managementcandidates;

public class InternCandidate extends Candidates{
    private String Majors;
    private String Semester;
    private String universityName;

    public InternCandidate(String Majors, String Semester, String universityName, String CandidateID, String FirstName, String LastName, String Address, String Phone, String Email, String CandidateType, int BirthDate) {
        super(CandidateID, FirstName, LastName, Address, Phone, Email, CandidateType, BirthDate);
        this.Majors = Majors;
        this.Semester = Semester;
        this.universityName = universityName;
    }

    public InternCandidate() {
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName()+"\t | "+this.getCandidateID()+"\t | Majors: "+this.Majors+"\t | Semester: "+this.Semester+"\t | university name: "+this.universityName;
    }
    
}
