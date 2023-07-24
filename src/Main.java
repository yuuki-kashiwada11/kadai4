import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("yamada", 10, "A"));
        students.add(new Student("tanaka", 10, "B"));
        students.add(new Student("yasuda", 11, "A"));
        students.add(new Student("suzuki", 11, "B"));

        //classroomがAの人を選ぶ
        students.stream().filter(student -> student.getClassroom().contains(("A")))
        //classroomがAのnameを出力
        .forEach(student -> System.out.println(student.getName()));
    }
}
