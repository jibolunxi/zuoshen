package class2;

import java.util.Arrays;
import java.util.Comparator;

public class SortComparator {
    public static void main(String[] args) {
        Student[] students = {new Student(0, "a", 2), new Student(1, "b", 1), new Student(2, "c", 0)};
        for (Student student : students) {
            System.out.println(student.getId() + student.getName() + student.getAge());
        }
        Arrays.sort(students, new IDDescComparator());
        for (Student student : students) {
            System.out.println(student.getId() + student.getName() + student.getAge());
        }
    }
}

class IDAscComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getId() - o2.getId();
    }
    
}

class IDDescComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o2.getId() - o1.getId();
    }
    
}


