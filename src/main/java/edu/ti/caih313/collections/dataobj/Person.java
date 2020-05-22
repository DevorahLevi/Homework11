package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;

public class Person {
    private Name name;
    private Gender gender;

    private EmailAddress emailAddressMap;

    //age in years
    //TODO -- replace by Date birthday, and getAge that calculates age
    private Integer age;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        emailAddressMap = new EmailAddress();
        emailAddressMap.personsEmailAddress =  new HashMap<EmailAddress.EmailType, String>();
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void addEmail(EmailAddress.EmailType emailType, String emailAddress)
    {
        emailAddressMap.personsEmailAddress.put(emailType, emailAddress);
    }

    public HashMap<EmailAddress.EmailType, String> getEmailMap() { return emailAddressMap.personsEmailAddress; }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age
                + "}";
    }
}
