package main.java.service;

import main.java.exception.EmailAddressDuplicateExpection;
import main.java.exception.PasswordLengthException;
import main.java.exception.PhoneNumberDuplicateException;
import main.java.repository.UserRepository;
import main.java.dto.UserRequestDTO;
import main.java.model.User;
import main.java.util.PasswordGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final UserRepository userRepository = new UserRepository();
    private final PasswordGenerator pass = new PasswordGenerator();

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getByEmailAddress(String email) {
        return userRepository.findByEmailAddress(email);
    }

    public void createDummyUsers(List<UserRequestDTO> dto) {

        new User();

        List<User> mappedUsers = dto.stream()
                .map(User::mapFromDto)
                .collect(Collectors.toList());

//        List<User> shitUsers = new ArrayList<>();
//        for (int i = 0; i < dto.size(); i++) {
//            UserRequestDTO userRequestDTO = dto.get(i);
//            shitUsers.add(User.mapFromDto(userRequestDTO));
//        }

        userRepository.prepareDummyUsers(mappedUsers);
    }

    public void createUser(UserRequestDTO req) {
        if (userRepository.findByEmailAddress(req.getEmailAddress()) != null)
            throw new EmailAddressDuplicateExpection(
                    String.format(
                            "the given email Address %s is duplicator",
                            req.getEmailAddress()
                    )
            ); //todo: change the Exception Type to proper one

        if (userRepository.findByPhoneNumber(req.getPhoneNumber()) != null)
            throw new PhoneNumberDuplicateException(
                    String.format(
                            "the given phone number %s is duplicate",
                            req.getPhoneNumber()
                    )
            );

        if (req.getPassword().length() < 8)
            throw new PasswordLengthException(
                    "the given password have to be at least 8 characters."
            ); //todo: change the Exception Type to proper one

        String hashedPassword = pass.hashPassword(req.getPassword());

        //todo: hash the Request's Password here
        //todo: replace the hashed password with the raw password

        userRepository.createUser(User.mapFromDto(req,hashedPassword));
    }

    public static List<User> getUsers() throws IOException {
//        Path path = Paths.get("");
//        List<String> users = Files.readAllLines(path);
//
//        return users.stream()
//                .map(User::new)
//                .collect(Collectors.toList());
        return null;
    }
}

