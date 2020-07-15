package lesson7;

import lession5.User;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();

        String email = ""; // scanner tu ng dung
        User user = userService.findUserByEmail(email);

        if(user != null){
            userService.sendTokenToEmail("12345", email);
        }
    }
}
