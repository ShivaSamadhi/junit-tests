import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CohortTest extends TestCase {

    public void testGetCohortAverage() {
    }

    public void testAddStudent() {
        List<Student> students = new ArrayList<>();
       Student student = new Student(1, "Ramaj");
        Cohort.addStudent(student);
        assertTrue(students.contains("Ramaj"));
    }

    public void testGetStudents() {
    }
}