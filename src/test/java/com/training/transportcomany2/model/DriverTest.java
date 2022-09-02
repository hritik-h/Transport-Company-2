package com.training.transportcomany2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DriverTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Driver#Driver()}
     *   <li>{@link Driver#setContactno(int)}
     *   <li>{@link Driver#setFirstName(String)}
     *   <li>{@link Driver#setId(int)}
     *   <li>{@link Driver#setLastName(String)}
     *   <li>{@link Driver#setPassword(String)}
     *   <li>{@link Driver#setUname(String)}
     *   <li>{@link Driver#toString()}
     *   <li>{@link Driver#getContactno()}
     *   <li>{@link Driver#getFirstName()}
     *   <li>{@link Driver#getId()}
     *   <li>{@link Driver#getLastName()}
     *   <li>{@link Driver#getPassword()}
     *   <li>{@link Driver#getUname()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Driver actualDriver = new Driver();
        actualDriver.setContactno(1);
        actualDriver.setFirstName("Jane");
        actualDriver.setId(1);
        actualDriver.setLastName("Doe");
        actualDriver.setPassword("iloveyou");
        actualDriver.setUname("Uname");
        String actualToStringResult = actualDriver.toString();
        assertEquals(1, actualDriver.getContactno());
        assertEquals("Jane", actualDriver.getFirstName());
        assertEquals(1, actualDriver.getId());
        assertEquals("Doe", actualDriver.getLastName());
        assertEquals("iloveyou", actualDriver.getPassword());
        assertEquals("Uname", actualDriver.getUname());
        assertEquals("User [id=1, FirstName=Jane, LastName=Doe, uname=Uname, password=iloveyou, contactno=1]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Driver#Driver(int, String, String, String, String, int)}
     *   <li>{@link Driver#setContactno(int)}
     *   <li>{@link Driver#setFirstName(String)}
     *   <li>{@link Driver#setId(int)}
     *   <li>{@link Driver#setLastName(String)}
     *   <li>{@link Driver#setPassword(String)}
     *   <li>{@link Driver#setUname(String)}
     *   <li>{@link Driver#toString()}
     *   <li>{@link Driver#getContactno()}
     *   <li>{@link Driver#getFirstName()}
     *   <li>{@link Driver#getId()}
     *   <li>{@link Driver#getLastName()}
     *   <li>{@link Driver#getPassword()}
     *   <li>{@link Driver#getUname()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Driver actualDriver = new Driver(1, "Jane", "Doe", "Uname", "iloveyou", 1);
        actualDriver.setContactno(1);
        actualDriver.setFirstName("Jane");
        actualDriver.setId(1);
        actualDriver.setLastName("Doe");
        actualDriver.setPassword("iloveyou");
        actualDriver.setUname("Uname");
        String actualToStringResult = actualDriver.toString();
        assertEquals(1, actualDriver.getContactno());
        assertEquals("Jane", actualDriver.getFirstName());
        assertEquals(1, actualDriver.getId());
        assertEquals("Doe", actualDriver.getLastName());
        assertEquals("iloveyou", actualDriver.getPassword());
        assertEquals("Uname", actualDriver.getUname());
        assertEquals("User [id=1, FirstName=Jane, LastName=Doe, uname=Uname, password=iloveyou, contactno=1]",
                actualToStringResult);
    }
}

