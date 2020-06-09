package lesson;



public class main {
    public static void main(String[] args) {

        User admin;
        User blogger;


        admin = new User(1,"Иван");
        blogger = new User(2,"Коля","Manager",55);

     admin.info();
     blogger.info();

    }

}


