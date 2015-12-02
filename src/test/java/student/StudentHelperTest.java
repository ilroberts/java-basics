package student;

import org.junit.*;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class StudentHelperTest {

    private StudentHelper sh;

    public StudentHelperTest() {
    }

    @Before
    public void setUp() {
        sh = new StudentHelper();
    }

    @Test
    public void createStudentTest() {

        HashMap hm = sh.createStudents();    
        assertTrue(hm.size()==5);
    }    
}

