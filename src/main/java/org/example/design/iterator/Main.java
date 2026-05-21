package org.example.design.iterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement(Arrays.asList(new User("Mohan", 24L),
                new User("Kartik", 22L),
                new User("Aman", 24L), new User("ramu", 24L)));

        MyIterator iterator = userManagement.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
