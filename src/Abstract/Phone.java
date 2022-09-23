package Abstract;

public abstract class Phone {
    public String name;
    public String phone;
    public String oldPhone;
    public String newPhone;
    abstract void insertPhone(String name, String phone);
    abstract void removePhone(String name);

    abstract void updatePhone(String name, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();

}
