package com.training.transportcomany2.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.training.transportcomany2.model.Authorities;
import com.training.transportcomany2.model.User;
import com.training.transportcomany2.repos.AuthoritiesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AuthorityService.class})
@ExtendWith(SpringExtension.class)
class AuthorityServiceTest {
    @MockBean
    private AuthoritiesRepo authoritiesRepo;

    @Autowired
    private AuthorityService authorityService;

    /**
     * Method under test: {@link AuthorityService#findAuthority(int)}
     */
    @Test
    void testFindAuthority() {
        Authorities authorities = new Authorities();
        authorities.setAuthority("JaneDoe");
        authorities.setUname("Uname");
        authorities.setUser(new User());

        User user = new User();
        user.setAuthorities(authorities);
        user.setContactno(1);
        user.setFirstName("Jane");
        user.setId(1);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setUname("Uname");

        Authorities authorities1 = new Authorities();
        authorities1.setAuthority("JaneDoe");
        authorities1.setUname("Uname");
        authorities1.setUser(user);

        User user1 = new User();
        user1.setAuthorities(authorities1);
        user1.setContactno(1);
        user1.setFirstName("Jane");
        user1.setId(1);
        user1.setLastName("Doe");
        user1.setPassword("iloveyou");
        user1.setUname("Uname");

        Authorities authorities2 = new Authorities();
        authorities2.setAuthority("JaneDoe");
        authorities2.setUname("Uname");
        authorities2.setUser(user1);
        when(authoritiesRepo.findByUser_id(anyInt())).thenReturn(authorities2);
        assertSame(authorities2, authorityService.findAuthority(1));
        verify(authoritiesRepo).findByUser_id(anyInt());
    }
}

