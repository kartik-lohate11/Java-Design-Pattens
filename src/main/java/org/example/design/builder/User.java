package org.example.design.builder;

public class User {
    private final String name;
    private final String email;
    private final Long age;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getAge() {
        return age;
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private Long age;

        private UserBuilder() {

        }

        public static UserBuilder getBuilder() {
            return new UserBuilder();
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(Long age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
