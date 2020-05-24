package edu.ti.caih313.collections.aggregate;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;

import java.util.Arrays;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;
import static edu.ti.caih313.collections.dataobj.EmailAddress.EmailType;

public class PeopleWithEmailsFilterDemo
{
    public static void main(String... args)
    {

        Person johnSmith = new Person(new Name("John", "Smith"), MALE, 42);
        johnSmith.addEmail(EmailType.SCHOOL, "john.smith@ti.htc.edu");
        johnSmith.addEmail(EmailType.HOME, "john@gmail.com");
        johnSmith.addEmail(EmailType.WORK, "smith.john@careonerx.com");

        Person karlNg = new Person(new Name("Karl", "Ng"), MALE, 73);
        karlNg.addEmail(EmailType.SCHOOL, "karl.ng@ti.htc.edu");
        karlNg.addEmail(EmailType.WORK, "ng.karl@careonerx.com");

        Person jeffSmith = new Person(new Name("Jeff", "Smith"), MALE, 21);
        jeffSmith.addEmail(EmailType.SCHOOL, "jeff.smith@ti.htc.edu");
        jeffSmith.addEmail(EmailType.HOME, "jeff@gmail.com");

        Person tomRich = new Person(new Name("Tom", "Rich"), MALE, 18);
        tomRich.addEmail(EmailType.SCHOOL, "tom.rich@ti.htc.edu");

        Person bobSmith = new Person(new Name("Bob", "Smith"), MALE, 13);
        bobSmith.addEmail(EmailType.SCHOOL, "bob.smith@ti.htc.edu");

        Person janeDoe = new Person(new Name("Jane", "Doe"), FEMALE, 27);
        janeDoe.addEmail(EmailType.SCHOOL, "jane.doe@ti.htc.edu");
        janeDoe.addEmail(EmailType.HOME, "jane@gmail.com");

        Person tonyStark = new Person(new Name("Tony", "Stark"), MALE, 52);
        tonyStark.addEmail(EmailType.SCHOOL, "tony.stark@ti.htc.edu");
        tonyStark.addEmail(EmailType.WORK, "stark.tony@careonerx.com");

        Person boPeep = new Person(new Name("Bo", "Peep"), FEMALE, 205);
        boPeep.addEmail(EmailType.SCHOOL, "bo.peep@ti.htc.edu");
        boPeep.addEmail(EmailType.HOME, "bo@gmail.com");
        boPeep.addEmail(EmailType.WORK, "peep.bo@careonerx.com");

        Person personArray[] = {johnSmith, karlNg, jeffSmith, tomRich, bobSmith, janeDoe, tonyStark, boPeep};
        PeopleWithEmailsFilterDemo.printAllSchoolEmails(personArray);
        PeopleWithEmailsFilterDemo.printAllEmailsOverAgeX(personArray, 20);
        PeopleWithEmailsFilterDemo.printPersonsNumberOfEmails(personArray);
    }

    public static void printAllSchoolEmails(Person [] personArray)
    {
        System.out.println("List of Person's school email addresses");
        Arrays.stream(personArray)
                .forEach(e -> System.out.println(e.getEmailMap().get(EmailType.SCHOOL)));
    }

    public static void printAllEmailsOverAgeX(Person [] personArray, int age)
    {
        System.out.println();
        System.out.println("List of ALL Person's emails over the age of " + age + ".");
        Arrays.stream(personArray)
                .filter(p -> p.getAge() > 20)
                .forEach(e -> System.out.println(e.getName().getFirstName() + e.getName().getLastName() +
                        "'s email addresses are: " + e.getEmailMap().values()));
    }

    public static void printPersonsNumberOfEmails(Person [] personArray)
    {
        System.out.println();
        System.out.println("Print out of how many email addresses each Person has.");
        Arrays.stream(personArray)
                .sorted((p1, p2) -> p1.getEmailMap().size() - p2.getEmailMap().size())
                .forEach(p -> System.out.println(p.getName().getFirstName() + " " + p.getName().getLastName() +
                        " has " + p.getEmailMap().size() + " email addresses."));
    }
}