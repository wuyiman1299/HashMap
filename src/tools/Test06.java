package tools;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Test06 {
    public static  void main(String[] args) {
        list <Person> list= new ArrayList<Person>();


        list.add(new User(110,"Mark"));
        list.add(new User(101,"jack"));
        list.add(new User(100,"Sandi"));
        list.add(new User(111,"Rose"));

        Collections.sort(list);
        for (User user : list) {
            System.out.println(user);
        }
    }
}
