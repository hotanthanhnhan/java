package managementcandidates;

import java.util.Scanner;

public class Candidates {
    Scanner sc = new Scanner(System.in);
    private String CandidateID, FirstName, LastName,
                   Address, Phone, Email, CandidateType;
    private int BirthDate; 

    public String getCandidateID() {
        return CandidateID;
    }

    public void setCandidateID(String CandidateID) {
        this.CandidateID = CandidateID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCandidateType() {
        return CandidateType;
    }

    public void setCandidateType(int CandidateType) {
        switch (CandidateType) {
            case 0:{
                this.CandidateType = "Experience";
                break;
            }
            case 1:{
                this.CandidateType = "Fresher candidate";
                break;
            }
            case 2:{
                this.CandidateType = "Intern candidate";
                break;
            }      
            default: System.out.println("No invalid.");
                
        }
    }

    public int getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(int BirthDate) {
        while (BirthDate < 1990 || BirthDate > 2021) {
            System.out.print("Please enter year of bith form 1990 to 2021: ");
            BirthDate = Integer.valueOf(sc.nextLine());
        }
        this.BirthDate = BirthDate;
    }

    public Candidates(String CandidateID, String FirstName, String LastName, String Address, String Phone, String Email, String CandidateType, int BirthDate) {
        this.CandidateID = CandidateID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.CandidateType = CandidateType;
        this.BirthDate = BirthDate;
    }

    public Candidates() {
    }
}
