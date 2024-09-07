package main.java.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordGenerator {

    public String hashPassword(String rawPassword) {
        try {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);

            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);

            byte[] hashedPassword = md.digest(rawPassword.getBytes(StandardCharsets.UTF_8));

            return new String(hashedPassword,  StandardCharsets.UTF_8);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

}
