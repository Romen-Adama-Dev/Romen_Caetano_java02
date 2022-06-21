package pk.edu.pk.erasmus.java;
public class Main {
    public static void main(String[] args){
        String[] subjects={"Java Programming",
                "Computer Nertworks",
                "Elements of Artificial",
                "Cryptography",
                "Software Engineering",
                "Parallel and Distributed Programming",
                "Polish Course"};

        for(String i: subjects){
            System.out.println(i+"\n");
        }
        for(int i = 0; i < subjects.length; i++){
            System.out.println("\n" + subjects[i]);
        }
        Student a = new Student ("Juan","Juanito Juan","Juanito Golondrina");
        Student b = new Student ("Amigo","de los","Gallos");
        Student c = new Student ("y","las","Gallinas");
        System.out.println("ref: Juan Juanito Juan");

        Student r = new Student("Romen Adama","Caetano","Ramirez");

        a.printStudents(r,a,b,c);
    }
}


