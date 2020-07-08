package lesson6.banks;

public class VCB extends Bank {

    private Float vonNhaNuoc = 8.0f;

    public Float getVonNhaNuoc() {
        return vonNhaNuoc;
    }

    public void setVonNhaNuoc(Float vonNhaNuoc) {
        this.vonNhaNuoc = vonNhaNuoc;
    }

    public Float getLaiSuat6Thang(){
        return 6.0f;
    }

    public void show(){
        System.out.println("This is class VCB");
    }

    public VCB(Float vonNhaNuoc) {
        this.vonNhaNuoc = vonNhaNuoc;
    }

    public VCB(String name, String logo, Float laiSuat, Float vonNhaNuoc) {
        super(name, logo, laiSuat);
        this.vonNhaNuoc = vonNhaNuoc;
    }

    public Float laiSuat1Nam(){
        return 6.0f;
    }
}
