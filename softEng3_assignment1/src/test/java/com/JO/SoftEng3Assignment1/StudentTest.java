package com.JO.SoftEng3Assignment1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {

    @Test
    public void generateUsernameTest() throws Exception{
        String name = "Andrew";
        Byte age = 19;

        Student s = new Student("Andrew", 19, "14/12/1998", "14415987");

        String username = name + String.valueOf(age);

        assertEquals(username, s.generateUsername("Andrew", 19));
    }
}