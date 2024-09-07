package main.java.model;

import main.java.dto.UserRequestDTO;

import java.util.ArrayList;

public class User {

    private String name;
    private Integer age;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private String password;

//    ArrayList<User> users = new ArrayList<>();

//    public static User new() {
//    }
    public User() {
    }

//    public static User new(String name, Integer age, String gender, String phoneNumber, String emailAddress, String password) {
//    }
    public User(String name, Integer age, String gender, String phoneNumber, String emailAddress, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public static User mapFromDto(UserRequestDTO dto, String hashedPassword) {
        return new User(
                dto.getName(),
                dto.getAge(),
                dto.getGender(),
                dto.getPhoneNumber(),
                dto.getEmailAddress(),
                hashedPassword
        );
    }

    public static User mapFromDto(UserRequestDTO dto) {
        return new User(
                dto.getName(),
                dto.getAge(),
                dto.getGender(),
                dto.getPhoneNumber(),
                dto.getEmailAddress(),
                dto.getPassword());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
