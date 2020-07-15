package lesson7;

import lession5.User;

public class UserService implements UserInterface{
    @Override
    public void verifyRequest(String name) {

    }

    @Override
    public User findUserByName(String name) {
        return null;
    }

    @Override
    public Integer saveUserIntoDB(User user) {
        return null;
    }

    @Override
    public User updateUserInfo(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        ///
        return null;
    }

    @Override
    public void sendTokenToEmail(String token, String email) {

    }

    @Override
    public void deletedUser(String username) {

    }

    @Override
    public void printBInfo() {

    }

    @Override
    public void printCInfo() {

    }
}
