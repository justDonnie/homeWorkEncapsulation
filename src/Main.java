import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        University university = new University("AUCA",1995,"Business",2000);
        University university1 = new University("BGU",1990,"Languages",3000);
        University university2 = new University("IUK",1995,"Int.Relations",2600);
        University university3 = new University("KGUSTA",1970,"Architect",2200);
        University[] universities = {university,university1,university2,university3};
        System.out.println("<~~~~~~~~~~~~~~~Universities~~~~~~~~~~~~~~~~~~~>");
        for (University u:universities) {
            System.out.println(u);
        }

        System.out.println("<~~~~~~~~~~~~~~~Schools~~~~~~~~~~~~~~~~~~~>");

        School school1=new School();
        school1.setSchoolName("Lenina");
        school1.setYearOfFound(1976);
        school1.setHeading("Gymnasium");
        school1.setPupilsQuantity(870);

        School school2=new School();
        school2.setSchoolName("Bokonbaeva");
        school2.setYearOfFound(1986);
        school2.setHeading("Lyceum");
        school2.setPupilsQuantity(1200);

        School school3=new School();
        school3.setSchoolName("Gagarina");
        school3.setYearOfFound(1970);
        school3.setHeading("Gymnasium");
        school3.setPupilsQuantity(1500);


        School[]schools = {school1,school2,school3};
        for (School s : schools) {
            System.out.println(s);
        }

        Car car1 = new Car();
        car1.setBrandName("BMW");
        car1.setModel("I5");
        car1.setMaxSpeed(350);
        car1.setNumSeats(4);


        Car car2 = new Car();
        car2.setBrandName("Mercedes Benz");
        car2.setModel("AMG");
        car2.setMaxSpeed(400);
        car2.setNumSeats(4);

        Car car3 = new Car();
        car3.setBrandName("Honda");
        car3.setModel("Accord");
        car3.setMaxSpeed(250);
        car3.setNumSeats(4);


        System.out.println();
        Car [] cars = {car1,car2,car3};
        System.out.println("<~~~~~~~~~~~~~~~~Cars~~~~~~~~~~~~~~~~~~>");
        for (Car c : cars) {
            System.out.println(c);
        }


        Person person1 = new Person();
        person1.setFullName("Александр");
        person1.setAge(56);
        person1.setEducation("Высшее");
        person1.setWorkExp(15);

        Person person2 = new Person();
        person2.setFullName("Максим");
        person2.setAge(25);
        person2.setEducation("Высшее-неоконченное");
        person2.setWorkExp(5);

        Person person3 = new Person();
        person3.setFullName("Мария");
        person3.setAge(32);
        person3.setEducation("Высшее");
        person3.setWorkExp(6);

        System.out.println();
        Person [] people = {person1,person2,person3};
        System.out.println("<~~~~~~~~~~~~~~~~People~~~~~~~~~~~~~~~~~~>");
        for (Person k : people) {
            System.out.println(k);
        }




    }
}