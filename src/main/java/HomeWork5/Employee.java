package HomeWork5;

public class Employee {
    private String fullName;
    private int age;
    private String position;
    private int salary;
    private String email;
    private long phone;

    public Employee(String fullName, int age, String position, int salary, String email, long phone) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }


    public void info() {
        System.out.print("ФИО сотрудника: " + getFullName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "Должность " + getPosition() + " \n" +
                "Зарплата: " + getSalary() + "\n" +
                "E-Mail: " + getEmail() + "\n" +
                "Телефон: " + getPhone());
        System.out.print("\n");
        System.out.print("\n");

    }

}

