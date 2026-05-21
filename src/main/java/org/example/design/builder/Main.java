package org.example.design.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.UserBuilder
                .getBuilder().setName("kartik")
                .setAge(22L)
                .setEmail("abc@123")
                .build();

        System.out.println(user.getAge());
    }
}
