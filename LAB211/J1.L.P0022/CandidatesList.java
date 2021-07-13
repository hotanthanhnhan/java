package managementcandidates;

import java.util.*;

public class CandidatesList {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Candidates> List = new ArrayList<>();

    public ArrayList<Candidates> getList() {
        return List;
    }

    public void setList(ArrayList<Candidates> List) {
        this.List = List;
    }

    public CandidatesList() {
    }
    
    public void addCandidates(int t){
        switch (t) {
            case 0:{
                ExperienceCandidate E = new ExperienceCandidate();
                System.out.print("Candidate ID: ");
                E.setCandidateID(sc.nextLine());
                System.out.print("First name: ");
                E.setFirstName(sc.nextLine());
                System.out.print("Last name: ");
                E.setLastName(sc.nextLine());
                System.out.print("Address: ");
                E.setAddress(sc.nextLine());
                System.out.print("Phone number: ");
                E.setPhone(Validation.checkInputPhone());
                System.out.print("Email: ");
                E.setEmail(Validation.checkInputEmail());
                System.out.print("Year of bithday: ");
                E.setBirthDate(Integer.valueOf(sc.nextLine()));
                E.setCandidateType(t);
                System.out.print("Year of experience: ");
                E.setExpInYear(Integer.valueOf(sc.nextLine()));
                System.out.print("Pro Skill: ");
                E.setProSkill(sc.nextLine());
                List.add(E);
                break;
            }
            case 1:{
                FresherCandidate F = new FresherCandidate();
                System.out.print("Candidate ID: ");
                F.setCandidateID(sc.nextLine());
                System.out.print("First name: ");
                F.setFirstName(sc.nextLine());
                System.out.print("Last name: ");
                F.setLastName(sc.nextLine());
                System.out.print("Address: ");
                F.setAddress(sc.nextLine());
                System.out.print("Phone number: ");
                F.setPhone(Validation.checkInputPhone());
                System.out.print("Email: ");
                F.setEmail(Validation.checkInputEmail());
                System.out.print("Year of bithday: ");
                F.setBirthDate(Integer.valueOf(sc.nextLine()));
                F.setCandidateType(t);
                System.out.print("Year graduation: ");
                F.setGraduationDate(Integer.valueOf(sc.nextLine()));
                System.out.print("Choose Graduation Rank (1 - Excellence, 2 - Good, 3 - Fair, 4 - Poor): ");
                int k = Integer.valueOf(sc.nextLine());
                while(k != 1 && k != 2 && k != 3){
                    System.out.println("No invalid. Please choice again!");
                    System.out.print("Choose Graduation Rank (1 - Excellence, 2 - Good, 3 - Fair, 4 - Poor): ");
                    k = Integer.valueOf(sc.nextLine());
                }
                F.setGraduationRank(k);
                System.out.print("University name: ");
                F.setUniversityName(sc.nextLine());
                List.add(F);
                break;
            }
            case 2:{
                InternCandidate I = new InternCandidate();
                System.out.print("Candidate ID: ");
                I.setCandidateID(sc.nextLine());
                System.out.print("First name: ");
                I.setFirstName(sc.nextLine());
                System.out.print("Last name: ");
                I.setLastName(sc.nextLine());
                System.out.print("Address: ");
                I.setAddress(sc.nextLine());
                System.out.print("Phone number: ");
                I.setPhone(Validation.checkInputPhone());
                System.out.print("Email: ");
                I.setEmail(Validation.checkInputEmail());
                System.out.print("Year of bithday: ");
                I.setBirthDate(Integer.valueOf(sc.nextLine()));
                I.setCandidateType(t);
                System.out.print("Mojors: ");
                I.setMajors(sc.nextLine());
                System.out.print("Semester: ");
                I.setSemester(sc.nextLine());
                System.out.print("University name: ");
                I.setUniversityName(sc.nextLine());
                List.add(I);
                break;
            }   
            default: System.out.println("No invalid.");
        }
    }
    public void searchName(String Name){
        ArrayList<Candidates> res = new ArrayList<>();
        Name = Name.trim();
        boolean check = false;
        for (Candidates e : List) {          
            if(e.getLastName().trim().contains(Name) || e.getFirstName().trim().contains(Name)) {
                check = true;
                res.add(e);
            }
        }
        if(!check) System.out.println("Can't find name: "+Name);
        else for(Candidates e : res)
            System.out.println(e.getCandidateID()+" | "+e.getFirstName()+" "+e.getLastName()+"\t | "+e.getPhone()+"\t | "+e.getEmail());
    }
}
