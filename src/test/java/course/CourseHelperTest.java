package course;

import org.junit.*;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class CourseHelperTest {

    private CourseHelper ch;

    public CourseHelperTest() {
    }

    @Before
    public void setUp() {
        ch = new CourseHelper();
    }

    @Test
    public void getCourseListTest() {

        ArrayList<Course> courseList = ch.getCourseList();    
        assertTrue(courseList.size()==2);
    }    
}

