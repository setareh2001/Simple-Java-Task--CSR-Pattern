package main.java;

import main.java.dto.UserRequestDTO;
import main.java.exception.NotValidException;
import main.java.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class MainExample {

    private static UserService userService = new UserService();

    public static void main(String[] args) {
        System.out.println((userService.getAll().size()));

        UserRequestDTO user1 = new UserRequestDTO("Setareh",
                23,
                "female",
                "09128061655",
                "setarehkhazai80@gmail.com",
                "seti802001"
        );
        UserRequestDTO user2 = new UserRequestDTO("abbas",
                29,
                "male",
                "09276348736",
                "abbassashrafi@gmail.com",
                "sjdhfkfjj");
        UserRequestDTO user3 = new UserRequestDTO("hassan",
                45,
                "male",
                "09562876342",
                "hassangholi@gmail.com",
                "eowiggggffffiiiuuu");
        UserRequestDTO user4 = new UserRequestDTO("parvaneh",
                34,
                "female",
                "09129854235",
                "parvaneh1368@gmail.com",
                "jshjdlouww998");
        UserRequestDTO user5 = new UserRequestDTO("samira",
                27,
                "female",
                "09235674328",
                "samira@gmail.com",
                "hdjsssskdjff");
        List<UserRequestDTO> requests = new ArrayList<>();
        requests.add(user1);
        requests.add(user2);
        requests.add(user3);
        requests.add(user4);
        requests.add(user5);

        userService.createDummyUsers(requests);
        System.out.println(userService.getAll().size());


//        for (int i = 1; i < 11; i++) {
//            if (i % 7 == 0) {
//                throw new NotValidException(String.format("Entered notValid Number: %d", i));
//            }
//            System.out.println(i);
//        }
    }
}





