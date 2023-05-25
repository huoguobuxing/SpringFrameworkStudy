package InstantiatingBean;


public class Dog {

    public Dog() {
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id = 1;
    private String name = "name1";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dog createInstance() {
        return new Dog(2, "name2");
    }

    public Dog createInstance2() {
        return new Dog(3, "name3");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
