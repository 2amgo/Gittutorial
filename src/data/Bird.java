package data;

public class Bird extends Pet {
    public Bird(String id, String name, int age, double weight) {
        super(id, name, age, weight);
    }

    @Override
    public void speak() {
        System.out.println(this.name + " lala la ");
    }

    @Override
    public void showInfor() {
        System.out.println(this. name + this. age);
    }
}
