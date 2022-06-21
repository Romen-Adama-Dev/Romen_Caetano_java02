package pk.edu.pk.erasmus.java;

public class Student {
    private String firstName;
    private String lastName;
    private String nationality;
    public Student(String firstName,String lastName,String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public void setFirstName(String newFirstame){
        firstName = newFirstame;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String newLastname){
        lastName = newLastname;
    }
    public String getLastName(){
        return lastName;
    }

    public void setNationality(String newNationality){
        nationality = newNationality;
    }
    public String getNationality(){
        return nationality;
    }

    public void printStudents(Student ... stu){
        for(Student Pk: stu){
            System.out.println("First Name: " + Pk.getFirstName());
            System.out.println("Last Name: " +Pk.getLastName());
            System.out.println("Nationality: " +Pk.getNationality());
        }
    }


}