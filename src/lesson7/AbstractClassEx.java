package lesson7;

import lession5.User;

public abstract class AbstractClassEx {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AbstractClassEx(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public AbstractClassEx() {
    }


    public void print(String name){
        System.out.println("Hello " + name);
    }

    public abstract void printInfor(String name);


    // Tinh nang dang ky
    public abstract void verifyRequest(String name);
    public abstract User findUserByName(String name);
    public abstract Integer saveUserIntoDB(User user);
}
