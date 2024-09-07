package main.java.repository;

import main.java.model.User;

import java.util.List;

public class UserRepository {

    public List<User> findAll() {
        return UserManifest.users;
    }

    public User findByEmailAddress(String email) {
        return findAll().stream()
                .filter(user -> user.getEmailAddress().equals(email))
                .findAny()
                .orElse(null);
    }

    public User findByPhoneNumber(String number){
        return findAll().stream()
                .filter(u -> u.getPhoneNumber().equals((number)))
                .findAny()
                .orElse(null);
    }

    public void prepareDummyUsers(List<User> users) {
        UserManifest.users.addAll(users);
    }

    public void createUser(User user) {
        UserManifest.users.add(user);
    }
}
