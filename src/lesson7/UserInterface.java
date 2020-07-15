package lesson7;

import lession5.User;

public interface UserInterface extends InterfaceB, InterfaceC {
    // Dang ky
    void verifyRequest(String name);
    User findUserByName(String name);
    Integer saveUserIntoDB(User user);

    //Sua thong tin
    User updateUserInfo(User user);

    //Quen mat khau
    User findUserByEmail(String email);
    void sendTokenToEmail(String token, String email);

    // Xoa user
    void deletedUser(String username);

    void printBInfo();

    void printCInfo();
}
