package course;

import java.util.ArrayList;

public class CourseHelper {

    private ArrayList<Course> courseList;

    CourseHelper() {

        Course course1 = new Course();
        course1.setCourseName("Biology 101");
        course1.setCourseId("Bio-101");

        Course course2 = new Course();
        course2.setCourseName("Chemistry 101");
        course2.setCourseId("Chem-101");

        courseList = new ArrayList<>();
        courseList.add(0,course1);
        courseList.add(1,course2);
    }

    public ArrayList<Course> getCourseList() {
            return courseList;
    }
}
