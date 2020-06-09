package lesson;

public class User {
    private int id;
    private String name;
    private String position = "Manager";
    private int age;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }



    public void info(){
        System.out.println("ID - " + id + " Age - " + age + " Имя - " + name + " Должность - " + position);
    }

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

    public String getPosition() {
        return position;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


