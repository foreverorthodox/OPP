public class Worker {
    String name;
    String position;
    String email;
    int phone;
    int salary;
    int age;


    public Worker(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    public static void main(String[] args) {

        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Петров Пётр Петрович", "Руководитель отдела продаж",
                "Petya.ruk@mail.ru", 234546, 80000, 40);
        workers[1] = new Worker("Иванов Иван Иванович", "Заместитель куроковдителя",
                "Ivan.men@mail.ru", 247556, 57000, 36);
        workers[2] = new Worker("Сидоров Сидор Сидорович", "Старший сотрудник",
                "Sidor.men@mail.ru", 539586, 45000, 44);
        workers[3] = new Worker("Русланв Руслан Русланович", "Менеджер",
                "Ruslan.prod@mail.ru", 434548, 34000, 29);
        workers[4] = new Worker("Евгеньев Евгений Евгеньевич", "Продавец",
                "Evgeniy.prod@mail.ru", 634748, 28000, 25);
        workers[0].info();
        workers[1].info();
        workers[2].info();
        workers[3].info();
        workers[4].info();


    }


    public void info() {
        System.out.println("Worker name: " + name + " position: " + position + " email: " + email +
                " phone: " + phone + " salary: " + salary + " age: " + age);
    }

}
