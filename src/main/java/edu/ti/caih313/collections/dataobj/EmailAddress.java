package edu.ti.caih313.collections.dataobj;

import java.util.HashMap;

public class EmailAddress
{
    public enum EmailType {HOME, WORK, SCHOOL}

    HashMap<EmailType, String> personsEmailAddress = new HashMap<EmailType, String>();

    public String primaryEmail(EmailType emailType)
    {
        if (personsEmailAddress.containsKey(EmailType.HOME))
        {
            return personsEmailAddress.get(EmailType.HOME);
        }
        else if (personsEmailAddress.containsKey(EmailType.WORK))
        {
            return personsEmailAddress.get(EmailType.WORK);
        }
        else if (personsEmailAddress.containsKey(EmailType.SCHOOL))
        {
            return personsEmailAddress.get(EmailType.SCHOOL);
        }
        else { return null; }
    }
}
