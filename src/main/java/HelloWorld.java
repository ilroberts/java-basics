import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import student.StudentHelper;

class HelloWorld {

    public static void sayHello() {
            System.out.println("hello world!");
    }                

    public static void main(String[] args) {
            sayHello();
        

        StudentHelper sh = new StudentHelper();    
        HashMap hm = sh.createStudents();

        Set set = hm.entrySet();
        Iterator i = set.iterator();

        while( i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }        
    }       
}

