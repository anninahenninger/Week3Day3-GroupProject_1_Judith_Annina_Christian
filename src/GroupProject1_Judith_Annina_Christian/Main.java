package GroupProject1_Judith_Annina_Christian;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Dark", new String[]{"Math", "Biology", "Physics"});
        Teacher t2 = new Teacher("Mrs. Golightly",new String[]{"English", "Art", "Geography"});
        Teacher t3 = new Teacher("Mr. Just",new String[]{"PhyEdu", "Math", "Physics"});
        Teacher t4 = new Teacher("Mr. Happy", new String[]{"PhyEdu", "Geography", "English"});
        Teacher t5 = new Teacher("Mr. Gloriuous", new String[]{"Art", "Biology", "Geography"});
        Teacher t6 = new Teacher("Mr. Brilliant", new String[]{"English", "Math", "Art"});
        Teacher t7 = new Teacher("Mrs. Absolute", new String[]{"PhyEdu", "Geography", "Math"});
        Teacher t8 = new Teacher("Mrs. Lord", new String[]{"Art", "PhyEdu", "Physics"});
        Teacher t9 = new Teacher("Mrs. King", new String[]{"English", "Biology", "Physics"});
        Teacher t10 = new Teacher("Mrs. Allknows",new String[]{"PhyEdu", "Geography", "English"} );
        Teacher t11 = new Teacher("Mrs. Onpoint", new String[]{"Biology", "Geography", "Art"});
        Teacher t12 = new Teacher("Mrs. Strong", new String[]{"Physics", "PhyEdu", "Math"});
        Teacher t13 = new Teacher("Mr. Nothappy", new String[]{"Biology", "Math", "Physics"});
        Teacher t14 = new Teacher("Mr. Sure", new String[]{"Art", "Biology", "Math"});
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);
        teachers.add(t7);
        teachers.add(t8);
        teachers.add(t9);
        teachers.add(t10);
        teachers.add(t11);
        teachers.add(t12);
        teachers.add(t13);
        teachers.add(t14);


        String[] subjects = {"Math", "English", "Biology", "Geography", "Physics", "Art", "PhyEdu"};

        HashMap<String, Integer> pointsSt1 = new HashMap<>();
        pointsSt1.put("Math",78);
        pointsSt1.put("English",45);
        pointsSt1.put("Biology",88);
        pointsSt1.put("Geography",57);
        pointsSt1.put("Physics",74);
        pointsSt1.put("Art",90);
        pointsSt1.put("PhyEdu",99);


        String [][][] sched1a = {{{"Math", "English", "Biology", "PhyEdu"},
                                    {"Biology", "Physics", "Art", "Math"},
                                    {"Geography", "Biology", "Physics", "Art"},
                                    {"Physics", "Geography", "English", "Math"}},
                                {{"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong"},
                                  {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant"},
                                  {"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint"},
                                  {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark"}}};

        String [][][] sched1b = {{{"English", "Biology", "PhyEdu", "Art"},
                                {"Geography", "Biology", "Physics", "Art"},
                                {"Physics", "Geography", "English", "Math"},
                                {"Biology", "Physics", "Art", "Math"}},
                                {{"Mrs. Absolute", "Mrs. King","Mrs.Lord", "Mrs.Onpoint"},
                                {"Mr.Dark", "Mrs.Golightly","Mr. Sure","Mr.Strong"},
                                {"Mr. Lord", "Mrs. Allknows", "Mr. Happy", "Mr. Dark"},
                                {"Mr.Nothappy","Mr. Just", "Mrs. Onpoint", "Mr. Brilliant"}}};

        Student st1 = new Student("Benni", 7, Student.Classroom.A1, sched1a, pointsSt1,
                "benniParents@email.com", "Ada Cool", "Adam Cool");


        st1.printSchedule();
    }
}
