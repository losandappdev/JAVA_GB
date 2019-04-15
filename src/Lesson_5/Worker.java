package Lesson_5;

public class Worker {

        String name;
        String position;
        String e_mail;
        String tel_num;
        int salary;
        int age;

        public Worker(String name, String position, String e_mail, String tel_num, int slary, int age) {
            this.name = name;
            this.position = position;
            this.e_mail = e_mail;
            this.tel_num = tel_num;
            this.salary = slary;
            this.age = age;
        }

        public void info(){
            System.out.println("Name:     " + name);
            System.out.println("Position: " + position);
            System.out.println("E-Mail:   " + e_mail);
            System.out.println("Tel:      " + tel_num);
            System.out.println("Salary:   " + salary + " USD");
            System.out.println("Age:      " + age + " e.o.");
            System.out.println();
        }
}
