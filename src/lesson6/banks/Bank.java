package lesson6.banks;

public class Bank {
    private String name;
    private String logo;
    private Float laiSuat;

    public Bank() {
    }

    public Bank(String name, String logo, Float laiSuat) {
        this.name = name;
        this.logo = logo;
        this.laiSuat = laiSuat;
    }

    protected void printLaiSuat(){
        System.out.println(laiSuat);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.printLaiSuat();
    }

    public Float laiSuat1Nam(){
        return 8.0f;
    }
}
