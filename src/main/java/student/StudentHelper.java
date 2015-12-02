package student;

import java.util.HashMap;

public class StudentHelper {

    public HashMap createStudents() {

        HashMap hm = new HashMap();
        hm.put("Student1", new Integer(1));
        hm.put("Student2", new Integer(2));
        hm.put("Student3", new Integer(3));
        hm.put("Student4", new Integer(4));
        hm.put("Student5", new Integer(5));    
        return(hm);
    }
}

