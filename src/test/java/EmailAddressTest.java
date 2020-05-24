import edu.ti.caih313.collections.dataobj.EmailAddress;
import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.EmailAddress;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;

import static edu.ti.caih313.collections.dataobj.Person.Gender.FEMALE;
import static edu.ti.caih313.collections.dataobj.Person.Gender.MALE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EmailAddressTest
{
    @Test
    public void testPrimaryEmailMethod()
    {
        Person johnSmith = new Person(new Name("John", "Smith"), MALE, 42);
        johnSmith.addEmail(EmailAddress.EmailType.SCHOOL, "john.smith@ti.htc.edu");
        johnSmith.addEmail(EmailAddress.EmailType.HOME, "john@gmail.com");
        johnSmith.addEmail(EmailAddress.EmailType.WORK, "smith.john@careonerx.com");

        Person karlNg = new Person(new Name("Karl", "Ng"), MALE, 73);
        karlNg.addEmail(EmailAddress.EmailType.SCHOOL, "karl.ng@ti.htc.edu");
        karlNg.addEmail(EmailAddress.EmailType.WORK, "ng.karl@careonerx.com");

        Person jeffSmith = new Person(new Name("Jeff", "Smith"), MALE, 21);
        jeffSmith.addEmail(EmailAddress.EmailType.SCHOOL, "jeff.smith@ti.htc.edu");
        jeffSmith.addEmail(EmailAddress.EmailType.HOME, "jeff@gmail.com");

        Person tomRich = new Person(new Name("Tom", "Rich"), MALE, 18);
        tomRich.addEmail(EmailAddress.EmailType.SCHOOL, "tom.rich@ti.htc.edu");

        Person bobSmith = new Person(new Name("Bob", "Smith"), MALE, 13);
        bobSmith.addEmail(EmailAddress.EmailType.SCHOOL, "bob.smith@ti.htc.edu");

        Person janeDoe = new Person(new Name("Jane", "Doe"), FEMALE, 27);
        janeDoe.addEmail(EmailAddress.EmailType.SCHOOL, "jane.doe@ti.htc.edu");
        janeDoe.addEmail(EmailAddress.EmailType.HOME, "jane@gmail.com");

        Person tonyStark = new Person(new Name("Tony", "Stark"), MALE, 52);
        tonyStark.addEmail(EmailAddress.EmailType.SCHOOL, "tony.stark@ti.htc.edu");
        tonyStark.addEmail(EmailAddress.EmailType.WORK, "stark.tony@careonerx.com");

        Person boPeep = new Person(new Name("Bo", "Peep"), FEMALE, 205);
        boPeep.addEmail(EmailAddress.EmailType.SCHOOL, "bo.peep@ti.htc.edu");
        boPeep.addEmail(EmailAddress.EmailType.HOME, "bo@gmail.com");
        boPeep.addEmail(EmailAddress.EmailType.WORK, "peep.bo@careonerx.com");

        Person devorahLevi = new Person(new Name("Devorah", "Levi"), FEMALE, 19);


        Person personArray[] = {johnSmith, karlNg, jeffSmith, tomRich, bobSmith, janeDoe, tonyStark, boPeep, devorahLevi};

        String johnPrimary = johnSmith.getEmail().primaryEmail();
        assertEquals("john@gmail.com", johnPrimary);

        String karlPrimary = karlNg.getEmail().primaryEmail();
        assertEquals("ng.karl@careonerx.com", karlPrimary);

        String jeffPrimary = jeffSmith.getEmail().primaryEmail();
        assertEquals("jeff@gmail.com", jeffPrimary);

        String tomPrimary = tomRich.getEmail().primaryEmail();
        assertEquals("tom.rich@ti.htc.edu", tomPrimary);

        String bobPrimary = bobSmith.getEmail().primaryEmail();
        assertEquals("bob.smith@ti.htc.edu", bobPrimary);

        String janePrimary = janeDoe.getEmail().primaryEmail();
        assertEquals("jane@gmail.com", janePrimary);

        String tonyPrimary = tonyStark.getEmail().primaryEmail();
        assertEquals("stark.tony@careonerx.com", tonyPrimary);

        String boPrimary = boPeep.getEmail().primaryEmail();
        assertEquals("bo@gmail.com", boPrimary);

        String devorahPrimary = devorahLevi.getEmail().primaryEmail();
        assertNull(devorahPrimary);
    }
}
