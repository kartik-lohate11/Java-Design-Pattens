package org.example.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User> users = new ArrayList<>();

    public UserManagement(List<User> users) {
        this.users.addAll(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public MyIterator iterator() {
        return new MyIteratorImpl(users);
    }

}
