package HomeWork5;




public class Main {
    public static void main(String[] args) {
        Employee [] employee  = new Employee[5];

        employee[0] = new Employee("Иванов Иван Иванович", 50, "Директор", 300000, "director@gmail.com", 89058967777l);
        employee[1] = new Employee("Петров Петр Петрович", 45, "Заместитель директора", 200000, "zamdirector@gmail.com", 89058966666l);
        employee[2] = new Employee("Сидоров Сидр Сидорович", 39, "Менеджер по продажам", 100000, "manager@gmail.com", 89058968989l);
        employee[3] = new Employee("Жуков Вадим Вадимович", 39, "Специалист по IT ", 90000, "it@gmail.com", 89058965555l);
        employee[4] = new Employee("Котов Владимир Николаевич ", 56, "Програмист ", 80000, "programer@gmail.com", 89058964444l);


//        employee[0].info();
//        employee[1].info();
//        employee[2].info();
//        employee[3].info();
//        employee[4].info();

        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (int i=0; i < employee.length; i++)
            if (employee[i].getAge() > 40) employee[i].info();
    }




}
