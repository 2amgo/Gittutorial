package data;

public abstract class Pet {
    protected String id;
    protected String name;
    protected int age;
    protected double weight ;
  public Pet(String id, String name, int age, double weight) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.weight = weight;
  }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract void speak();
    public abstract void showInfor();
}
