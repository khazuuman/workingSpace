package candidatemanage;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidatemanage {

    private static ArrayList<Candidate> candidates = new ArrayList<>();
    private static int option;
    private static int yearOfExperience, birth, semester;
    private static String rankOfGraduation = null;
    private static String firstName, lastName, address, phone, email, proSkill, graduateTime, universityFresher, major, universityIntern;
    private static int type = 0;

    public static void mainMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }

    public static boolean checkDigit(String s) {
        try {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    throw new IllegalArgumentException("Names can't have numbers");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return true;
        }
        return false;
    }

    public static boolean checkEmpty(String s) {
        if (s.isEmpty()) {
            System.out.println("Cannot be blank!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPhone(String phone) {
        if (phone.length() < 10) {
            System.out.println("Phone is the number with minium 10 characters!");
            return true;
        }
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                System.out.println("Phone can't have letters");
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmail(String email) {
        String email_check = "^[A-Za-z0-9]+@[A-Za-z]+.[A-Za-z]+$";
        if (!email.matches(email_check)) {
            System.out.println("Follow with form: <account name>@<domain>.<>");
            return true;
        }
        return false;
    }

    public static boolean checkDate(String graduateTime) {
        String check = "^\\d{2}/\\d{2}/\\d{4}$";
        if (!graduateTime.matches(check)) {
            System.out.println("Follow with form: dd/mm/yyyy");
            return true;
        }
        return false;
    }

    public static boolean checkEmpty_Digit_SpecialCharacter(String s) {
        if (checkEmpty(s)) {
            return true;
        } else if (checkDigit(s)) {
            return true;
        } else if (checkSpecialCharacter(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSpecialCharacter(String s) {
        if (s.matches(".*[^a-zA-Z].*")) {
            System.out.println("Names can't have special characters!");
            return true;
        }
        return false;
    }

    public static boolean checkBirth(int birth) {
        int count;
        String birthNumber = Integer.toString(birth);
        count = birthNumber.length();
        if (count != 4) {
            System.out.println("Birth Date must be have 4 elements!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkYearOfExperience(int y) {
        if (y < 0 || y > 100) {
            System.out.println("!! 0 to 100 !!");
            return true;
        }
        return false;
    }

    public static void checkRankOfGraduation(int choice, String rank) {
        Scanner sc = new Scanner(System.in);
        do {
            switch (choice) {
                case 1:
                    rank = "Excellence";
                    break;
                case 2:
                    rank = "Good";
                    break;
                case 3:
                    rank = "Fair";
                    break;
                case 4:
                    rank = "Poor";
                    break;
                default:
                    System.out.println("Not valid!");
            }
            if (choice < 1 || choice > 4) {
                System.out.print("Enter Rank of Graduation (1. Excellence, 2.Good, 3.Fair, 4.Poor): ");
                choice = sc.nextInt();
            }
        } while (choice < 1 || choice > 4);
    }

    public static boolean checkSemester(int semester) {
        if (semester < 1 || semester > 9) {
            System.out.println("!! 1 to 9 !!");
            return true;
        }
        return false;
    }

    public static boolean checkTypeOfCandidate(int t) {
        if (t < 0 || t > 2) {
            System.out.println("Candidate just has 3 type: 0-Experience, 1-Fresher, 2-Intern");
            return true;
        }
        return false;
    }   

    public static void input(ArrayList<Candidate> list) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        while (true) {                                                                                                    //first name
            if (checkEmpty_Digit_SpecialCharacter(firstName)) {
                System.out.print("Enter first name: ");
                firstName = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        while (true) {
            if (checkEmpty_Digit_SpecialCharacter(lastName)) {
                System.out.print("Enter last name: ");
                lastName = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Enter Birth Date: ");
        birth = sc.nextInt();                                                                                                     //birth graduateTime
        while (true) {
            if (checkBirth(birth)) {
                System.out.print("Enter Birth Date: ");
                birth = sc.nextInt();
            } else {
                break;
            }
        }

        sc.nextLine();
        System.out.print("Enter phone: ");
        phone = sc.nextLine();                                                                                                             //phone
        while (true) {
            if (checkPhone(phone)) {
                System.out.print("Enter phone: ");
                phone = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Enter email: ");
        email = sc.nextLine();
        while (true) {
            if (checkEmail(email)) {
                System.out.print("Enter email: ");
                email = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Enter addresss: ");
        address = sc.nextLine();                                                                                                       //address
        while (true) {
            if (checkEmpty(address)) {
                System.out.print("Enter addresss: ");
                address = sc.nextLine();
            } else {
                break;
            }
        }

        switch (option) {
            case 1:
                System.out.print("Enter Year of Experience: ");
                yearOfExperience = sc.nextInt();                                                                                      //year of experience
                while (true) {
                    if (checkYearOfExperience(yearOfExperience)) {
                        System.out.print("Enter Year of Experience: ");
                        yearOfExperience = sc.nextInt();
                    } else {
                        break;
                    }
                }

                sc.nextLine();
                System.out.print("Enter Professional Skill: ");
                proSkill = sc.nextLine();                                                                      //pro skill
                while (true) {
                    if (checkEmpty(proSkill)) {
                        System.out.print("Enter Professional Skill: ");
                        proSkill = sc.nextLine();
                    } else {
                        break;
                    }
                }

                Experience experience = new Experience(yearOfExperience, proSkill, firstName, lastName, birth, phone, email, address, type);
                experience.setType(0);
                list.add(experience);
                break;
            case 2:
                System.out.print("Enter graduation time: ");
                graduateTime = sc.nextLine();                                                                             //graduation time
                while (true) {
                    if (checkDate(graduateTime)) {
                        System.out.print("Enter graduation time: ");
                        graduateTime = sc.nextLine();
                    } else {
                        break;
                    }
                }

                int choice;                                                                                                                                                                                   //rank of graduation
                System.out.print("Enter Rank of Graduation (1. Excellence, 2.Good, 3.Fair, 4.Poor): ");
                choice = sc.nextInt();
                checkRankOfGraduation(choice, rankOfGraduation);

                sc.nextLine();
                System.out.print("Enter university graduated: ");
                universityFresher = sc.nextLine();                                                              //university name
                while (true) {
                    if (checkEmpty(universityFresher)) {
                        System.out.print("Enter university graduated: ");
                        universityFresher = sc.nextLine();
                    } else {
                        break;
                    }
                }

                Fresher fresher = new Fresher(graduateTime, rankOfGraduation, universityFresher, lastName, firstName, birth, phone, email, address, type);
                fresher.setType(1);
                list.add(fresher);
                break;
            case 3:
                System.out.print("Enter major: ");
                major = sc.nextLine();                                                                                          //majors                                                                                     
                while (true) {
                    if (checkEmpty(major)) {
                        System.out.print("Enter major: ");
                        major = sc.nextLine();
                    } else {
                        break;
                    }
                }

                System.out.println("Enter semester: ");
                semester = sc.nextInt();                                                                                       //semester
                while (true) {
                    if (checkSemester(semester)) {
                        System.out.println("Enter semester: ");
                        semester = sc.nextInt();
                    } else {
                        break;
                    }
                }

                sc.nextLine();
                System.out.print("Enter university name: ");
                universityIntern = sc.nextLine();                                                                    //university name
                while (true) {
                    if (checkEmpty(universityIntern)) {
                        System.out.print("Enter university name: ");
                        universityIntern = sc.nextLine();
                    } else {
                        break;
                    }
                }

                Intern intern = new Intern(major, semester, universityIntern, firstName, lastName, birth, phone, email, address, type);
                intern.setType(2);
                list.add(intern);
                break;
        }
    }

    public static void checkUser() {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Do you want to continue (Y/N)?");
            System.out.print("Your choice: ");
            choice = sc.nextLine();
            if (choice.toUpperCase().equals("Y")) {
                input(candidates);
            } else if (choice.toUpperCase().equals("N")) {
                break;
            } else {
                System.out.println("Just Y or N (Yes/No)");
            }
        } while (true);

        System.out.println("============EXPERIENCE CANDIDATE============");
        for (Candidate can : candidates) {
            if (can.getType() == 0) {
                System.out.println(can.getFirstname() + " " + can.getLastname());
            }
        }
        System.out.println("============FRESHER CANDIDATE============");
        for (Candidate can : candidates) {
            if (can.getType() == 1) {
                System.out.println(can.getFirstname() + " " + can.getLastname());
            }
        }
        System.out.println("============INTERN CANDIDATE============");
        for (Candidate can : candidates) {
            if (can.getType() == 2) {
                System.out.println(can.getFirstname() + " " + can.getLastname());
            }
        }
    }

    public static void displayall() {
        System.out.println("=============CANDIDATES=============");
        for (Candidate can : candidates) {
            System.out.println(can.getFirstname() + " " + can.getLastname());
        }
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);
        String find;
        int typeOfCandidate;
        System.out.print("Input candidate name (First name or Last name): ");
        find = sc.nextLine();
        while (true) {
            if (checkEmpty(find)) {
                System.out.print("Input candidate name (First name or Last name): ");
                find = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Input type of candidate: ");
        typeOfCandidate = sc.nextInt();
        while (true) {
            if (checkTypeOfCandidate(typeOfCandidate)) {
                System.out.print("Input type of candidate: ");
                typeOfCandidate = sc.nextInt();
            }
            else break;
        }

        boolean check = true;
        for (Candidate can : candidates) {
            String fullastName = can.getFirstname() + can.getLastname();
            if (fullastName.toLowerCase().contains(find.toLowerCase()) && can.getType() == typeOfCandidate) {
                System.out.println(can.getFirstname() + " " + can.getLastname() + " | " + can.getBirth() + " | " + can.getAddress() + " | " + can.getPhone() + " | " + can.getEmail() + " | " + can.getType());
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Candidate not exist!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            mainMenu();
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    input(candidates);
                    checkUser();
                    break;
                case 2:
                    input(candidates);
                    checkUser();
                    break;
                case 3:
                    input(candidates);
                    checkUser();
                    break;
                case 4:
                    displayall();
                    search();
                    break;
                case 5:
                    System.out.println("Thanks for using <3");
                    break;
                default:
                    System.out.println("Not valid!");
            }
        } while (option != 5);
    }
}
