package lesson7;

import lession5.User;

public class Child2Class extends AbstractClassEx {
    @Override
    public void printInfor(String name) {
        System.out.println("Hello " + name + " from child 2 class");
    }

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
}
