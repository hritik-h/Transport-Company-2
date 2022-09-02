package com.training.transportcomany2.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link UserDto}
     *   <li>{@link UserDto#setAuthority(String)}
     *   <li>{@link UserDto#setContactno(int)}
     *   <li>{@link UserDto#setFirstName(String)}
     *   <li>{@link UserDto#setId(int)}
     *   <li>{@link UserDto#setLastName(String)}
     *   <li>{@link UserDto#setPassword(String)}
     *   <li>{@link UserDto#setUname(String)}
     *   <li>{@link UserDto#toString()}
     *   <li>{@link UserDto#getAuthority()}
     *   <li>{@link UserDto#getContactno()}
     *   <li>{@link UserDto#getFirstName()}
     *   <li>{@link UserDto#getId()}
     *   <li>{@link UserDto#getLastName()}
     *   <li>{@link UserDto#getPassword()}
     *   <li>{@link UserDto#getUname()}
     * </ul>
     */
    @Test
    void testConstructor() {
        UserDto actualUserDto = new UserDto();
        actualUserDto.setAuthority("JaneDoe");
        actualUserDto.setContactno(1);
        actualUserDto.setFirstName("Jane");
        actualUserDto.setId(1);
        actualUserDto.setLastName("Doe");
        actualUserDto.setPassword("iloveyou");
        actualUserDto.setUname("Uname");
        String actualToStringResult = actualUserDto.toString();
        assertEquals("JaneDoe", actualUserDto.getAuthority());
        assertEquals(1, actualUserDto.getContactno());
        assertEquals("Jane", actualUserDto.getFirstName());
        assertEquals(1, actualUserDto.getId());
        assertEquals("Doe", actualUserDto.getLastName());
        assertEquals("iloveyou", actualUserDto.getPassword());
        assertEquals("Uname", actualUserDto.getUname());
        assertEquals("UserDto [id=1, FirstName=Jane, LastName=Doe, uname=Uname, password=iloveyou, contactno=1,"
                + " authority=JaneDoe]", actualToStringResult);
    }
}

