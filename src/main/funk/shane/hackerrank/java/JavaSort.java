package funk.shane.hackerrank.java;

/**
 * Created by Shane on 2/5/2016.
 */

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, cgpa, fname);
    }
}

class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(final Student student1, final Student student2) {
        final BigDecimal cpga1 = BigDecimal.valueOf(student1.getCgpa());
        final BigDecimal cpga2 = BigDecimal.valueOf(student2.getCgpa());

        int cgpa = cpga2.compareTo(cpga1);

        if (cgpa == 0.00) {
            int name = student1.getFname().compareTo(student2.getFname());
            if (name == 0) {
                return Integer.valueOf(student1.getId()).compareTo( Integer.valueOf(student2.getId()) );
            } else {
                return name;
            }
        }
        else {
            return cgpa;
        }
    }
}

//Complete the code
// ID Name CGPA
public class JavaSort {
    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("C:\\git\\scratch\\src\\resources\\notes\\JavaSort-1.txt"));
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new StudentCompare());

        for (Student st : studentList) {
//            System.out.println(st.getFname());
            System.out.println(st);
        }
    }
}
